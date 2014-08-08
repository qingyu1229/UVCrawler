package com.uvcrawler.entity;

import java.util.Date;

public class Company {
	/**
	 * 公司id
	 */
	private int id;
	/**
	 * 公司名称
	 */
	private String name;
	/**
	 * 行业
	 */
	private String industry;
	/**
	 * 公司所属省份
	 */
	private String provice;
	/**
	 * 公司所属城市
	 */
	private String city;
	/**
	 * 公司所属乡镇
	 */
	private String town;
	/**
	 * 公司联系人
	 */
	private String linkman;
	/**
	 * 公司法人代表
	 */
	private String legalPersion;
	/**
	 * 主营产品
	 */
	private String main_products;
	/**
	 * 注册时间
	 */
	private Date regDate;
	/**
	 * 注册资金
	 */
	private int regMoney;
	/**
	 * 联系手机
	 */
	private String mobilePhone;
	/**
	 * 联系电话
	 */
	private String telePhone;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 传真
	 */
	private String fax;
	/**
	 * 网址
	 */
	private String website;
	/**
	 * 简介
	 */
	private String pro;
	/**
	 * 此条记录保存时间
	 */
	private Date storeDate;
	/**
	 * 员工人数
	 */
	private int empCount;
	/**
	 * 营业额（每年）
	 */
	private int turnover;
	/**
	 * 网址在黄页上的唯一标识
	 */
	private String website_outerid;
	/**
	 * 所属黄页
	 */
	private String paren_web;
	
	private int reg_id;
	
	public int getReg_id() {
		return reg_id;
	}
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getProvice() {
		return provice;
	}
	public void setProvice(String provice) {
		this.provice = provice;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	
	public String getLegalPersion() {
		return legalPersion;
	}
	public void setLegalPersion(String legalPersion) {
		this.legalPersion = legalPersion;
	}
	public String getMain_products() {
		return main_products;
	}
	public void setMain_products(String main_products) {
		this.main_products = main_products;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getRegMoney() {
		return regMoney;
	}
	public void setRegMoney(int regMoney) {
		this.regMoney = regMoney;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getTelePhone() {
		return telePhone;
	}
	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	public Date getStoreDate() {
		return storeDate;
	}
	public void setStoreDate(Date storeDate) {
		this.storeDate = storeDate;
	}
	public int getEmpCount() {
		return empCount;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
	
	public String getWebsite_outerid() {
		return website_outerid;
	}
	public void setWebsite_outerid(String website_outerid) {
		this.website_outerid = website_outerid;
	}
	public String getParen_web() {
		return paren_web;
	}
	public void setParen_web(String paren_web) {
		this.paren_web = paren_web;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", industry="
				+ industry + ", provice=" + provice + ", city=" + city
				+ ", town=" + town + ", linkman=" + linkman + ", legalPersion="
				+ legalPersion + ", main_products=" + main_products
				+ ", regDate=" + regDate + ", regMoney=" + regMoney
				+ ", mobilePhone=" + mobilePhone + ", telePhone=" + telePhone
				+ ", address=" + address + ", fax=" + fax + ", website="
				+ website + ", pro=" + pro + ", storeDate=" + storeDate
				+ ", empCount=" + empCount + ", turnover=" + turnover
				+ ", website_outerid=" + website_outerid + ", paren_web="
				+ paren_web + "]";
	}
}
