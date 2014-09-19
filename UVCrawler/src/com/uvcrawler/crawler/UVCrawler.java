package com.uvcrawler.crawler;

import java.util.Map;

import com.uvcrawler.UVBasicCrawler;
import com.uvcrawler.vo.Reg_company;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;

public class UVCrawler extends UVBasicCrawler {

	private Map<Short,String> map;
	private Reg_company companyReg;
	
	public UVCrawler(Map<Short,String> map,Reg_company companyReg){
		this.map=map;
		this.companyReg=companyReg;
	}
	
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	public boolean shouldVisit(WebURL url) {
		return super.shouldVisit(url);
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
