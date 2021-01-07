package com.shangma.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsProductExample() {
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

        public Criteria andProdCodeIsNull() {
            addCriterion("prod_code is null");
            return (Criteria) this;
        }

        public Criteria andProdCodeIsNotNull() {
            addCriterion("prod_code is not null");
            return (Criteria) this;
        }

        public Criteria andProdCodeEqualTo(String value) {
            addCriterion("prod_code =", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotEqualTo(String value) {
            addCriterion("prod_code <>", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeGreaterThan(String value) {
            addCriterion("prod_code >", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prod_code >=", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLessThan(String value) {
            addCriterion("prod_code <", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLessThanOrEqualTo(String value) {
            addCriterion("prod_code <=", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLike(String value) {
            addCriterion("prod_code like", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotLike(String value) {
            addCriterion("prod_code not like", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeIn(List<String> values) {
            addCriterion("prod_code in", values, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotIn(List<String> values) {
            addCriterion("prod_code not in", values, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeBetween(String value1, String value2) {
            addCriterion("prod_code between", value1, value2, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotBetween(String value1, String value2) {
            addCriterion("prod_code not between", value1, value2, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNull() {
            addCriterion("prod_name is null");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNotNull() {
            addCriterion("prod_name is not null");
            return (Criteria) this;
        }

        public Criteria andProdNameEqualTo(String value) {
            addCriterion("prod_name =", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotEqualTo(String value) {
            addCriterion("prod_name <>", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThan(String value) {
            addCriterion("prod_name >", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("prod_name >=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThan(String value) {
            addCriterion("prod_name <", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThanOrEqualTo(String value) {
            addCriterion("prod_name <=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLike(String value) {
            addCriterion("prod_name like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotLike(String value) {
            addCriterion("prod_name not like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameIn(List<String> values) {
            addCriterion("prod_name in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotIn(List<String> values) {
            addCriterion("prod_name not in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameBetween(String value1, String value2) {
            addCriterion("prod_name between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotBetween(String value1, String value2) {
            addCriterion("prod_name not between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdTypeIsNull() {
            addCriterion("prod_type is null");
            return (Criteria) this;
        }

        public Criteria andProdTypeIsNotNull() {
            addCriterion("prod_type is not null");
            return (Criteria) this;
        }

        public Criteria andProdTypeEqualTo(Long value) {
            addCriterion("prod_type =", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotEqualTo(Long value) {
            addCriterion("prod_type <>", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeGreaterThan(Long value) {
            addCriterion("prod_type >", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("prod_type >=", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLessThan(Long value) {
            addCriterion("prod_type <", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLessThanOrEqualTo(Long value) {
            addCriterion("prod_type <=", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeIn(List<Long> values) {
            addCriterion("prod_type in", values, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotIn(List<Long> values) {
            addCriterion("prod_type not in", values, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeBetween(Long value1, Long value2) {
            addCriterion("prod_type between", value1, value2, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotBetween(Long value1, Long value2) {
            addCriterion("prod_type not between", value1, value2, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdBrandIsNull() {
            addCriterion("prod_brand is null");
            return (Criteria) this;
        }

        public Criteria andProdBrandIsNotNull() {
            addCriterion("prod_brand is not null");
            return (Criteria) this;
        }

        public Criteria andProdBrandEqualTo(Long value) {
            addCriterion("prod_brand =", value, "prodBrand");
            return (Criteria) this;
        }

        public Criteria andProdBrandNotEqualTo(Long value) {
            addCriterion("prod_brand <>", value, "prodBrand");
            return (Criteria) this;
        }

        public Criteria andProdBrandGreaterThan(Long value) {
            addCriterion("prod_brand >", value, "prodBrand");
            return (Criteria) this;
        }

        public Criteria andProdBrandGreaterThanOrEqualTo(Long value) {
            addCriterion("prod_brand >=", value, "prodBrand");
            return (Criteria) this;
        }

        public Criteria andProdBrandLessThan(Long value) {
            addCriterion("prod_brand <", value, "prodBrand");
            return (Criteria) this;
        }

        public Criteria andProdBrandLessThanOrEqualTo(Long value) {
            addCriterion("prod_brand <=", value, "prodBrand");
            return (Criteria) this;
        }

        public Criteria andProdBrandIn(List<Long> values) {
            addCriterion("prod_brand in", values, "prodBrand");
            return (Criteria) this;
        }

        public Criteria andProdBrandNotIn(List<Long> values) {
            addCriterion("prod_brand not in", values, "prodBrand");
            return (Criteria) this;
        }

        public Criteria andProdBrandBetween(Long value1, Long value2) {
            addCriterion("prod_brand between", value1, value2, "prodBrand");
            return (Criteria) this;
        }

        public Criteria andProdBrandNotBetween(Long value1, Long value2) {
            addCriterion("prod_brand not between", value1, value2, "prodBrand");
            return (Criteria) this;
        }

        public Criteria andProdModelIsNull() {
            addCriterion("prod_model is null");
            return (Criteria) this;
        }

        public Criteria andProdModelIsNotNull() {
            addCriterion("prod_model is not null");
            return (Criteria) this;
        }

        public Criteria andProdModelEqualTo(String value) {
            addCriterion("prod_model =", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelNotEqualTo(String value) {
            addCriterion("prod_model <>", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelGreaterThan(String value) {
            addCriterion("prod_model >", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelGreaterThanOrEqualTo(String value) {
            addCriterion("prod_model >=", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelLessThan(String value) {
            addCriterion("prod_model <", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelLessThanOrEqualTo(String value) {
            addCriterion("prod_model <=", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelLike(String value) {
            addCriterion("prod_model like", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelNotLike(String value) {
            addCriterion("prod_model not like", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelIn(List<String> values) {
            addCriterion("prod_model in", values, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelNotIn(List<String> values) {
            addCriterion("prod_model not in", values, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelBetween(String value1, String value2) {
            addCriterion("prod_model between", value1, value2, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelNotBetween(String value1, String value2) {
            addCriterion("prod_model not between", value1, value2, "prodModel");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeIsNull() {
            addCriterion("purchasing_mode is null");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeIsNotNull() {
            addCriterion("purchasing_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeEqualTo(String value) {
            addCriterion("purchasing_mode =", value, "purchasingMode");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeNotEqualTo(String value) {
            addCriterion("purchasing_mode <>", value, "purchasingMode");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeGreaterThan(String value) {
            addCriterion("purchasing_mode >", value, "purchasingMode");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeGreaterThanOrEqualTo(String value) {
            addCriterion("purchasing_mode >=", value, "purchasingMode");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeLessThan(String value) {
            addCriterion("purchasing_mode <", value, "purchasingMode");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeLessThanOrEqualTo(String value) {
            addCriterion("purchasing_mode <=", value, "purchasingMode");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeLike(String value) {
            addCriterion("purchasing_mode like", value, "purchasingMode");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeNotLike(String value) {
            addCriterion("purchasing_mode not like", value, "purchasingMode");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeIn(List<String> values) {
            addCriterion("purchasing_mode in", values, "purchasingMode");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeNotIn(List<String> values) {
            addCriterion("purchasing_mode not in", values, "purchasingMode");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeBetween(String value1, String value2) {
            addCriterion("purchasing_mode between", value1, value2, "purchasingMode");
            return (Criteria) this;
        }

        public Criteria andPurchasingModeNotBetween(String value1, String value2) {
            addCriterion("purchasing_mode not between", value1, value2, "purchasingMode");
            return (Criteria) this;
        }

        public Criteria andIsShopGoodsIsNull() {
            addCriterion("is_shop_goods is null");
            return (Criteria) this;
        }

        public Criteria andIsShopGoodsIsNotNull() {
            addCriterion("is_shop_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIsShopGoodsEqualTo(Boolean value) {
            addCriterion("is_shop_goods =", value, "isShopGoods");
            return (Criteria) this;
        }

        public Criteria andIsShopGoodsNotEqualTo(Boolean value) {
            addCriterion("is_shop_goods <>", value, "isShopGoods");
            return (Criteria) this;
        }

        public Criteria andIsShopGoodsGreaterThan(Boolean value) {
            addCriterion("is_shop_goods >", value, "isShopGoods");
            return (Criteria) this;
        }

        public Criteria andIsShopGoodsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_shop_goods >=", value, "isShopGoods");
            return (Criteria) this;
        }

        public Criteria andIsShopGoodsLessThan(Boolean value) {
            addCriterion("is_shop_goods <", value, "isShopGoods");
            return (Criteria) this;
        }

        public Criteria andIsShopGoodsLessThanOrEqualTo(Boolean value) {
            addCriterion("is_shop_goods <=", value, "isShopGoods");
            return (Criteria) this;
        }

        public Criteria andIsShopGoodsIn(List<Boolean> values) {
            addCriterion("is_shop_goods in", values, "isShopGoods");
            return (Criteria) this;
        }

        public Criteria andIsShopGoodsNotIn(List<Boolean> values) {
            addCriterion("is_shop_goods not in", values, "isShopGoods");
            return (Criteria) this;
        }

        public Criteria andIsShopGoodsBetween(Boolean value1, Boolean value2) {
            addCriterion("is_shop_goods between", value1, value2, "isShopGoods");
            return (Criteria) this;
        }

        public Criteria andIsShopGoodsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_shop_goods not between", value1, value2, "isShopGoods");
            return (Criteria) this;
        }

        public Criteria andIsStandbyIsNull() {
            addCriterion("is_standby is null");
            return (Criteria) this;
        }

        public Criteria andIsStandbyIsNotNull() {
            addCriterion("is_standby is not null");
            return (Criteria) this;
        }

        public Criteria andIsStandbyEqualTo(Boolean value) {
            addCriterion("is_standby =", value, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyNotEqualTo(Boolean value) {
            addCriterion("is_standby <>", value, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyGreaterThan(Boolean value) {
            addCriterion("is_standby >", value, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_standby >=", value, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyLessThan(Boolean value) {
            addCriterion("is_standby <", value, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyLessThanOrEqualTo(Boolean value) {
            addCriterion("is_standby <=", value, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyIn(List<Boolean> values) {
            addCriterion("is_standby in", values, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyNotIn(List<Boolean> values) {
            addCriterion("is_standby not in", values, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyBetween(Boolean value1, Boolean value2) {
            addCriterion("is_standby between", value1, value2, "isStandby");
            return (Criteria) this;
        }

        public Criteria andIsStandbyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_standby not between", value1, value2, "isStandby");
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