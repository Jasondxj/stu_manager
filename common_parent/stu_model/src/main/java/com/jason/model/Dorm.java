package com.jason.model;

public class Dorm {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dorm.dno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String dno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dorm.buildingNo
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String buildingno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dorm.doorNo
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String doorno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dorm.totalNum
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private Integer totalnum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dorm.dno
     *
     * @return the value of dorm.dno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getDno() {
        return dno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dorm.dno
     *
     * @param dno the value for dorm.dno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setDno(String dno) {
        this.dno = dno == null ? null : dno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dorm.buildingNo
     *
     * @return the value of dorm.buildingNo
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getBuildingno() {
        return buildingno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dorm.buildingNo
     *
     * @param buildingno the value for dorm.buildingNo
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setBuildingno(String buildingno) {
        this.buildingno = buildingno == null ? null : buildingno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dorm.doorNo
     *
     * @return the value of dorm.doorNo
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getDoorno() {
        return doorno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dorm.doorNo
     *
     * @param doorno the value for dorm.doorNo
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setDoorno(String doorno) {
        this.doorno = doorno == null ? null : doorno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dorm.totalNum
     *
     * @return the value of dorm.totalNum
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public Integer getTotalnum() {
        return totalnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dorm.totalNum
     *
     * @param totalnum the value for dorm.totalNum
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setTotalnum(Integer totalnum) {
        this.totalnum = totalnum;
    }
}