package com.uvcrawler.test;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.xerces.parsers.DOMParser;
import org.apache.xpath.XPathAPI;
import org.jsoup.Jsoup;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class NekohtmlTest {

	@Test
	public void Test1() {

		DOMParser parser = new DOMParser();
		NodeList products;
		try {

			String productsXpath = "/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr[6]/td/table/tbody/tr/td/div/text()";
			
			org.jsoup.nodes.Document _doc=Jsoup.connect("http://www.beijing.gov.cn/zfzx/qxrd/cyq/t1276036.htm").get();
			System.out.println(_doc);
			parser.parse(_doc.toString());
			Document doc = parser.getDocument();
			products = XPathAPI.selectNodeList(doc, productsXpath);
			System.out.println(XPathAPI.selectSingleNode(doc, productsXpath));
			String s= products.toString();
			System.out.println(s);

			
			
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
