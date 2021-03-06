package com.work.mapper;

import com.work.entity.TbAppDailyNews;
import com.work.entity.TbAppDailyNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAppDailyNewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    int countByExample(TbAppDailyNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    int deleteByExample(TbAppDailyNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    int deleteByPrimaryKey(String fdNewsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    int insert(TbAppDailyNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    int insertSelective(TbAppDailyNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    List<TbAppDailyNews> selectByExampleWithBLOBs(TbAppDailyNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    List<TbAppDailyNews> selectByExample(TbAppDailyNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    TbAppDailyNews selectByPrimaryKey(String fdNewsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbAppDailyNews record, @Param("example") TbAppDailyNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") TbAppDailyNews record, @Param("example") TbAppDailyNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    int updateByExample(@Param("record") TbAppDailyNews record, @Param("example") TbAppDailyNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    int updateByPrimaryKeySelective(TbAppDailyNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(TbAppDailyNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_APP_DAILY_NEWS
     *
     * @mbggenerated Wed Apr 19 18:07:06 CST 2017
     */
    int updateByPrimaryKey(TbAppDailyNews record);
}