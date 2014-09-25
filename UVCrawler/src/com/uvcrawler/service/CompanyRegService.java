package com.uvcrawler.service;

import java.util.List;

import com.uvcrawler.vo.Reg_company;

public interface CompanyRegService {
	
	/**
	 * 添加抽取规则
	 * @param reg
	 * @return
	 */
	public boolean addReg(Reg_company reg);
	
	/**
	 * 获取所有的抽取规则
	 * @return
	 */
	public List<Reg_company> getAllRegs();
	
	/**
	 * 依据website_id获取抽取规则
	 * @param id
	 * @return
	 */
	public Reg_company getRegByWebsiteId(int website_id);
	
	
}
