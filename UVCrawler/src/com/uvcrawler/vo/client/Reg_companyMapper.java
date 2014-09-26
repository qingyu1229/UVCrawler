package com.uvcrawler.vo.client;

import com.uvcrawler.vo.Reg_company;
import com.uvcrawler.vo.Reg_companyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Reg_companyMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_reg_company
	 * @mbggenerated  Fri Sep 26 15:31:39 CST 2014
	 */
	int countByExample(Reg_companyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_reg_company
	 * @mbggenerated  Fri Sep 26 15:31:39 CST 2014
	 */
	int deleteByExample(Reg_companyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_reg_company
	 * @mbggenerated  Fri Sep 26 15:31:39 CST 2014
	 */
	int deleteByPrimaryKey(Integer regId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_reg_company
	 * @mbggenerated  Fri Sep 26 15:31:39 CST 2014
	 */
	int insert(Reg_company record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_reg_company
	 * @mbggenerated  Fri Sep 26 15:31:39 CST 2014
	 */
	int insertSelective(Reg_company record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_reg_company
	 * @mbggenerated  Fri Sep 26 15:31:39 CST 2014
	 */
	List<Reg_company> selectByExample(Reg_companyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_reg_company
	 * @mbggenerated  Fri Sep 26 15:31:39 CST 2014
	 */
	Reg_company selectByPrimaryKey(Integer regId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_reg_company
	 * @mbggenerated  Fri Sep 26 15:31:39 CST 2014
	 */
	int updateByExampleSelective(@Param("record") Reg_company record,
			@Param("example") Reg_companyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_reg_company
	 * @mbggenerated  Fri Sep 26 15:31:39 CST 2014
	 */
	int updateByExample(@Param("record") Reg_company record,
			@Param("example") Reg_companyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_reg_company
	 * @mbggenerated  Fri Sep 26 15:31:39 CST 2014
	 */
	int updateByPrimaryKeySelective(Reg_company record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_reg_company
	 * @mbggenerated  Fri Sep 26 15:31:39 CST 2014
	 */
	int updateByPrimaryKey(Reg_company record);
}
