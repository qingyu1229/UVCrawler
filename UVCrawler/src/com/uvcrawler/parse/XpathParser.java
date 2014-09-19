package com.uvcrawler.parse;

import java.util.Date;
import java.util.Map;

import com.uvcrawler.selector.XpathSelector;
import com.uvcrawler.vo.Company;
import com.uvcrawler.vo.Reg_company;

public class XpathParser implements Parser {

	private Reg_company companyReg;
	
	public XpathParser(Reg_company companyReg){
		this.companyReg=companyReg;
	}
	
	
	@Override
	public Map<String, String> parserToMap(String htmlStr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company parserToObject(String htmlStr) {
		Company company=new Company();
		
		XpathSelector xpathSelector=new XpathSelector(htmlStr);
		
		company.setAddress( xpathSelector.select(companyReg.getRegAddress()));
		company.setCity("");
		company.setEmpCount("");
		company.setFax("");
		//company.setFileindexed();
		company.setIndustry("");
		company.setLegalPersion("");
		company.setLinkman("");
		company.setMainProducts("");
		company.setMobilephone("");
		company.setName("");
		company.setParentWeb("");
		company.setPro("");
		company.setProvice("");
		company.setRegDate(new Date());
		company.setRegMoney(0);
		company.setStoredate(new Date());
		company.setTelephone("");
		company.setTown("");
		company.setTurnover("");
		company.setWebsite("");
		company.setWebsiteOuterid("");
		
		return null;
	}

}
