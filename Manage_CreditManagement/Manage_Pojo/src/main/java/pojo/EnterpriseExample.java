package pojo;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidIsNull() {
            addCriterion("enterpriseid is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidIsNotNull() {
            addCriterion("enterpriseid is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidEqualTo(String value) {
            addCriterion("enterpriseid =", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidNotEqualTo(String value) {
            addCriterion("enterpriseid <>", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidGreaterThan(String value) {
            addCriterion("enterpriseid >", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidGreaterThanOrEqualTo(String value) {
            addCriterion("enterpriseid >=", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidLessThan(String value) {
            addCriterion("enterpriseid <", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidLessThanOrEqualTo(String value) {
            addCriterion("enterpriseid <=", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidLike(String value) {
            addCriterion("enterpriseid like", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidNotLike(String value) {
            addCriterion("enterpriseid not like", value, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidIn(List<String> values) {
            addCriterion("enterpriseid in", values, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidNotIn(List<String> values) {
            addCriterion("enterpriseid not in", values, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidBetween(String value1, String value2) {
            addCriterion("enterpriseid between", value1, value2, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidNotBetween(String value1, String value2) {
            addCriterion("enterpriseid not between", value1, value2, "enterpriseid");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIsNull() {
            addCriterion("enterprisename is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIsNotNull() {
            addCriterion("enterprisename is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameEqualTo(String value) {
            addCriterion("enterprisename =", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotEqualTo(String value) {
            addCriterion("enterprisename <>", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameGreaterThan(String value) {
            addCriterion("enterprisename >", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprisename >=", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLessThan(String value) {
            addCriterion("enterprisename <", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLessThanOrEqualTo(String value) {
            addCriterion("enterprisename <=", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLike(String value) {
            addCriterion("enterprisename like", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotLike(String value) {
            addCriterion("enterprisename not like", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIn(List<String> values) {
            addCriterion("enterprisename in", values, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotIn(List<String> values) {
            addCriterion("enterprisename not in", values, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameBetween(String value1, String value2) {
            addCriterion("enterprisename between", value1, value2, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotBetween(String value1, String value2) {
            addCriterion("enterprisename not between", value1, value2, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeIsNull() {
            addCriterion("enterprisetype is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeIsNotNull() {
            addCriterion("enterprisetype is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeEqualTo(String value) {
            addCriterion("enterprisetype =", value, "enterprisetype");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeNotEqualTo(String value) {
            addCriterion("enterprisetype <>", value, "enterprisetype");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeGreaterThan(String value) {
            addCriterion("enterprisetype >", value, "enterprisetype");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprisetype >=", value, "enterprisetype");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeLessThan(String value) {
            addCriterion("enterprisetype <", value, "enterprisetype");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeLessThanOrEqualTo(String value) {
            addCriterion("enterprisetype <=", value, "enterprisetype");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeLike(String value) {
            addCriterion("enterprisetype like", value, "enterprisetype");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeNotLike(String value) {
            addCriterion("enterprisetype not like", value, "enterprisetype");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeIn(List<String> values) {
            addCriterion("enterprisetype in", values, "enterprisetype");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeNotIn(List<String> values) {
            addCriterion("enterprisetype not in", values, "enterprisetype");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeBetween(String value1, String value2) {
            addCriterion("enterprisetype between", value1, value2, "enterprisetype");
            return (Criteria) this;
        }

        public Criteria andEnterprisetypeNotBetween(String value1, String value2) {
            addCriterion("enterprisetype not between", value1, value2, "enterprisetype");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNull() {
            addCriterion("residence is null");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNotNull() {
            addCriterion("residence is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceEqualTo(String value) {
            addCriterion("residence =", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotEqualTo(String value) {
            addCriterion("residence <>", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThan(String value) {
            addCriterion("residence >", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("residence >=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThan(String value) {
            addCriterion("residence <", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThanOrEqualTo(String value) {
            addCriterion("residence <=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLike(String value) {
            addCriterion("residence like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotLike(String value) {
            addCriterion("residence not like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceIn(List<String> values) {
            addCriterion("residence in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotIn(List<String> values) {
            addCriterion("residence not in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceBetween(String value1, String value2) {
            addCriterion("residence between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotBetween(String value1, String value2) {
            addCriterion("residence not between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andRepresentativeIsNull() {
            addCriterion("representative is null");
            return (Criteria) this;
        }

        public Criteria andRepresentativeIsNotNull() {
            addCriterion("representative is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentativeEqualTo(String value) {
            addCriterion("representative =", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNotEqualTo(String value) {
            addCriterion("representative <>", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeGreaterThan(String value) {
            addCriterion("representative >", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("representative >=", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeLessThan(String value) {
            addCriterion("representative <", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeLessThanOrEqualTo(String value) {
            addCriterion("representative <=", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeLike(String value) {
            addCriterion("representative like", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNotLike(String value) {
            addCriterion("representative not like", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeIn(List<String> values) {
            addCriterion("representative in", values, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNotIn(List<String> values) {
            addCriterion("representative not in", values, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeBetween(String value1, String value2) {
            addCriterion("representative between", value1, value2, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNotBetween(String value1, String value2) {
            addCriterion("representative not between", value1, value2, "representative");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeIsNull() {
            addCriterion("establishtime is null");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeIsNotNull() {
            addCriterion("establishtime is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeEqualTo(String value) {
            addCriterion("establishtime =", value, "establishtime");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeNotEqualTo(String value) {
            addCriterion("establishtime <>", value, "establishtime");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeGreaterThan(String value) {
            addCriterion("establishtime >", value, "establishtime");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeGreaterThanOrEqualTo(String value) {
            addCriterion("establishtime >=", value, "establishtime");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeLessThan(String value) {
            addCriterion("establishtime <", value, "establishtime");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeLessThanOrEqualTo(String value) {
            addCriterion("establishtime <=", value, "establishtime");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeLike(String value) {
            addCriterion("establishtime like", value, "establishtime");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeNotLike(String value) {
            addCriterion("establishtime not like", value, "establishtime");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeIn(List<String> values) {
            addCriterion("establishtime in", values, "establishtime");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeNotIn(List<String> values) {
            addCriterion("establishtime not in", values, "establishtime");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeBetween(String value1, String value2) {
            addCriterion("establishtime between", value1, value2, "establishtime");
            return (Criteria) this;
        }

        public Criteria andEstablishtimeNotBetween(String value1, String value2) {
            addCriterion("establishtime not between", value1, value2, "establishtime");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIsNull() {
            addCriterion("businessscope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIsNotNull() {
            addCriterion("businessscope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeEqualTo(String value) {
            addCriterion("businessscope =", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotEqualTo(String value) {
            addCriterion("businessscope <>", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeGreaterThan(String value) {
            addCriterion("businessscope >", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeGreaterThanOrEqualTo(String value) {
            addCriterion("businessscope >=", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLessThan(String value) {
            addCriterion("businessscope <", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLessThanOrEqualTo(String value) {
            addCriterion("businessscope <=", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeLike(String value) {
            addCriterion("businessscope like", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotLike(String value) {
            addCriterion("businessscope not like", value, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeIn(List<String> values) {
            addCriterion("businessscope in", values, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotIn(List<String> values) {
            addCriterion("businessscope not in", values, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeBetween(String value1, String value2) {
            addCriterion("businessscope between", value1, value2, "businessscope");
            return (Criteria) this;
        }

        public Criteria andBusinessscopeNotBetween(String value1, String value2) {
            addCriterion("businessscope not between", value1, value2, "businessscope");
            return (Criteria) this;
        }

        public Criteria andShareholderIsNull() {
            addCriterion("shareholder is null");
            return (Criteria) this;
        }

        public Criteria andShareholderIsNotNull() {
            addCriterion("shareholder is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderEqualTo(String value) {
            addCriterion("shareholder =", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotEqualTo(String value) {
            addCriterion("shareholder <>", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderGreaterThan(String value) {
            addCriterion("shareholder >", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderGreaterThanOrEqualTo(String value) {
            addCriterion("shareholder >=", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderLessThan(String value) {
            addCriterion("shareholder <", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderLessThanOrEqualTo(String value) {
            addCriterion("shareholder <=", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderLike(String value) {
            addCriterion("shareholder like", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotLike(String value) {
            addCriterion("shareholder not like", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderIn(List<String> values) {
            addCriterion("shareholder in", values, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotIn(List<String> values) {
            addCriterion("shareholder not in", values, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderBetween(String value1, String value2) {
            addCriterion("shareholder between", value1, value2, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotBetween(String value1, String value2) {
            addCriterion("shareholder not between", value1, value2, "shareholder");
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