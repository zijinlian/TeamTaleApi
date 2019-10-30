package com.work.mapper;

import com.work.entity.TbUserCommonFiles;
import com.work.entity.TbUserCommonFilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserCommonFilesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_COMMON_FILES
     *
     * @mbggenerated Thu May 04 10:49:23 CST 2017
     */
    int countByExample(TbUserCommonFilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_COMMON_FILES
     *
     * @mbggenerated Thu May 04 10:49:23 CST 2017
     */
    int deleteByExample(TbUserCommonFilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_COMMON_FILES
     *
     * @mbggenerated Thu May 04 10:49:23 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_COMMON_FILES
     *
     * @mbggenerated Thu May 04 10:49:23 CST 2017
     */
    int insert(TbUserCommonFiles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_COMMON_FILES
     *
     * @mbggenerated Thu May 04 10:49:23 CST 2017
     */
    int insertSelective(TbUserCommonFiles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_COMMON_FILES
     *
     * @mbggenerated Thu May 04 10:49:23 CST 2017
     */
    List<TbUserCommonFiles> selectByExample(TbUserCommonFilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_COMMON_FILES
     *
     * @mbggenerated Thu May 04 10:49:23 CST 2017
     */
    TbUserCommonFiles selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_COMMON_FILES
     *
     * @mbggenerated Thu May 04 10:49:23 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbUserCommonFiles record, @Param("example") TbUserCommonFilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_COMMON_FILES
     *
     * @mbggenerated Thu May 04 10:49:23 CST 2017
     */
    int updateByExample(@Param("record") TbUserCommonFiles record, @Param("example") TbUserCommonFilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_COMMON_FILES
     *
     * @mbggenerated Thu May 04 10:49:23 CST 2017
     */
    int updateByPrimaryKeySelective(TbUserCommonFiles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USER_COMMON_FILES
     *
     * @mbggenerated Thu May 04 10:49:23 CST 2017
     */
    int updateByPrimaryKey(TbUserCommonFiles record);
}