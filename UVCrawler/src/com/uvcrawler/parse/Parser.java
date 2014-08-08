package com.uvcrawler.parse;

import java.util.Map;

public interface Parser {
	
	public Map<String,String> parserToMap(String htmlStr);
}
