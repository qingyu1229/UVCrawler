package com.uvcrawler.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.junit.Test;

import com.uvcrawler.selector.Html;

public class SelectorTest {
	
	@Test
	public void xjsoup_test(){
		String ss="";
		
		try {
			ss=Jsoup.connect("http://www.beijing.gov.cn/zfzx/qxrd/cyq/t1276036.htm").get().toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  String htmlStr = "<div><h1>test<a href=\"xxx\">aabbcc</a></h1></div>";
		  Html html= Html.create(ss);
		 String s=  html.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr[6]/td/table/tbody/tr/td/div/text()").toString();
		  System.out.println(s);
		  
	}
}
