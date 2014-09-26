package com.uvcrawler.vo.client;

import com.uvcrawler.vo.ShouldVisitFilter;
import com.uvcrawler.vo.ShouldVisitFilterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShouldVisitFilterMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_shouldvisit
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int countByExample(ShouldVisitFilterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_shouldvisit
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int deleteByExample(ShouldVisitFilterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_shouldvisit
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_shouldvisit
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int insert(ShouldVisitFilter record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_shouldvisit
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int insertSelective(ShouldVisitFilter record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_shouldvisit
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	List<ShouldVisitFilter> selectByExample(ShouldVisitFilterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_shouldvisit
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	ShouldVisitFilter selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_shouldvisit
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByExampleSelective(@Param("record") ShouldVisitFilter record,
			@Param("example") ShouldVisitFilterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_shouldvisit
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByExample(@Param("record") ShouldVisitFilter record,
			@Param("example") ShouldVisitFilterExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_shouldvisit
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByPrimaryKeySelective(ShouldVisitFilter record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_shouldvisit
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByPrimaryKey(ShouldVisitFilter record);
}