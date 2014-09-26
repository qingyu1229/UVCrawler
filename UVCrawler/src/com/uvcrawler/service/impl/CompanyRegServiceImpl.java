package com.uvcrawler.service.impl;

import java.util.List;

import com.uvcrawler.service.CompanyRegService;
import com.uvcrawler.vo.Reg_company;
import com.uvcrawler.vo.Reg_companyExample;
import com.uvcrawler.vo.client.Reg_companyMapper;

public class CompanyRegServiceImpl implements CompanyRegService {

	private Reg_companyMapper reg_companyMapper;
	

	@Override
	public boolean addReg(Reg_company reg) {
		int i=reg_companyMapper.insert(reg);
		return i>0;
	}

	@Override
	public List<Reg_company> getAllRegs() {
		return  reg_companyMapper.selectByExample(null);
	}

	@Override
	public Reg_company getRegByWebsiteId(int id) {
		Reg_companyExample example=new Reg_companyExample();
		example.createCriteria().andWebsiteIdEqualTo(id);
		List<Reg_company> list= reg_companyMapper.selectByExample(example);
		if(list!=null){
			return list.get(0);
		}
		return null;
	}

	public void setReg_companyMapper(Reg_companyMapper reg_companyMapper) {
		this.reg_companyMapper = reg_companyMapper;
	}

}
