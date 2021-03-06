package com.uvcrawler;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.uvcrawler.vo.ShouldVisitFilter;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;

public class UVBasicCrawler extends WebCrawler {
	private final static Pattern FILTERS = Pattern
			.compile(".*(\\.(css|js|bmp|gif|jpe?g"
					+ "|png|tiff?|mid|mp2|mp3|mp4"
					+ "|wav|avi|mov|mpeg|ram|m4v|pdf"
					+ "|rm|smil|wmv|swf|wma|zip|rar|gz))$");

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	/**
	 * You should implement this function to specify whether the given url
	 * should be crawled or not (based on your crawling logic).
	 */
	@Override
	public boolean shouldVisit(WebURL url) {
		String href = url.getURL().toLowerCase();
		return !FILTERS.matcher(href).matches();
	}

	public boolean shouldVisit(List<ShouldVisitFilter> filters, String url) {

		if (FILTERS.matcher(url).matches()) {
			return false;
		}
		for (int i = 0; i < filters.size(); i++) {
			ShouldVisitFilter filter = filters.get(i);
			short type = filter.getFiltertype();
			String filterString = filter.getFilterstring();
			
			/**
			 * 以filterString开头
			 */
			if (type == 0) {
				return url.startsWith(filterString);
			}
			/**
			 * 以filterString结尾
			 */
			if (type == 1) {
				return url.endsWith(filterString);
			}
			/**
			 * 正则匹配
			 */
			if (type == 2) {
				return url.matches(filterString);
			}
		}
		return false;
	}

	/**
	 * 此处可以设置抓取时每一个深度按照一定的规则进行抓取
	 * 
	 * @param url
	 * @param map
	 * @return
	 */
	protected boolean shouldVisitOnDepth(WebURL url, Map<Short, String> map) {
		short depth = url.getDepth();
		if (map.get(depth) == null) {
			return true;
		}
		String f_domain = map.get(depth);
		if (url.getURL().contains(f_domain)) {
			return true;
		}
		return false;
	}

	/**
	 * This function is called when a page is fetched and ready to be processed
	 * by your program.
	 */
	@Override
	public void visit(Page page) {
		int docid = page.getWebURL().getDocid();
		String url = page.getWebURL().getURL();
		String domain = page.getWebURL().getDomain();
		String path = page.getWebURL().getPath();
		String subDomain = page.getWebURL().getSubDomain();
		String parentUrl = page.getWebURL().getParentUrl();

		System.out.println("Docid: " + docid);
		System.out.println("URL: " + url);
		System.out.println("Domain: '" + domain + "'");
		System.out.println("Sub-domain: '" + subDomain + "'");
		System.out.println("Path: '" + path + "'");
		System.out.println("Parent page: " + parentUrl);

		if (page.getParseData() instanceof HtmlParseData) {
			HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
			String text = htmlParseData.getText();
			String html = htmlParseData.getHtml();
			List<WebURL> links = htmlParseData.getOutgoingUrls();

			System.out.println("Text length: " + text.length());
			System.out.println("Html length: " + html.length());
			System.out.println("Number of outgoing links: " + links.size());
		}
		System.out.println("=============");
	}

	@Override
	public void onBeforeExit() {
		// TODO Auto-generated method stub
		super.onBeforeExit();
	}

}
