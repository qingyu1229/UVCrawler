package com.uvcrawler.vo.client;

import com.uvcrawler.vo.Proxy;
import com.uvcrawler.vo.ProxyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProxyMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_proxy
	 * @mbggenerated  Thu Sep 25 22:18:07 CST 2014
	 */
	int countByExample(ProxyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_proxy
	 * @mbggenerated  Thu Sep 25 22:18:07 CST 2014
	 */
	int deleteByExample(ProxyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_proxy
	 * @mbggenerated  Thu Sep 25 22:18:07 CST 2014
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_proxy
	 * @mbggenerated  Thu Sep 25 22:18:07 CST 2014
	 */
	int insert(Proxy record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_proxy
	 * @mbggenerated  Thu Sep 25 22:18:07 CST 2014
	 */
	int insertSelective(Proxy record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_proxy
	 * @mbggenerated  Thu Sep 25 22:18:07 CST 2014
	 */
	List<Proxy> selectByExample(ProxyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_proxy
	 * @mbggenerated  Thu Sep 25 22:18:07 CST 2014
	 */
	Proxy selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_proxy
	 * @mbggenerated  Thu Sep 25 22:18:07 CST 2014
	 */
	int updateByExampleSelective(@Param("record") Proxy record,
			@Param("example") ProxyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_proxy
	 * @mbggenerated  Thu Sep 25 22:18:07 CST 2014
	 */
	int updateByExample(@Param("record") Proxy record,
			@Param("example") ProxyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_proxy
	 * @mbggenerated  Thu Sep 25 22:18:07 CST 2014
	 */
	int updateByPrimaryKeySelective(Proxy record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_proxy
	 * @mbggenerated  Thu Sep 25 22:18:07 CST 2014
	 */
	int updateByPrimaryKey(Proxy record);
}