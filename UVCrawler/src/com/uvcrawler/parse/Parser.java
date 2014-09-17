package com.uvcrawler.parse;

import java.util.Map;
import com.uvcrawler.entity.Company;

public interface Parser {
	
	public Map<String,String> parserToMap(String htmlStr);
	
	public Company parserToObject(String htmlStr);
}
