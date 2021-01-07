package com.shangma.cn.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterion("order_create_time =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("order_create_time <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterion("order_create_time >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_create_time >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterion("order_create_time <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_create_time <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterion("order_create_time in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("order_create_time not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("order_create_time between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_create_time not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Byte value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Byte value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Byte value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Byte value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Byte value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Byte> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Byte> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Byte value1, Byte value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderActionIsNull() {
            addCriterion("order_action is null");
            return (Criteria) this;
        }

        public Criteria andOrderActionIsNotNull() {
            addCriterion("order_action is not null");
            return (Criteria) this;
        }

        public Criteria andOrderActionEqualTo(Byte value) {
            addCriterion("order_action =", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionNotEqualTo(Byte value) {
            addCriterion("order_action <>", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionGreaterThan(Byte value) {
            addCriterion("order_action >", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_action >=", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionLessThan(Byte value) {
            addCriterion("order_action <", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionLessThanOrEqualTo(Byte value) {
            addCriterion("order_action <=", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionIn(List<Byte> values) {
            addCriterion("order_action in", values, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionNotIn(List<Byte> values) {
            addCriterion("order_action not in", values, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionBetween(Byte value1, Byte value2) {
            addCriterion("order_action between", value1, value2, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionNotBetween(Byte value1, Byte value2) {
            addCriterion("order_action not between", value1, value2, "orderAction");
            return (Criteria) this;
        }

        public Criteria andBussinessTypeIsNull() {
            addCriterion("bussiness_type is null");
            return (Criteria) this;
        }

        public Criteria andBussinessTypeIsNotNull() {
            addCriterion("bussiness_type is not null");
            return (Criteria) this;
        }

        public Criteria andBussinessTypeEqualTo(Byte value) {
            addCriterion("bussiness_type =", value, "bussinessType");
            return (Criteria) this;
        }

        public Criteria andBussinessTypeNotEqualTo(Byte value) {
            addCriterion("bussiness_type <>", value, "bussinessType");
            return (Criteria) this;
        }

        public Criteria andBussinessTypeGreaterThan(Byte value) {
            addCriterion("bussiness_type >", value, "bussinessType");
            return (Criteria) this;
        }

        public Criteria andBussinessTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("bussiness_type >=", value, "bussinessType");
            return (Criteria) this;
        }

        public Criteria andBussinessTypeLessThan(Byte value) {
            addCriterion("bussiness_type <", value, "bussinessType");
            return (Criteria) this;
        }

        public Criteria andBussinessTypeLessThanOrEqualTo(Byte value) {
            addCriterion("bussiness_type <=", value, "bussinessType");
            return (Criteria) this;
        }

        public Criteria andBussinessTypeIn(List<Byte> values) {
            addCriterion("bussiness_type in", values, "bussinessType");
            return (Criteria) this;
        }

        public Criteria andBussinessTypeNotIn(List<Byte> values) {
            addCriterion("bussiness_type not in", values, "bussinessType");
            return (Criteria) this;
        }

        public Criteria andBussinessTypeBetween(Byte value1, Byte value2) {
            addCriterion("bussiness_type between", value1, value2, "bussinessType");
            return (Criteria) this;
        }

        public Criteria andBussinessTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("bussiness_type not between", value1, value2, "bussinessType");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Byte value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Byte value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Byte value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Byte value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Byte value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Byte> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Byte> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Byte value1, Byte value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andReceiverTelIsNull() {
            addCriterion("receiver_tel is null");
            return (Criteria) this;
        }

        public Criteria andReceiverTelIsNotNull() {
            addCriterion("receiver_tel is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverTelEqualTo(String value) {
            addCriterion("receiver_tel =", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelNotEqualTo(String value) {
            addCriterion("receiver_tel <>", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelGreaterThan(String value) {
            addCriterion("receiver_tel >", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_tel >=", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelLessThan(String value) {
            addCriterion("receiver_tel <", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelLessThanOrEqualTo(String value) {
            addCriterion("receiver_tel <=", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelLike(String value) {
            addCriterion("receiver_tel like", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelNotLike(String value) {
            addCriterion("receiver_tel not like", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelIn(List<String> values) {
            addCriterion("receiver_tel in", values, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelNotIn(List<String> values) {
            addCriterion("receiver_tel not in", values, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelBetween(String value1, String value2) {
            addCriterion("receiver_tel between", value1, value2, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelNotBetween(String value1, String value2) {
            addCriterion("receiver_tel not between", value1, value2, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNull() {
            addCriterion("receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNotNull() {
            addCriterion("receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneEqualTo(String value) {
            addCriterion("receiver_phone =", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotEqualTo(String value) {
            addCriterion("receiver_phone <>", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThan(String value) {
            addCriterion("receiver_phone >", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_phone >=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThan(String value) {
            addCriterion("receiver_phone <", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThanOrEqualTo(String value) {
            addCriterion("receiver_phone <=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLike(String value) {
            addCriterion("receiver_phone like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotLike(String value) {
            addCriterion("receiver_phone not like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIn(List<String> values) {
            addCriterion("receiver_phone in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotIn(List<String> values) {
            addCriterion("receiver_phone not in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneBetween(String value1, String value2) {
            addCriterion("receiver_phone between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotBetween(String value1, String value2) {
            addCriterion("receiver_phone not between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNull() {
            addCriterion("postal_code is null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNotNull() {
            addCriterion("postal_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(String value) {
            addCriterion("postal_code =", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotEqualTo(String value) {
            addCriterion("postal_code <>", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThan(String value) {
            addCriterion("postal_code >", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("postal_code >=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThan(String value) {
            addCriterion("postal_code <", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("postal_code <=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLike(String value) {
            addCriterion("postal_code like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotLike(String value) {
            addCriterion("postal_code not like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIn(List<String> values) {
            addCriterion("postal_code in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotIn(List<String> values) {
            addCriterion("postal_code not in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeBetween(String value1, String value2) {
            addCriterion("postal_code between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotBetween(String value1, String value2) {
            addCriterion("postal_code not between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLike(String value) {
            addCriterion("receiver_address like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneIsNull() {
            addCriterion("delivery_zone is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneIsNotNull() {
            addCriterion("delivery_zone is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneEqualTo(String value) {
            addCriterion("delivery_zone =", value, "deliveryZone");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneNotEqualTo(String value) {
            addCriterion("delivery_zone <>", value, "deliveryZone");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneGreaterThan(String value) {
            addCriterion("delivery_zone >", value, "deliveryZone");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_zone >=", value, "deliveryZone");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneLessThan(String value) {
            addCriterion("delivery_zone <", value, "deliveryZone");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneLessThanOrEqualTo(String value) {
            addCriterion("delivery_zone <=", value, "deliveryZone");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneLike(String value) {
            addCriterion("delivery_zone like", value, "deliveryZone");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneNotLike(String value) {
            addCriterion("delivery_zone not like", value, "deliveryZone");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneIn(List<String> values) {
            addCriterion("delivery_zone in", values, "deliveryZone");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneNotIn(List<String> values) {
            addCriterion("delivery_zone not in", values, "deliveryZone");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneBetween(String value1, String value2) {
            addCriterion("delivery_zone between", value1, value2, "deliveryZone");
            return (Criteria) this;
        }

        public Criteria andDeliveryZoneNotBetween(String value1, String value2) {
            addCriterion("delivery_zone not between", value1, value2, "deliveryZone");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNull() {
            addCriterion("delivery_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNotNull() {
            addCriterion("delivery_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeEqualTo(Byte value) {
            addCriterion("delivery_type =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(Byte value) {
            addCriterion("delivery_type <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(Byte value) {
            addCriterion("delivery_type >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("delivery_type >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(Byte value) {
            addCriterion("delivery_type <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(Byte value) {
            addCriterion("delivery_type <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<Byte> values) {
            addCriterion("delivery_type in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<Byte> values) {
            addCriterion("delivery_type not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(Byte value1, Byte value2) {
            addCriterion("delivery_type between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("delivery_type not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIsNull() {
            addCriterion("delivery_price is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIsNotNull() {
            addCriterion("delivery_price is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceEqualTo(BigDecimal value) {
            addCriterion("delivery_price =", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotEqualTo(BigDecimal value) {
            addCriterion("delivery_price <>", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceGreaterThan(BigDecimal value) {
            addCriterion("delivery_price >", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("delivery_price >=", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceLessThan(BigDecimal value) {
            addCriterion("delivery_price <", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("delivery_price <=", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIn(List<BigDecimal> values) {
            addCriterion("delivery_price in", values, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotIn(List<BigDecimal> values) {
            addCriterion("delivery_price not in", values, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delivery_price between", value1, value2, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delivery_price not between", value1, value2, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Byte value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Byte value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Byte value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Byte value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Byte value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Byte> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Byte> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Byte value1, Byte value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andOwnTakeTimeIsNull() {
            addCriterion("own_take_time is null");
            return (Criteria) this;
        }

        public Criteria andOwnTakeTimeIsNotNull() {
            addCriterion("own_take_time is not null");
            return (Criteria) this;
        }

        public Criteria andOwnTakeTimeEqualTo(Date value) {
            addCriterion("own_take_time =", value, "ownTakeTime");
            return (Criteria) this;
        }

        public Criteria andOwnTakeTimeNotEqualTo(Date value) {
            addCriterion("own_take_time <>", value, "ownTakeTime");
            return (Criteria) this;
        }

        public Criteria andOwnTakeTimeGreaterThan(Date value) {
            addCriterion("own_take_time >", value, "ownTakeTime");
            return (Criteria) this;
        }

        public Criteria andOwnTakeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("own_take_time >=", value, "ownTakeTime");
            return (Criteria) this;
        }

        public Criteria andOwnTakeTimeLessThan(Date value) {
            addCriterion("own_take_time <", value, "ownTakeTime");
            return (Criteria) this;
        }

        public Criteria andOwnTakeTimeLessThanOrEqualTo(Date value) {
            addCriterion("own_take_time <=", value, "ownTakeTime");
            return (Criteria) this;
        }

        public Criteria andOwnTakeTimeIn(List<Date> values) {
            addCriterion("own_take_time in", values, "ownTakeTime");
            return (Criteria) this;
        }

        public Criteria andOwnTakeTimeNotIn(List<Date> values) {
            addCriterion("own_take_time not in", values, "ownTakeTime");
            return (Criteria) this;
        }

        public Criteria andOwnTakeTimeBetween(Date value1, Date value2) {
            addCriterion("own_take_time between", value1, value2, "ownTakeTime");
            return (Criteria) this;
        }

        public Criteria andOwnTakeTimeNotBetween(Date value1, Date value2) {
            addCriterion("own_take_time not between", value1, value2, "ownTakeTime");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailIsNull() {
            addCriterion("receiver_email is null");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailIsNotNull() {
            addCriterion("receiver_email is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailEqualTo(String value) {
            addCriterion("receiver_email =", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailNotEqualTo(String value) {
            addCriterion("receiver_email <>", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailGreaterThan(String value) {
            addCriterion("receiver_email >", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_email >=", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailLessThan(String value) {
            addCriterion("receiver_email <", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailLessThanOrEqualTo(String value) {
            addCriterion("receiver_email <=", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailLike(String value) {
            addCriterion("receiver_email like", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailNotLike(String value) {
            addCriterion("receiver_email not like", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailIn(List<String> values) {
            addCriterion("receiver_email in", values, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailNotIn(List<String> values) {
            addCriterion("receiver_email not in", values, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailBetween(String value1, String value2) {
            addCriterion("receiver_email between", value1, value2, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailNotBetween(String value1, String value2) {
            addCriterion("receiver_email not between", value1, value2, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andRemitterIsNull() {
            addCriterion("remitter is null");
            return (Criteria) this;
        }

        public Criteria andRemitterIsNotNull() {
            addCriterion("remitter is not null");
            return (Criteria) this;
        }

        public Criteria andRemitterEqualTo(String value) {
            addCriterion("remitter =", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterNotEqualTo(String value) {
            addCriterion("remitter <>", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterGreaterThan(String value) {
            addCriterion("remitter >", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterGreaterThanOrEqualTo(String value) {
            addCriterion("remitter >=", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterLessThan(String value) {
            addCriterion("remitter <", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterLessThanOrEqualTo(String value) {
            addCriterion("remitter <=", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterLike(String value) {
            addCriterion("remitter like", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterNotLike(String value) {
            addCriterion("remitter not like", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterIn(List<String> values) {
            addCriterion("remitter in", values, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterNotIn(List<String> values) {
            addCriterion("remitter not in", values, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterBetween(String value1, String value2) {
            addCriterion("remitter between", value1, value2, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterNotBetween(String value1, String value2) {
            addCriterion("remitter not between", value1, value2, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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