package com.uvcrawler.crawler;

import java.util.List;
import java.util.Map;

import com.uvcrawler.UVBasicCrawler;
import com.uvcrawler.store.ShouldVisitPageStore;
import com.uvcrawler.vo.Reg_company;
import com.uvcrawler.vo.ShouldVisitFilter;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;

public class UVCrawler extends UVBasicCrawler {

	@Override
	public void onStart() {
		super.onStart();
	}

	@Override
	public boolean shouldVisit(WebURL url) {
		String href = url.getURL().toLowerCase();
		List<ShouldVisitFilter> filters= ShouldVisitPageStore.getInstance().getFilterByDomain(url.getDomain());
		return shouldVisit(filters,href);
	}

	@Override
	public void visit(Page page) {
		if (page.getParseData() instanceof HtmlParseData) {
			HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
			String text = htmlParseData.getText();
			String html = htmlParseData.getHtml();
			
			System.out.println("Text length: " + text.length());
			System.out.println("Html length: " + html.length());
		}
	}

	@Override
	public void onBeforeExit() {
		super.onBeforeExit();
	}
}
