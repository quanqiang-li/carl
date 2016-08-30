package com.carl.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNull() {
            addCriterion("STATUS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNotNull() {
            addCriterion("STATUS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeEqualTo(String value) {
            addCriterion("STATUS_CODE =", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotEqualTo(String value) {
            addCriterion("STATUS_CODE <>", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThan(String value) {
            addCriterion("STATUS_CODE >", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_CODE >=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThan(String value) {
            addCriterion("STATUS_CODE <", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThanOrEqualTo(String value) {
            addCriterion("STATUS_CODE <=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLike(String value) {
            addCriterion("STATUS_CODE like", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotLike(String value) {
            addCriterion("STATUS_CODE not like", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIn(List<String> values) {
            addCriterion("STATUS_CODE in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotIn(List<String> values) {
            addCriterion("STATUS_CODE not in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeBetween(String value1, String value2) {
            addCriterion("STATUS_CODE between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotBetween(String value1, String value2) {
            addCriterion("STATUS_CODE not between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusNameIsNull() {
            addCriterion("STATUS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStatusNameIsNotNull() {
            addCriterion("STATUS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStatusNameEqualTo(String value) {
            addCriterion("STATUS_NAME =", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotEqualTo(String value) {
            addCriterion("STATUS_NAME <>", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameGreaterThan(String value) {
            addCriterion("STATUS_NAME >", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_NAME >=", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameLessThan(String value) {
            addCriterion("STATUS_NAME <", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameLessThanOrEqualTo(String value) {
            addCriterion("STATUS_NAME <=", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameLike(String value) {
            addCriterion("STATUS_NAME like", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotLike(String value) {
            addCriterion("STATUS_NAME not like", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameIn(List<String> values) {
            addCriterion("STATUS_NAME in", values, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotIn(List<String> values) {
            addCriterion("STATUS_NAME not in", values, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameBetween(String value1, String value2) {
            addCriterion("STATUS_NAME between", value1, value2, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotBetween(String value1, String value2) {
            addCriterion("STATUS_NAME not between", value1, value2, "statusName");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("REGISTER_TIME =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("REGISTER_TIME <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("REGISTER_TIME >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTER_TIME >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("REGISTER_TIME <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("REGISTER_TIME <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("REGISTER_TIME in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("REGISTER_TIME not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("REGISTER_TIME between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("REGISTER_TIME not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andCurrentLoginTimeIsNull() {
            addCriterion("CURRENT_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCurrentLoginTimeIsNotNull() {
            addCriterion("CURRENT_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentLoginTimeEqualTo(Date value) {
            addCriterion("CURRENT_LOGIN_TIME =", value, "currentLoginTime");
            return (Criteria) this;
        }

        public Criteria andCurrentLoginTimeNotEqualTo(Date value) {
            addCriterion("CURRENT_LOGIN_TIME <>", value, "currentLoginTime");
            return (Criteria) this;
        }

        public Criteria andCurrentLoginTimeGreaterThan(Date value) {
            addCriterion("CURRENT_LOGIN_TIME >", value, "currentLoginTime");
            return (Criteria) this;
        }

        public Criteria andCurrentLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CURRENT_LOGIN_TIME >=", value, "currentLoginTime");
            return (Criteria) this;
        }

        public Criteria andCurrentLoginTimeLessThan(Date value) {
            addCriterion("CURRENT_LOGIN_TIME <", value, "currentLoginTime");
            return (Criteria) this;
        }

        public Criteria andCurrentLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("CURRENT_LOGIN_TIME <=", value, "currentLoginTime");
            return (Criteria) this;
        }

        public Criteria andCurrentLoginTimeIn(List<Date> values) {
            addCriterion("CURRENT_LOGIN_TIME in", values, "currentLoginTime");
            return (Criteria) this;
        }

        public Criteria andCurrentLoginTimeNotIn(List<Date> values) {
            addCriterion("CURRENT_LOGIN_TIME not in", values, "currentLoginTime");
            return (Criteria) this;
        }

        public Criteria andCurrentLoginTimeBetween(Date value1, Date value2) {
            addCriterion("CURRENT_LOGIN_TIME between", value1, value2, "currentLoginTime");
            return (Criteria) this;
        }

        public Criteria andCurrentLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("CURRENT_LOGIN_TIME not between", value1, value2, "currentLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("LAST_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("LAST_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("LAST_LOGIN_TIME >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("LAST_LOGIN_TIME <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("LAST_LOGIN_TIME in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("LAST_LOGIN_TIME not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_TIME between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_TIME not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andRetryIsNull() {
            addCriterion("RETRY is null");
            return (Criteria) this;
        }

        public Criteria andRetryIsNotNull() {
            addCriterion("RETRY is not null");
            return (Criteria) this;
        }

        public Criteria andRetryEqualTo(Integer value) {
            addCriterion("RETRY =", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryNotEqualTo(Integer value) {
            addCriterion("RETRY <>", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryGreaterThan(Integer value) {
            addCriterion("RETRY >", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryGreaterThanOrEqualTo(Integer value) {
            addCriterion("RETRY >=", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryLessThan(Integer value) {
            addCriterion("RETRY <", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryLessThanOrEqualTo(Integer value) {
            addCriterion("RETRY <=", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryIn(List<Integer> values) {
            addCriterion("RETRY in", values, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryNotIn(List<Integer> values) {
            addCriterion("RETRY not in", values, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryBetween(Integer value1, Integer value2) {
            addCriterion("RETRY between", value1, value2, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryNotBetween(Integer value1, Integer value2) {
            addCriterion("RETRY not between", value1, value2, "retry");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNull() {
            addCriterion("LOCK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNotNull() {
            addCriterion("LOCK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLockTimeEqualTo(Date value) {
            addCriterion("LOCK_TIME =", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotEqualTo(Date value) {
            addCriterion("LOCK_TIME <>", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThan(Date value) {
            addCriterion("LOCK_TIME >", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCK_TIME >=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThan(Date value) {
            addCriterion("LOCK_TIME <", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOCK_TIME <=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeIn(List<Date> values) {
            addCriterion("LOCK_TIME in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotIn(List<Date> values) {
            addCriterion("LOCK_TIME not in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeBetween(Date value1, Date value2) {
            addCriterion("LOCK_TIME between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOCK_TIME not between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagIsNull() {
            addCriterion("REALNAME_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagIsNotNull() {
            addCriterion("REALNAME_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagEqualTo(String value) {
            addCriterion("REALNAME_FLAG =", value, "realnameFlag");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagNotEqualTo(String value) {
            addCriterion("REALNAME_FLAG <>", value, "realnameFlag");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagGreaterThan(String value) {
            addCriterion("REALNAME_FLAG >", value, "realnameFlag");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagGreaterThanOrEqualTo(String value) {
            addCriterion("REALNAME_FLAG >=", value, "realnameFlag");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagLessThan(String value) {
            addCriterion("REALNAME_FLAG <", value, "realnameFlag");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagLessThanOrEqualTo(String value) {
            addCriterion("REALNAME_FLAG <=", value, "realnameFlag");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagLike(String value) {
            addCriterion("REALNAME_FLAG like", value, "realnameFlag");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagNotLike(String value) {
            addCriterion("REALNAME_FLAG not like", value, "realnameFlag");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagIn(List<String> values) {
            addCriterion("REALNAME_FLAG in", values, "realnameFlag");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagNotIn(List<String> values) {
            addCriterion("REALNAME_FLAG not in", values, "realnameFlag");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagBetween(String value1, String value2) {
            addCriterion("REALNAME_FLAG between", value1, value2, "realnameFlag");
            return (Criteria) this;
        }

        public Criteria andRealnameFlagNotBetween(String value1, String value2) {
            addCriterion("REALNAME_FLAG not between", value1, value2, "realnameFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagIsNull() {
            addCriterion("TAX_AUTH_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagIsNotNull() {
            addCriterion("TAX_AUTH_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagEqualTo(String value) {
            addCriterion("TAX_AUTH_FLAG =", value, "taxAuthFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagNotEqualTo(String value) {
            addCriterion("TAX_AUTH_FLAG <>", value, "taxAuthFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagGreaterThan(String value) {
            addCriterion("TAX_AUTH_FLAG >", value, "taxAuthFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_AUTH_FLAG >=", value, "taxAuthFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagLessThan(String value) {
            addCriterion("TAX_AUTH_FLAG <", value, "taxAuthFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagLessThanOrEqualTo(String value) {
            addCriterion("TAX_AUTH_FLAG <=", value, "taxAuthFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagLike(String value) {
            addCriterion("TAX_AUTH_FLAG like", value, "taxAuthFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagNotLike(String value) {
            addCriterion("TAX_AUTH_FLAG not like", value, "taxAuthFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagIn(List<String> values) {
            addCriterion("TAX_AUTH_FLAG in", values, "taxAuthFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagNotIn(List<String> values) {
            addCriterion("TAX_AUTH_FLAG not in", values, "taxAuthFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagBetween(String value1, String value2) {
            addCriterion("TAX_AUTH_FLAG between", value1, value2, "taxAuthFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAuthFlagNotBetween(String value1, String value2) {
            addCriterion("TAX_AUTH_FLAG not between", value1, value2, "taxAuthFlag");
            return (Criteria) this;
        }

        public Criteria andSiteCodeIsNull() {
            addCriterion("SITE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSiteCodeIsNotNull() {
            addCriterion("SITE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSiteCodeEqualTo(String value) {
            addCriterion("SITE_CODE =", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeNotEqualTo(String value) {
            addCriterion("SITE_CODE <>", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeGreaterThan(String value) {
            addCriterion("SITE_CODE >", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_CODE >=", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeLessThan(String value) {
            addCriterion("SITE_CODE <", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeLessThanOrEqualTo(String value) {
            addCriterion("SITE_CODE <=", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeLike(String value) {
            addCriterion("SITE_CODE like", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeNotLike(String value) {
            addCriterion("SITE_CODE not like", value, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeIn(List<String> values) {
            addCriterion("SITE_CODE in", values, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeNotIn(List<String> values) {
            addCriterion("SITE_CODE not in", values, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeBetween(String value1, String value2) {
            addCriterion("SITE_CODE between", value1, value2, "siteCode");
            return (Criteria) this;
        }

        public Criteria andSiteCodeNotBetween(String value1, String value2) {
            addCriterion("SITE_CODE not between", value1, value2, "siteCode");
            return (Criteria) this;
        }

        public Criteria andBankMobileIsNull() {
            addCriterion("BANK_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andBankMobileIsNotNull() {
            addCriterion("BANK_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andBankMobileEqualTo(String value) {
            addCriterion("BANK_MOBILE =", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileNotEqualTo(String value) {
            addCriterion("BANK_MOBILE <>", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileGreaterThan(String value) {
            addCriterion("BANK_MOBILE >", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_MOBILE >=", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileLessThan(String value) {
            addCriterion("BANK_MOBILE <", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileLessThanOrEqualTo(String value) {
            addCriterion("BANK_MOBILE <=", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileLike(String value) {
            addCriterion("BANK_MOBILE like", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileNotLike(String value) {
            addCriterion("BANK_MOBILE not like", value, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileIn(List<String> values) {
            addCriterion("BANK_MOBILE in", values, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileNotIn(List<String> values) {
            addCriterion("BANK_MOBILE not in", values, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileBetween(String value1, String value2) {
            addCriterion("BANK_MOBILE between", value1, value2, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andBankMobileNotBetween(String value1, String value2) {
            addCriterion("BANK_MOBILE not between", value1, value2, "bankMobile");
            return (Criteria) this;
        }

        public Criteria andNsrsbhIsNull() {
            addCriterion("NSRSBH is null");
            return (Criteria) this;
        }

        public Criteria andNsrsbhIsNotNull() {
            addCriterion("NSRSBH is not null");
            return (Criteria) this;
        }

        public Criteria andNsrsbhEqualTo(String value) {
            addCriterion("NSRSBH =", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhNotEqualTo(String value) {
            addCriterion("NSRSBH <>", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhGreaterThan(String value) {
            addCriterion("NSRSBH >", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhGreaterThanOrEqualTo(String value) {
            addCriterion("NSRSBH >=", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhLessThan(String value) {
            addCriterion("NSRSBH <", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhLessThanOrEqualTo(String value) {
            addCriterion("NSRSBH <=", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhLike(String value) {
            addCriterion("NSRSBH like", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhNotLike(String value) {
            addCriterion("NSRSBH not like", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhIn(List<String> values) {
            addCriterion("NSRSBH in", values, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhNotIn(List<String> values) {
            addCriterion("NSRSBH not in", values, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhBetween(String value1, String value2) {
            addCriterion("NSRSBH between", value1, value2, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhNotBetween(String value1, String value2) {
            addCriterion("NSRSBH not between", value1, value2, "nsrsbh");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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