package com.uvcrawler.entity;

import java.util.Date;

/**
 * 2014/5/26
 * @author liangqingyu
 *
 */
public class CompanyReg {
	/**
	 * 公司id
	 */
	private int reg_id;
	/**
	 * 公司名称
	 */
	private String reg_name;
	
	
	/**
	 * 行业
	 */
	private String reg_industry;
	/**
	 * 公司所属省份
	 */
	private String reg_provice;
	/**
	 * 公司所属城市
	 */
	private String reg_city;
	/**
	 * 公司所属乡镇
	 */
	private String reg_town;
	/**
	 * 公司联系人
	 */
	private String reg_linkman;
	/**
	 * 公司法人代表
	 */
	private String reg_legalPersion;
	/**
	 * 主营产品
	 */
	private String reg_main_products;
	/**
	 * 注册时间
	 */
	private String reg_regDate;
	/**
	 * 注册资金
	 */
	private String reg_regMoney;
	/**
	 * 联系手机
	 */
	private String reg_mobilePhone;
	/**
	 * 联系电话
	 */
	private String reg_telePhone;
	/**
	 * 地址
	 */
	private String reg_address;
	/**
	 * 传真
	 */
	private String reg_fax;
	/**
	 * 网址
	 */
	private String reg_website;
	/**
	 * 简介
	 */
	private String reg_pro;
	/**
	 * 此条记录保存时间
	 */
	private String reg_storeDate;
	/**
	 * 员工人数
	 */
	private String reg_empCount;
	/**
	 * 营业额（每年）
	 */
	private String reg_turnover;
	/**
	 * 网址在黄页上的唯一标识
	 */
	private String reg_website_outerid;
	/**
	 * 所属黄页
	 */
	private String reg_paren_web;
	public int getReg_id() {
		return reg_id;
	}
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	public String getReg_name() {
		return reg_name;
	}
	public void setReg_name(String reg_name) {
		this.reg_name = reg_name;
	}
	public String getReg_industry() {
		return reg_industry;
	}
	public void setReg_industry(String reg_industry) {
		this.reg_industry = reg_industry;
	}
	public String getReg_provice() {
		return reg_provice;
	}
	public void setReg_provice(String reg_provice) {
		this.reg_provice = reg_provice;
	}
	public String getReg_city() {
		return reg_city;
	}
	public void setReg_city(String reg_city) {
		this.reg_city = reg_city;
	}
	public String getReg_town() {
		return reg_town;
	}
	public void setReg_town(String reg_town) {
		this.reg_town = reg_town;
	}
	public String getReg_linkman() {
		return reg_linkman;
	}
	public void setReg_linkman(String reg_linkman) {
		this.reg_linkman = reg_linkman;
	}
	public String getReg_legalPersion() {
		return reg_legalPersion;
	}
	public void setReg_legalPersion(String reg_legalPersion) {
		this.reg_legalPersion = reg_legalPersion;
	}
	public String getReg_main_products() {
		return reg_main_products;
	}
	public void setReg_main_products(String reg_main_products) {
		this.reg_main_products = reg_main_products;
	}
	public String getReg_regDate() {
		return reg_regDate;
	}
	public void setReg_regDate(String reg_regDate) {
		this.reg_regDate = reg_regDate;
	}
	public String getReg_regMoney() {
		return reg_regMoney;
	}
	public void setReg_regMoney(String reg_regMoney) {
		this.reg_regMoney = reg_regMoney;
	}
	public String getReg_mobilePhone() {
		return reg_mobilePhone;
	}
	public void setReg_mobilePhone(String reg_mobilePhone) {
		this.reg_mobilePhone = reg_mobilePhone;
	}
	public String getReg_telePhone() {
		return reg_telePhone;
	}
	public void setReg_telePhone(String reg_telePhone) {
		this.reg_telePhone = reg_telePhone;
	}
	public String getReg_address() {
		return reg_address;
	}
	public void setReg_address(String reg_address) {
		this.reg_address = reg_address;
	}
	public String getReg_fax() {
		return reg_fax;
	}
	public void setReg_fax(String reg_fax) {
		this.reg_fax = reg_fax;
	}
	public String getReg_website() {
		return reg_website;
	}
	public void setReg_website(String reg_website) {
		this.reg_website = reg_website;
	}
	public String getReg_pro() {
		return reg_pro;
	}
	public void setReg_pro(String reg_pro) {
		this.reg_pro = reg_pro;
	}
	public String getReg_storeDate() {
		return reg_storeDate;
	}
	public void setReg_storeDate(String reg_storeDate) {
		this.reg_storeDate = reg_storeDate;
	}
	public String getReg_empCount() {
		return reg_empCount;
	}
	public void setReg_empCount(String reg_empCount) {
		this.reg_empCount = reg_empCount;
	}
	public String getReg_turnover() {
		return reg_turnover;
	}
	public void setReg_turnover(String reg_turnover) {
		this.reg_turnover = reg_turnover;
	}
	public String getReg_website_outerid() {
		return reg_website_outerid;
	}
	public void setReg_website_outerid(String reg_website_outerid) {
		this.reg_website_outerid = reg_website_outerid;
	}
	public String getReg_paren_web() {
		return reg_paren_web;
	}
	public void setReg_paren_web(String reg_paren_web) {
		this.reg_paren_web = reg_paren_web;
	}
	@Override
	public String toString() {
		return "CompanyReg [reg_id=" + reg_id + ", reg_name=" + reg_name
				+ ", reg_industry=" + reg_industry + ", reg_provice="
				+ reg_provice + ", reg_city=" + reg_city + ", reg_town="
				+ reg_town + ", reg_linkman=" + reg_linkman
				+ ", reg_legalPersion=" + reg_legalPersion
				+ ", reg_main_products=" + reg_main_products + ", reg_regDate="
				+ reg_regDate + ", reg_regMoney=" + reg_regMoney
				+ ", reg_mobilePhone=" + reg_mobilePhone + ", reg_telePhone="
				+ reg_telePhone + ", reg_address=" + reg_address + ", reg_fax="
				+ reg_fax + ", reg_website=" + reg_website + ", reg_pro="
				+ reg_pro + ", reg_storeDate=" + reg_storeDate
				+ ", reg_empCount=" + reg_empCount + ", reg_turnover="
				+ reg_turnover + ", reg_website_outerid=" + reg_website_outerid
				+ ", reg_paren_web=" + reg_paren_web + "]";
	}
	
}
