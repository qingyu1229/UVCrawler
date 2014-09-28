package com.uvcrawler.selector;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

import com.uvcrawler.vo.Company;
import com.uvcrawler.vo.Reg_company;

/**
 * XPath selector based on HtmlCleaner.<br>
 * 
 * @author code4crafter@gmail.com <br>
 * @since 0.1.0
 */
public class XpathSelector implements Selector {

	private String xpathStr;

	public XpathSelector(String xpathStr) {
		this.xpathStr = xpathStr;
	}

	public XpathSelector() {
	}

	@Override
	public String select(String text) {
		HtmlCleaner htmlCleaner = new HtmlCleaner();
		TagNode tagNode = htmlCleaner.clean(text);
		if (tagNode == null) {
			return null;
		}
		try {
			Object[] objects = tagNode.evaluateXPath(xpathStr);
			if (objects != null && objects.length >= 1) {
				if (objects[0] instanceof TagNode) {
					TagNode tagNode1 = (TagNode) objects[0];
					return htmlCleaner.getInnerHtml(tagNode1);
				} else {
					return objects[0].toString();
				}
			}
		} catch (XPatherException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<String> selectList(String text) {
		HtmlCleaner htmlCleaner = new HtmlCleaner();
		TagNode tagNode = htmlCleaner.clean(text);
		if (tagNode == null) {
			return null;
		}
		List<String> results = new ArrayList<String>();
		try {
			Object[] objects = tagNode.evaluateXPath(xpathStr);
			if (objects != null && objects.length >= 1) {
				for (Object object : objects) {
					if (object instanceof TagNode) {
						TagNode tagNode1 = (TagNode) object;
						results.add(htmlCleaner.getInnerHtml(tagNode1));
					} else {
						results.add(object.toString());
					}
				}
			}
		} catch (XPatherException e) {
			e.printStackTrace();
		}
		return results;
	}

	@Override
	public String select(Reg_company reg, String htmlStr) {

		HtmlCleaner htmlCleaner = new HtmlCleaner();
		TagNode tagNode = htmlCleaner.clean(htmlStr);
		if (tagNode == null) {
			return null;
		}
		Company comp = new Company();
		comp.setName(oper(tagNode, reg.getRegName(), htmlCleaner));
		comp.setAddress(oper(tagNode, reg.getRegAddress(), htmlCleaner));
		comp.setCity(oper(tagNode, reg.getRegCity(), htmlCleaner));
		comp.setEmpCount(oper(tagNode, reg.getRegEmpCount(), htmlCleaner));
		comp.setFax(oper(tagNode, reg.getRegFax(), htmlCleaner));
		comp.setIndustry(oper(tagNode, reg.getRegIndustry(), htmlCleaner));
		comp.setLegalPersion(oper(tagNode, reg.getRegLegalPersion(), htmlCleaner));
		comp.setLinkman(oper(tagNode, reg.getRegLinkman(), htmlCleaner));
		comp.setMainProducts(oper(tagNode, reg.getRegMainProducts(), htmlCleaner));
		comp.setMobilephone(oper(tagNode, reg.getRegMobilephone(), htmlCleaner));
		//comp.setParentWeb("");
		comp.setPro(oper(tagNode, reg.getRegPro(), htmlCleaner));
		comp.setProvice(oper(tagNode, reg.getRegProvice(), htmlCleaner));
		//comp.setRegDate(new Date());
		//comp.setRegMoney(0);
		comp.setStoredate(new Date());
		comp.setTelephone(oper(tagNode, reg.getRegTelephone(), htmlCleaner));
		comp.setTown(oper(tagNode, reg.getRegTown(), htmlCleaner));
		comp.setTurnover(oper(tagNode, reg.getRegTurnover(), htmlCleaner));
		//comp.setWebsite("");
		//comp.setWebsiteOuterid("");
		
		return "";
	}

	private String oper(TagNode tagNode, String xpathString,
			HtmlCleaner htmlCleaner) {
		try {
			Object[] objects = tagNode.evaluateXPath(xpathString);
			if (objects != null && objects.length >= 1) {
				if (objects[0] instanceof TagNode) {
					TagNode tagNode1 = (TagNode) objects[0];
					return htmlCleaner.getInnerHtml(tagNode1);
				} else {
					return objects[0].toString();
				}
			}
		} catch (XPatherException e) {
			e.printStackTrace();
		}

		return "";
	}
}
