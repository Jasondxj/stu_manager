package com.jason.model;

public class CoreKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.sno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String sno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.cno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String cno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.sno
     *
     * @return the value of core.sno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getSno() {
        return sno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.sno
     *
     * @param sno the value for core.sno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.cno
     *
     * @return the value of core.cno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getCno() {
        return cno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.cno
     *
     * @param cno the value for core.cno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }
}