package com.work.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbPepmgmLeaderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    public TbPepmgmLeaderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFdEmpidIsNull() {
            addCriterion("FD_EMPID is null");
            return (Criteria) this;
        }

        public Criteria andFdEmpidIsNotNull() {
            addCriterion("FD_EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andFdEmpidEqualTo(String value) {
            addCriterion("FD_EMPID =", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidNotEqualTo(String value) {
            addCriterion("FD_EMPID <>", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidGreaterThan(String value) {
            addCriterion("FD_EMPID >", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("FD_EMPID >=", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidLessThan(String value) {
            addCriterion("FD_EMPID <", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidLessThanOrEqualTo(String value) {
            addCriterion("FD_EMPID <=", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidLike(String value) {
            addCriterion("FD_EMPID like", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidNotLike(String value) {
            addCriterion("FD_EMPID not like", value, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidIn(List<String> values) {
            addCriterion("FD_EMPID in", values, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidNotIn(List<String> values) {
            addCriterion("FD_EMPID not in", values, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidBetween(String value1, String value2) {
            addCriterion("FD_EMPID between", value1, value2, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdEmpidNotBetween(String value1, String value2) {
            addCriterion("FD_EMPID not between", value1, value2, "fdEmpid");
            return (Criteria) this;
        }

        public Criteria andFdLevelIsNull() {
            addCriterion("FD_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andFdLevelIsNotNull() {
            addCriterion("FD_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andFdLevelEqualTo(BigDecimal value) {
            addCriterion("FD_LEVEL =", value, "fdLevel");
            return (Criteria) this;
        }

        public Criteria andFdLevelNotEqualTo(BigDecimal value) {
            addCriterion("FD_LEVEL <>", value, "fdLevel");
            return (Criteria) this;
        }

        public Criteria andFdLevelGreaterThan(BigDecimal value) {
            addCriterion("FD_LEVEL >", value, "fdLevel");
            return (Criteria) this;
        }

        public Criteria andFdLevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FD_LEVEL >=", value, "fdLevel");
            return (Criteria) this;
        }

        public Criteria andFdLevelLessThan(BigDecimal value) {
            addCriterion("FD_LEVEL <", value, "fdLevel");
            return (Criteria) this;
        }

        public Criteria andFdLevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FD_LEVEL <=", value, "fdLevel");
            return (Criteria) this;
        }

        public Criteria andFdLevelIn(List<BigDecimal> values) {
            addCriterion("FD_LEVEL in", values, "fdLevel");
            return (Criteria) this;
        }

        public Criteria andFdLevelNotIn(List<BigDecimal> values) {
            addCriterion("FD_LEVEL not in", values, "fdLevel");
            return (Criteria) this;
        }

        public Criteria andFdLevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FD_LEVEL between", value1, value2, "fdLevel");
            return (Criteria) this;
        }

        public Criteria andFdLevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FD_LEVEL not between", value1, value2, "fdLevel");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpIsNull() {
            addCriterion("FD_PARENT_EMP is null");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpIsNotNull() {
            addCriterion("FD_PARENT_EMP is not null");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpEqualTo(String value) {
            addCriterion("FD_PARENT_EMP =", value, "fdParentEmp");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpNotEqualTo(String value) {
            addCriterion("FD_PARENT_EMP <>", value, "fdParentEmp");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpGreaterThan(String value) {
            addCriterion("FD_PARENT_EMP >", value, "fdParentEmp");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpGreaterThanOrEqualTo(String value) {
            addCriterion("FD_PARENT_EMP >=", value, "fdParentEmp");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpLessThan(String value) {
            addCriterion("FD_PARENT_EMP <", value, "fdParentEmp");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpLessThanOrEqualTo(String value) {
            addCriterion("FD_PARENT_EMP <=", value, "fdParentEmp");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpLike(String value) {
            addCriterion("FD_PARENT_EMP like", value, "fdParentEmp");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpNotLike(String value) {
            addCriterion("FD_PARENT_EMP not like", value, "fdParentEmp");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpIn(List<String> values) {
            addCriterion("FD_PARENT_EMP in", values, "fdParentEmp");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpNotIn(List<String> values) {
            addCriterion("FD_PARENT_EMP not in", values, "fdParentEmp");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpBetween(String value1, String value2) {
            addCriterion("FD_PARENT_EMP between", value1, value2, "fdParentEmp");
            return (Criteria) this;
        }

        public Criteria andFdParentEmpNotBetween(String value1, String value2) {
            addCriterion("FD_PARENT_EMP not between", value1, value2, "fdParentEmp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated do_not_delete_during_merge Mon Jan 08 14:53:53 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_PEPMGM_LEADER
     *
     * @mbggenerated Mon Jan 08 14:53:53 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}