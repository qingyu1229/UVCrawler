package com.uvcrawler.crawler;

import java.util.List;
import java.util.Map;

import com.uvcrawler.UVBasicCrawler;
import com.uvcrawler.entity.CompanyReg;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;

public class UVCrawler extends UVBasicCrawler {

	private Map<Short,String> map;
	private CompanyReg compantReg;
	
	public UVCrawler(Map<Short,String> map,CompanyReg compantReg){
		this.map=map;
		this.compantReg=compantReg;
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
		// TODO Auto-generated method stub
		super.onBeforeExit();
	}

	
	
	
}
