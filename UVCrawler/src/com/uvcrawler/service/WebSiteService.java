package com.uvcrawler.service;

import java.util.List;

import com.uvcrawler.vo.Website;

public interface WebSiteService {
	/**
	 * 获取所有的Website
	 * @return
	 */
	public List<Website> getWebsites();
	
	/**
	 * 添加website
	 * @param website
	 * @return
	 */
	public boolean addWesite(Website website);
	
	
}
