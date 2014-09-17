package com.uvcrawler.parse;

import java.util.Map;

import com.uvcrawler.entity.Company;
import com.uvcrawler.entity.CompanyReg;
import com.uvcrawler.selector.XpathSelector;

public class XpathParser implements Parser {

	private CompanyReg companyReg;
	
	public XpathParser(CompanyReg companyReg){
		this.companyReg=companyReg;
	}
	
	
	@Override
	public Map<String, String> parserToMap(String htmlStr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company parserToObject(String htmlStr) {
		XpathSelector xpathSelector=new XpathSelector(htmlStr);
		
		xpathSelector.select("");
		
		
		return null;
	}

}
