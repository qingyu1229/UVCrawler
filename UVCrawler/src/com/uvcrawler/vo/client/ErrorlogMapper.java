package com.uvcrawler.vo.client;

import com.uvcrawler.vo.Errorlog;
import com.uvcrawler.vo.ErrorlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErrorlogMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int countByExample(ErrorlogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int deleteByExample(ErrorlogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int insert(Errorlog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int insertSelective(Errorlog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	List<Errorlog> selectByExampleWithBLOBs(ErrorlogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	List<Errorlog> selectByExample(ErrorlogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	Errorlog selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByExampleSelective(@Param("record") Errorlog record,
			@Param("example") ErrorlogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByExampleWithBLOBs(@Param("record") Errorlog record,
			@Param("example") ErrorlogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByExample(@Param("record") Errorlog record,
			@Param("example") ErrorlogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByPrimaryKeySelective(Errorlog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByPrimaryKeyWithBLOBs(Errorlog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table uv_errorlog
	 * @mbggenerated  Fri Sep 26 09:48:36 CST 2014
	 */
	int updateByPrimaryKey(Errorlog record);
}
