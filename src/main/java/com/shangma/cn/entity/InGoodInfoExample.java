package com.shangma.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InGoodInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InGoodInfoExample() {
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

        public Criteria andInStoreIdIsNull() {
            addCriterion("in_store_id is null");
            return (Criteria) this;
        }

        public Criteria andInStoreIdIsNotNull() {
            addCriterion("in_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andInStoreIdEqualTo(Long value) {
            addCriterion("in_store_id =", value, "inStoreId");
            return (Criteria) this;
        }

        public Criteria andInStoreIdNotEqualTo(Long value) {
            addCriterion("in_store_id <>", value, "inStoreId");
            return (Criteria) this;
        }

        public Criteria andInStoreIdGreaterThan(Long value) {
            addCriterion("in_store_id >", value, "inStoreId");
            return (Criteria) this;
        }

        public Criteria andInStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("in_store_id >=", value, "inStoreId");
            return (Criteria) this;
        }

        public Criteria andInStoreIdLessThan(Long value) {
            addCriterion("in_store_id <", value, "inStoreId");
            return (Criteria) this;
        }

        public Criteria andInStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("in_store_id <=", value, "inStoreId");
            return (Criteria) this;
        }

        public Criteria andInStoreIdIn(List<Long> values) {
            addCriterion("in_store_id in", values, "inStoreId");
            return (Criteria) this;
        }

        public Criteria andInStoreIdNotIn(List<Long> values) {
            addCriterion("in_store_id not in", values, "inStoreId");
            return (Criteria) this;
        }

        public Criteria andInStoreIdBetween(Long value1, Long value2) {
            addCriterion("in_store_id between", value1, value2, "inStoreId");
            return (Criteria) this;
        }

        public Criteria andInStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("in_store_id not between", value1, value2, "inStoreId");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIsNull() {
            addCriterion("good_brand is null");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIsNotNull() {
            addCriterion("good_brand is not null");
            return (Criteria) this;
        }

        public Criteria andGoodBrandEqualTo(String value) {
            addCriterion("good_brand =", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotEqualTo(String value) {
            addCriterion("good_brand <>", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandGreaterThan(String value) {
            addCriterion("good_brand >", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandGreaterThanOrEqualTo(String value) {
            addCriterion("good_brand >=", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandLessThan(String value) {
            addCriterion("good_brand <", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandLessThanOrEqualTo(String value) {
            addCriterion("good_brand <=", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandLike(String value) {
            addCriterion("good_brand like", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotLike(String value) {
            addCriterion("good_brand not like", value, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandIn(List<String> values) {
            addCriterion("good_brand in", values, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotIn(List<String> values) {
            addCriterion("good_brand not in", values, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandBetween(String value1, String value2) {
            addCriterion("good_brand between", value1, value2, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodBrandNotBetween(String value1, String value2) {
            addCriterion("good_brand not between", value1, value2, "goodBrand");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodModelIsNull() {
            addCriterion("good_model is null");
            return (Criteria) this;
        }

        public Criteria andGoodModelIsNotNull() {
            addCriterion("good_model is not null");
            return (Criteria) this;
        }

        public Criteria andGoodModelEqualTo(String value) {
            addCriterion("good_model =", value, "goodModel");
            return (Criteria) this;
        }

        public Criteria andGoodModelNotEqualTo(String value) {
            addCriterion("good_model <>", value, "goodModel");
            return (Criteria) this;
        }

        public Criteria andGoodModelGreaterThan(String value) {
            addCriterion("good_model >", value, "goodModel");
            return (Criteria) this;
        }

        public Criteria andGoodModelGreaterThanOrEqualTo(String value) {
            addCriterion("good_model >=", value, "goodModel");
            return (Criteria) this;
        }

        public Criteria andGoodModelLessThan(String value) {
            addCriterion("good_model <", value, "goodModel");
            return (Criteria) this;
        }

        public Criteria andGoodModelLessThanOrEqualTo(String value) {
            addCriterion("good_model <=", value, "goodModel");
            return (Criteria) this;
        }

        public Criteria andGoodModelLike(String value) {
            addCriterion("good_model like", value, "goodModel");
            return (Criteria) this;
        }

        public Criteria andGoodModelNotLike(String value) {
            addCriterion("good_model not like", value, "goodModel");
            return (Criteria) this;
        }

        public Criteria andGoodModelIn(List<String> values) {
            addCriterion("good_model in", values, "goodModel");
            return (Criteria) this;
        }

        public Criteria andGoodModelNotIn(List<String> values) {
            addCriterion("good_model not in", values, "goodModel");
            return (Criteria) this;
        }

        public Criteria andGoodModelBetween(String value1, String value2) {
            addCriterion("good_model between", value1, value2, "goodModel");
            return (Criteria) this;
        }

        public Criteria andGoodModelNotBetween(String value1, String value2) {
            addCriterion("good_model not between", value1, value2, "goodModel");
            return (Criteria) this;
        }

        public Criteria andGoodColorIsNull() {
            addCriterion("good_color is null");
            return (Criteria) this;
        }

        public Criteria andGoodColorIsNotNull() {
            addCriterion("good_color is not null");
            return (Criteria) this;
        }

        public Criteria andGoodColorEqualTo(String value) {
            addCriterion("good_color =", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorNotEqualTo(String value) {
            addCriterion("good_color <>", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorGreaterThan(String value) {
            addCriterion("good_color >", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorGreaterThanOrEqualTo(String value) {
            addCriterion("good_color >=", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorLessThan(String value) {
            addCriterion("good_color <", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorLessThanOrEqualTo(String value) {
            addCriterion("good_color <=", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorLike(String value) {
            addCriterion("good_color like", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorNotLike(String value) {
            addCriterion("good_color not like", value, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorIn(List<String> values) {
            addCriterion("good_color in", values, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorNotIn(List<String> values) {
            addCriterion("good_color not in", values, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorBetween(String value1, String value2) {
            addCriterion("good_color between", value1, value2, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodColorNotBetween(String value1, String value2) {
            addCriterion("good_color not between", value1, value2, "goodColor");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIsNull() {
            addCriterion("good_supplier is null");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIsNotNull() {
            addCriterion("good_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierEqualTo(String value) {
            addCriterion("good_supplier =", value, "goodSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierNotEqualTo(String value) {
            addCriterion("good_supplier <>", value, "goodSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierGreaterThan(String value) {
            addCriterion("good_supplier >", value, "goodSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("good_supplier >=", value, "goodSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierLessThan(String value) {
            addCriterion("good_supplier <", value, "goodSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierLessThanOrEqualTo(String value) {
            addCriterion("good_supplier <=", value, "goodSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierLike(String value) {
            addCriterion("good_supplier like", value, "goodSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierNotLike(String value) {
            addCriterion("good_supplier not like", value, "goodSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierIn(List<String> values) {
            addCriterion("good_supplier in", values, "goodSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierNotIn(List<String> values) {
            addCriterion("good_supplier not in", values, "goodSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierBetween(String value1, String value2) {
            addCriterion("good_supplier between", value1, value2, "goodSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodSupplierNotBetween(String value1, String value2) {
            addCriterion("good_supplier not between", value1, value2, "goodSupplier");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageIsNull() {
            addCriterion("good_trace_message is null");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageIsNotNull() {
            addCriterion("good_trace_message is not null");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageEqualTo(String value) {
            addCriterion("good_trace_message =", value, "goodTraceMessage");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageNotEqualTo(String value) {
            addCriterion("good_trace_message <>", value, "goodTraceMessage");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageGreaterThan(String value) {
            addCriterion("good_trace_message >", value, "goodTraceMessage");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageGreaterThanOrEqualTo(String value) {
            addCriterion("good_trace_message >=", value, "goodTraceMessage");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageLessThan(String value) {
            addCriterion("good_trace_message <", value, "goodTraceMessage");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageLessThanOrEqualTo(String value) {
            addCriterion("good_trace_message <=", value, "goodTraceMessage");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageLike(String value) {
            addCriterion("good_trace_message like", value, "goodTraceMessage");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageNotLike(String value) {
            addCriterion("good_trace_message not like", value, "goodTraceMessage");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageIn(List<String> values) {
            addCriterion("good_trace_message in", values, "goodTraceMessage");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageNotIn(List<String> values) {
            addCriterion("good_trace_message not in", values, "goodTraceMessage");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageBetween(String value1, String value2) {
            addCriterion("good_trace_message between", value1, value2, "goodTraceMessage");
            return (Criteria) this;
        }

        public Criteria andGoodTraceMessageNotBetween(String value1, String value2) {
            addCriterion("good_trace_message not between", value1, value2, "goodTraceMessage");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryTypeIsNull() {
            addCriterion("return_factory_type is null");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryTypeIsNotNull() {
            addCriterion("return_factory_type is not null");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryTypeEqualTo(Byte value) {
            addCriterion("return_factory_type =", value, "returnFactoryType");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryTypeNotEqualTo(Byte value) {
            addCriterion("return_factory_type <>", value, "returnFactoryType");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryTypeGreaterThan(Byte value) {
            addCriterion("return_factory_type >", value, "returnFactoryType");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("return_factory_type >=", value, "returnFactoryType");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryTypeLessThan(Byte value) {
            addCriterion("return_factory_type <", value, "returnFactoryType");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryTypeLessThanOrEqualTo(Byte value) {
            addCriterion("return_factory_type <=", value, "returnFactoryType");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryTypeIn(List<Byte> values) {
            addCriterion("return_factory_type in", values, "returnFactoryType");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryTypeNotIn(List<Byte> values) {
            addCriterion("return_factory_type not in", values, "returnFactoryType");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryTypeBetween(Byte value1, Byte value2) {
            addCriterion("return_factory_type between", value1, value2, "returnFactoryType");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("return_factory_type not between", value1, value2, "returnFactoryType");
            return (Criteria) this;
        }

        public Criteria andChangeGoodIdIsNull() {
            addCriterion("change_good_id is null");
            return (Criteria) this;
        }

        public Criteria andChangeGoodIdIsNotNull() {
            addCriterion("change_good_id is not null");
            return (Criteria) this;
        }

        public Criteria andChangeGoodIdEqualTo(Long value) {
            addCriterion("change_good_id =", value, "changeGoodId");
            return (Criteria) this;
        }

        public Criteria andChangeGoodIdNotEqualTo(Long value) {
            addCriterion("change_good_id <>", value, "changeGoodId");
            return (Criteria) this;
        }

        public Criteria andChangeGoodIdGreaterThan(Long value) {
            addCriterion("change_good_id >", value, "changeGoodId");
            return (Criteria) this;
        }

        public Criteria andChangeGoodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("change_good_id >=", value, "changeGoodId");
            return (Criteria) this;
        }

        public Criteria andChangeGoodIdLessThan(Long value) {
            addCriterion("change_good_id <", value, "changeGoodId");
            return (Criteria) this;
        }

        public Criteria andChangeGoodIdLessThanOrEqualTo(Long value) {
            addCriterion("change_good_id <=", value, "changeGoodId");
            return (Criteria) this;
        }

        public Criteria andChangeGoodIdIn(List<Long> values) {
            addCriterion("change_good_id in", values, "changeGoodId");
            return (Criteria) this;
        }

        public Criteria andChangeGoodIdNotIn(List<Long> values) {
            addCriterion("change_good_id not in", values, "changeGoodId");
            return (Criteria) this;
        }

        public Criteria andChangeGoodIdBetween(Long value1, Long value2) {
            addCriterion("change_good_id between", value1, value2, "changeGoodId");
            return (Criteria) this;
        }

        public Criteria andChangeGoodIdNotBetween(Long value1, Long value2) {
            addCriterion("change_good_id not between", value1, value2, "changeGoodId");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
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