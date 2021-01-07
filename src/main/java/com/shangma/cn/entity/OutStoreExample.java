package com.shangma.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutStoreExample() {
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

        public Criteria andReturnOutStoreFlagIsNull() {
            addCriterion("return_out_store_flag is null");
            return (Criteria) this;
        }

        public Criteria andReturnOutStoreFlagIsNotNull() {
            addCriterion("return_out_store_flag is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOutStoreFlagEqualTo(Byte value) {
            addCriterion("return_out_store_flag =", value, "returnOutStoreFlag");
            return (Criteria) this;
        }

        public Criteria andReturnOutStoreFlagNotEqualTo(Byte value) {
            addCriterion("return_out_store_flag <>", value, "returnOutStoreFlag");
            return (Criteria) this;
        }

        public Criteria andReturnOutStoreFlagGreaterThan(Byte value) {
            addCriterion("return_out_store_flag >", value, "returnOutStoreFlag");
            return (Criteria) this;
        }

        public Criteria andReturnOutStoreFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("return_out_store_flag >=", value, "returnOutStoreFlag");
            return (Criteria) this;
        }

        public Criteria andReturnOutStoreFlagLessThan(Byte value) {
            addCriterion("return_out_store_flag <", value, "returnOutStoreFlag");
            return (Criteria) this;
        }

        public Criteria andReturnOutStoreFlagLessThanOrEqualTo(Byte value) {
            addCriterion("return_out_store_flag <=", value, "returnOutStoreFlag");
            return (Criteria) this;
        }

        public Criteria andReturnOutStoreFlagIn(List<Byte> values) {
            addCriterion("return_out_store_flag in", values, "returnOutStoreFlag");
            return (Criteria) this;
        }

        public Criteria andReturnOutStoreFlagNotIn(List<Byte> values) {
            addCriterion("return_out_store_flag not in", values, "returnOutStoreFlag");
            return (Criteria) this;
        }

        public Criteria andReturnOutStoreFlagBetween(Byte value1, Byte value2) {
            addCriterion("return_out_store_flag between", value1, value2, "returnOutStoreFlag");
            return (Criteria) this;
        }

        public Criteria andReturnOutStoreFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("return_out_store_flag not between", value1, value2, "returnOutStoreFlag");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonIsNull() {
            addCriterion("return_factory_reason is null");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonIsNotNull() {
            addCriterion("return_factory_reason is not null");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonEqualTo(String value) {
            addCriterion("return_factory_reason =", value, "returnFactoryReason");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonNotEqualTo(String value) {
            addCriterion("return_factory_reason <>", value, "returnFactoryReason");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonGreaterThan(String value) {
            addCriterion("return_factory_reason >", value, "returnFactoryReason");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonGreaterThanOrEqualTo(String value) {
            addCriterion("return_factory_reason >=", value, "returnFactoryReason");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonLessThan(String value) {
            addCriterion("return_factory_reason <", value, "returnFactoryReason");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonLessThanOrEqualTo(String value) {
            addCriterion("return_factory_reason <=", value, "returnFactoryReason");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonLike(String value) {
            addCriterion("return_factory_reason like", value, "returnFactoryReason");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonNotLike(String value) {
            addCriterion("return_factory_reason not like", value, "returnFactoryReason");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonIn(List<String> values) {
            addCriterion("return_factory_reason in", values, "returnFactoryReason");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonNotIn(List<String> values) {
            addCriterion("return_factory_reason not in", values, "returnFactoryReason");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonBetween(String value1, String value2) {
            addCriterion("return_factory_reason between", value1, value2, "returnFactoryReason");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryReasonNotBetween(String value1, String value2) {
            addCriterion("return_factory_reason not between", value1, value2, "returnFactoryReason");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationIsNull() {
            addCriterion("return_factory_location is null");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationIsNotNull() {
            addCriterion("return_factory_location is not null");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationEqualTo(String value) {
            addCriterion("return_factory_location =", value, "returnFactoryLocation");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationNotEqualTo(String value) {
            addCriterion("return_factory_location <>", value, "returnFactoryLocation");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationGreaterThan(String value) {
            addCriterion("return_factory_location >", value, "returnFactoryLocation");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationGreaterThanOrEqualTo(String value) {
            addCriterion("return_factory_location >=", value, "returnFactoryLocation");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationLessThan(String value) {
            addCriterion("return_factory_location <", value, "returnFactoryLocation");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationLessThanOrEqualTo(String value) {
            addCriterion("return_factory_location <=", value, "returnFactoryLocation");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationLike(String value) {
            addCriterion("return_factory_location like", value, "returnFactoryLocation");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationNotLike(String value) {
            addCriterion("return_factory_location not like", value, "returnFactoryLocation");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationIn(List<String> values) {
            addCriterion("return_factory_location in", values, "returnFactoryLocation");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationNotIn(List<String> values) {
            addCriterion("return_factory_location not in", values, "returnFactoryLocation");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationBetween(String value1, String value2) {
            addCriterion("return_factory_location between", value1, value2, "returnFactoryLocation");
            return (Criteria) this;
        }

        public Criteria andReturnFactoryLocationNotBetween(String value1, String value2) {
            addCriterion("return_factory_location not between", value1, value2, "returnFactoryLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerIsNull() {
            addCriterion("document_maker is null");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerIsNotNull() {
            addCriterion("document_maker is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerEqualTo(String value) {
            addCriterion("document_maker =", value, "documentMaker");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerNotEqualTo(String value) {
            addCriterion("document_maker <>", value, "documentMaker");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerGreaterThan(String value) {
            addCriterion("document_maker >", value, "documentMaker");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerGreaterThanOrEqualTo(String value) {
            addCriterion("document_maker >=", value, "documentMaker");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerLessThan(String value) {
            addCriterion("document_maker <", value, "documentMaker");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerLessThanOrEqualTo(String value) {
            addCriterion("document_maker <=", value, "documentMaker");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerLike(String value) {
            addCriterion("document_maker like", value, "documentMaker");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerNotLike(String value) {
            addCriterion("document_maker not like", value, "documentMaker");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerIn(List<String> values) {
            addCriterion("document_maker in", values, "documentMaker");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerNotIn(List<String> values) {
            addCriterion("document_maker not in", values, "documentMaker");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerBetween(String value1, String value2) {
            addCriterion("document_maker between", value1, value2, "documentMaker");
            return (Criteria) this;
        }

        public Criteria andDocumentMakerNotBetween(String value1, String value2) {
            addCriterion("document_maker not between", value1, value2, "documentMaker");
            return (Criteria) this;
        }

        public Criteria andMakingTimeIsNull() {
            addCriterion("making_time is null");
            return (Criteria) this;
        }

        public Criteria andMakingTimeIsNotNull() {
            addCriterion("making_time is not null");
            return (Criteria) this;
        }

        public Criteria andMakingTimeEqualTo(Date value) {
            addCriterion("making_time =", value, "makingTime");
            return (Criteria) this;
        }

        public Criteria andMakingTimeNotEqualTo(Date value) {
            addCriterion("making_time <>", value, "makingTime");
            return (Criteria) this;
        }

        public Criteria andMakingTimeGreaterThan(Date value) {
            addCriterion("making_time >", value, "makingTime");
            return (Criteria) this;
        }

        public Criteria andMakingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("making_time >=", value, "makingTime");
            return (Criteria) this;
        }

        public Criteria andMakingTimeLessThan(Date value) {
            addCriterion("making_time <", value, "makingTime");
            return (Criteria) this;
        }

        public Criteria andMakingTimeLessThanOrEqualTo(Date value) {
            addCriterion("making_time <=", value, "makingTime");
            return (Criteria) this;
        }

        public Criteria andMakingTimeIn(List<Date> values) {
            addCriterion("making_time in", values, "makingTime");
            return (Criteria) this;
        }

        public Criteria andMakingTimeNotIn(List<Date> values) {
            addCriterion("making_time not in", values, "makingTime");
            return (Criteria) this;
        }

        public Criteria andMakingTimeBetween(Date value1, Date value2) {
            addCriterion("making_time between", value1, value2, "makingTime");
            return (Criteria) this;
        }

        public Criteria andMakingTimeNotBetween(Date value1, Date value2) {
            addCriterion("making_time not between", value1, value2, "makingTime");
            return (Criteria) this;
        }

        public Criteria andApproverIsNull() {
            addCriterion("approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(String value) {
            addCriterion("approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(String value) {
            addCriterion("approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(String value) {
            addCriterion("approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(String value) {
            addCriterion("approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(String value) {
            addCriterion("approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(String value) {
            addCriterion("approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLike(String value) {
            addCriterion("approver like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotLike(String value) {
            addCriterion("approver not like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<String> values) {
            addCriterion("approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<String> values) {
            addCriterion("approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(String value1, String value2) {
            addCriterion("approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(String value1, String value2) {
            addCriterion("approver not between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionIsNull() {
            addCriterion("approval_opinion is null");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionIsNotNull() {
            addCriterion("approval_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionEqualTo(String value) {
            addCriterion("approval_opinion =", value, "approvalOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionNotEqualTo(String value) {
            addCriterion("approval_opinion <>", value, "approvalOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionGreaterThan(String value) {
            addCriterion("approval_opinion >", value, "approvalOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("approval_opinion >=", value, "approvalOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionLessThan(String value) {
            addCriterion("approval_opinion <", value, "approvalOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionLessThanOrEqualTo(String value) {
            addCriterion("approval_opinion <=", value, "approvalOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionLike(String value) {
            addCriterion("approval_opinion like", value, "approvalOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionNotLike(String value) {
            addCriterion("approval_opinion not like", value, "approvalOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionIn(List<String> values) {
            addCriterion("approval_opinion in", values, "approvalOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionNotIn(List<String> values) {
            addCriterion("approval_opinion not in", values, "approvalOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionBetween(String value1, String value2) {
            addCriterion("approval_opinion between", value1, value2, "approvalOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovalOpinionNotBetween(String value1, String value2) {
            addCriterion("approval_opinion not between", value1, value2, "approvalOpinion");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNull() {
            addCriterion("approval_time is null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNotNull() {
            addCriterion("approval_time is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeEqualTo(Date value) {
            addCriterion("approval_time =", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotEqualTo(Date value) {
            addCriterion("approval_time <>", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThan(Date value) {
            addCriterion("approval_time >", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("approval_time >=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThan(Date value) {
            addCriterion("approval_time <", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThanOrEqualTo(Date value) {
            addCriterion("approval_time <=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIn(List<Date> values) {
            addCriterion("approval_time in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotIn(List<Date> values) {
            addCriterion("approval_time not in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeBetween(Date value1, Date value2) {
            addCriterion("approval_time between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotBetween(Date value1, Date value2) {
            addCriterion("approval_time not between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNull() {
            addCriterion("approval_status is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNotNull() {
            addCriterion("approval_status is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusEqualTo(Byte value) {
            addCriterion("approval_status =", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotEqualTo(Byte value) {
            addCriterion("approval_status <>", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThan(Byte value) {
            addCriterion("approval_status >", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("approval_status >=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThan(Byte value) {
            addCriterion("approval_status <", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThanOrEqualTo(Byte value) {
            addCriterion("approval_status <=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIn(List<Byte> values) {
            addCriterion("approval_status in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotIn(List<Byte> values) {
            addCriterion("approval_status not in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusBetween(Byte value1, Byte value2) {
            addCriterion("approval_status between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("approval_status not between", value1, value2, "approvalStatus");
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