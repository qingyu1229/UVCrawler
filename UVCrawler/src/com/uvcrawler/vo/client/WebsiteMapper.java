package com.uvcrawler.vo.client;

import com.uvcrawler.vo.Website;
import com.uvcrawler.vo.WebsiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_website
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int countByExample(WebsiteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_website
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int deleteByExample(WebsiteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_website
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_website
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int insert(Website record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_website
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int insertSelective(Website record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_website
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	List<Website> selectByExample(WebsiteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_website
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	Website selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_website
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByExampleSelective(@Param("record") Website record,
			@Param("example") WebsiteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_website
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByExample(@Param("record") Website record,
			@Param("example") WebsiteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_website
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByPrimaryKeySelective(Website record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_website
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByPrimaryKey(Website record);
}
