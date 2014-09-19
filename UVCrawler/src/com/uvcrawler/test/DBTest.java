package com.uvcrawler.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uvcrawler.vo.Company;
import com.uvcrawler.vo.client.CompanyMapper;

public class DBTest {

	@Test
	public void test() {
		ApplicationContext ctx=null;  
        ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
        
        CompanyMapper CompanyMapper=(CompanyMapper)ctx.getBean("companyMapper");  
        
        Company company=new Company();  
        company.setName("test_name");
        company.setLinkman("test_linkman");
        
        int i= CompanyMapper.insert(company);
        System.out.println(i);
	}

}
