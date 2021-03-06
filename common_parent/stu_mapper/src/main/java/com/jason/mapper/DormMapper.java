package com.jason.mapper;

import com.jason.model.Dorm;
import com.jason.model.DormExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DormMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dorm
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    int countByExample(DormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dorm
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    int deleteByExample(DormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dorm
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    int deleteByPrimaryKey(String dno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dorm
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    int insert(Dorm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dorm
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    int insertSelective(Dorm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dorm
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    List<Dorm> selectByExample(DormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dorm
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    Dorm selectByPrimaryKey(String dno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dorm
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") Dorm record, @Param("example") DormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dorm
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    int updateByExample(@Param("record") Dorm record, @Param("example") DormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dorm
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    int updateByPrimaryKeySelective(Dorm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dorm
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    int updateByPrimaryKey(Dorm record);
}