package com.work.mapper;

import com.work.entity.TbCodeTable;
import com.work.entity.TbCodeTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCodeTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CODE_TABLE
     *
     * @mbggenerated Thu May 04 16:49:02 CST 2017
     */
    int countByExample(TbCodeTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CODE_TABLE
     *
     * @mbggenerated Thu May 04 16:49:02 CST 2017
     */
    int deleteByExample(TbCodeTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CODE_TABLE
     *
     * @mbggenerated Thu May 04 16:49:02 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CODE_TABLE
     *
     * @mbggenerated Thu May 04 16:49:02 CST 2017
     */
    int insert(TbCodeTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CODE_TABLE
     *
     * @mbggenerated Thu May 04 16:49:02 CST 2017
     */
    int insertSelective(TbCodeTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CODE_TABLE
     *
     * @mbggenerated Thu May 04 16:49:02 CST 2017
     */
    List<TbCodeTable> selectByExample(TbCodeTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CODE_TABLE
     *
     * @mbggenerated Thu May 04 16:49:02 CST 2017
     */
    TbCodeTable selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CODE_TABLE
     *
     * @mbggenerated Thu May 04 16:49:02 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbCodeTable record, @Param("example") TbCodeTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CODE_TABLE
     *
     * @mbggenerated Thu May 04 16:49:02 CST 2017
     */
    int updateByExample(@Param("record") TbCodeTable record, @Param("example") TbCodeTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CODE_TABLE
     *
     * @mbggenerated Thu May 04 16:49:02 CST 2017
     */
    int updateByPrimaryKeySelective(TbCodeTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CODE_TABLE
     *
     * @mbggenerated Thu May 04 16:49:02 CST 2017
     */
    int updateByPrimaryKey(TbCodeTable record);
}