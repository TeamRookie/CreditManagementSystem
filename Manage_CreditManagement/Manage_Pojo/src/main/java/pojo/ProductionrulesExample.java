package pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductionrulesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductionrulesExample() {
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

        public Criteria andProductionlevelIsNull() {
            addCriterion("productionlevel is null");
            return (Criteria) this;
        }

        public Criteria andProductionlevelIsNotNull() {
            addCriterion("productionlevel is not null");
            return (Criteria) this;
        }

        public Criteria andProductionlevelEqualTo(String value) {
            addCriterion("productionlevel =", value, "productionlevel");
            return (Criteria) this;
        }

        public Criteria andProductionlevelNotEqualTo(String value) {
            addCriterion("productionlevel <>", value, "productionlevel");
            return (Criteria) this;
        }

        public Criteria andProductionlevelGreaterThan(String value) {
            addCriterion("productionlevel >", value, "productionlevel");
            return (Criteria) this;
        }

        public Criteria andProductionlevelGreaterThanOrEqualTo(String value) {
            addCriterion("productionlevel >=", value, "productionlevel");
            return (Criteria) this;
        }

        public Criteria andProductionlevelLessThan(String value) {
            addCriterion("productionlevel <", value, "productionlevel");
            return (Criteria) this;
        }

        public Criteria andProductionlevelLessThanOrEqualTo(String value) {
            addCriterion("productionlevel <=", value, "productionlevel");
            return (Criteria) this;
        }

        public Criteria andProductionlevelLike(String value) {
            addCriterion("productionlevel like", value, "productionlevel");
            return (Criteria) this;
        }

        public Criteria andProductionlevelNotLike(String value) {
            addCriterion("productionlevel not like", value, "productionlevel");
            return (Criteria) this;
        }

        public Criteria andProductionlevelIn(List<String> values) {
            addCriterion("productionlevel in", values, "productionlevel");
            return (Criteria) this;
        }

        public Criteria andProductionlevelNotIn(List<String> values) {
            addCriterion("productionlevel not in", values, "productionlevel");
            return (Criteria) this;
        }

        public Criteria andProductionlevelBetween(String value1, String value2) {
            addCriterion("productionlevel between", value1, value2, "productionlevel");
            return (Criteria) this;
        }

        public Criteria andProductionlevelNotBetween(String value1, String value2) {
            addCriterion("productionlevel not between", value1, value2, "productionlevel");
            return (Criteria) this;
        }

        public Criteria andResponsibilityIsNull() {
            addCriterion("responsibility is null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityIsNotNull() {
            addCriterion("responsibility is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityEqualTo(String value) {
            addCriterion("responsibility =", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityNotEqualTo(String value) {
            addCriterion("responsibility <>", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityGreaterThan(String value) {
            addCriterion("responsibility >", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityGreaterThanOrEqualTo(String value) {
            addCriterion("responsibility >=", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityLessThan(String value) {
            addCriterion("responsibility <", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityLessThanOrEqualTo(String value) {
            addCriterion("responsibility <=", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityLike(String value) {
            addCriterion("responsibility like", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityNotLike(String value) {
            addCriterion("responsibility not like", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityIn(List<String> values) {
            addCriterion("responsibility in", values, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityNotIn(List<String> values) {
            addCriterion("responsibility not in", values, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityBetween(String value1, String value2) {
            addCriterion("responsibility between", value1, value2, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityNotBetween(String value1, String value2) {
            addCriterion("responsibility not between", value1, value2, "responsibility");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Float value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Float value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Float value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Float value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Float value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Float value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Float> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Float> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Float value1, Float value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Float value1, Float value2) {
            addCriterion("credit not between", value1, value2, "credit");
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