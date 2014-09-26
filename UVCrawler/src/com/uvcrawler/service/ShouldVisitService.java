package com.uvcrawler.service;

import java.util.List;

import com.uvcrawler.vo.ShouldVisitFilter;

public interface ShouldVisitService {
	
	/**
	 * 添加访问过滤器
	 * @param svf
	 * @return
	 */
	public boolean addFilter(ShouldVisitFilter svf);
	
	/**
	 * 依据website_id获取过滤规则
	 * @param website_id
	 * @return
	 */
	public ShouldVisitFilter getFilterByWebsiteId(int website_id);
	
	/**
	 * 获取所有过滤规则
	 * @return
	 */
	public List<ShouldVisitFilter> getFilters();
	
}
