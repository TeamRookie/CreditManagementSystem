package pojo;

import java.util.ArrayList;
import java.util.List;

public class StudiotypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudiotypeExample() {
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

        public Criteria andStudiotimeIsNull() {
            addCriterion("studiotime is null");
            return (Criteria) this;
        }

        public Criteria andStudiotimeIsNotNull() {
            addCriterion("studiotime is not null");
            return (Criteria) this;
        }

        public Criteria andStudiotimeEqualTo(String value) {
            addCriterion("studiotime =", value, "studiotime");
            return (Criteria) this;
        }

        public Criteria andStudiotimeNotEqualTo(String value) {
            addCriterion("studiotime <>", value, "studiotime");
            return (Criteria) this;
        }

        public Criteria andStudiotimeGreaterThan(String value) {
            addCriterion("studiotime >", value, "studiotime");
            return (Criteria) this;
        }

        public Criteria andStudiotimeGreaterThanOrEqualTo(String value) {
            addCriterion("studiotime >=", value, "studiotime");
            return (Criteria) this;
        }

        public Criteria andStudiotimeLessThan(String value) {
            addCriterion("studiotime <", value, "studiotime");
            return (Criteria) this;
        }

        public Criteria andStudiotimeLessThanOrEqualTo(String value) {
            addCriterion("studiotime <=", value, "studiotime");
            return (Criteria) this;
        }

        public Criteria andStudiotimeLike(String value) {
            addCriterion("studiotime like", value, "studiotime");
            return (Criteria) this;
        }

        public Criteria andStudiotimeNotLike(String value) {
            addCriterion("studiotime not like", value, "studiotime");
            return (Criteria) this;
        }

        public Criteria andStudiotimeIn(List<String> values) {
            addCriterion("studiotime in", values, "studiotime");
            return (Criteria) this;
        }

        public Criteria andStudiotimeNotIn(List<String> values) {
            addCriterion("studiotime not in", values, "studiotime");
            return (Criteria) this;
        }

        public Criteria andStudiotimeBetween(String value1, String value2) {
            addCriterion("studiotime between", value1, value2, "studiotime");
            return (Criteria) this;
        }

        public Criteria andStudiotimeNotBetween(String value1, String value2) {
            addCriterion("studiotime not between", value1, value2, "studiotime");
            return (Criteria) this;
        }

        public Criteria andStudionameIsNull() {
            addCriterion("studioname is null");
            return (Criteria) this;
        }

        public Criteria andStudionameIsNotNull() {
            addCriterion("studioname is not null");
            return (Criteria) this;
        }

        public Criteria andStudionameEqualTo(String value) {
            addCriterion("studioname =", value, "studioname");
            return (Criteria) this;
        }

        public Criteria andStudionameNotEqualTo(String value) {
            addCriterion("studioname <>", value, "studioname");
            return (Criteria) this;
        }

        public Criteria andStudionameGreaterThan(String value) {
            addCriterion("studioname >", value, "studioname");
            return (Criteria) this;
        }

        public Criteria andStudionameGreaterThanOrEqualTo(String value) {
            addCriterion("studioname >=", value, "studioname");
            return (Criteria) this;
        }

        public Criteria andStudionameLessThan(String value) {
            addCriterion("studioname <", value, "studioname");
            return (Criteria) this;
        }

        public Criteria andStudionameLessThanOrEqualTo(String value) {
            addCriterion("studioname <=", value, "studioname");
            return (Criteria) this;
        }

        public Criteria andStudionameLike(String value) {
            addCriterion("studioname like", value, "studioname");
            return (Criteria) this;
        }

        public Criteria andStudionameNotLike(String value) {
            addCriterion("studioname not like", value, "studioname");
            return (Criteria) this;
        }

        public Criteria andStudionameIn(List<String> values) {
            addCriterion("studioname in", values, "studioname");
            return (Criteria) this;
        }

        public Criteria andStudionameNotIn(List<String> values) {
            addCriterion("studioname not in", values, "studioname");
            return (Criteria) this;
        }

        public Criteria andStudionameBetween(String value1, String value2) {
            addCriterion("studioname between", value1, value2, "studioname");
            return (Criteria) this;
        }

        public Criteria andStudionameNotBetween(String value1, String value2) {
            addCriterion("studioname not between", value1, value2, "studioname");
            return (Criteria) this;
        }

        public Criteria andStudiolevelIsNull() {
            addCriterion("studiolevel is null");
            return (Criteria) this;
        }

        public Criteria andStudiolevelIsNotNull() {
            addCriterion("studiolevel is not null");
            return (Criteria) this;
        }

        public Criteria andStudiolevelEqualTo(String value) {
            addCriterion("studiolevel =", value, "studiolevel");
            return (Criteria) this;
        }

        public Criteria andStudiolevelNotEqualTo(String value) {
            addCriterion("studiolevel <>", value, "studiolevel");
            return (Criteria) this;
        }

        public Criteria andStudiolevelGreaterThan(String value) {
            addCriterion("studiolevel >", value, "studiolevel");
            return (Criteria) this;
        }

        public Criteria andStudiolevelGreaterThanOrEqualTo(String value) {
            addCriterion("studiolevel >=", value, "studiolevel");
            return (Criteria) this;
        }

        public Criteria andStudiolevelLessThan(String value) {
            addCriterion("studiolevel <", value, "studiolevel");
            return (Criteria) this;
        }

        public Criteria andStudiolevelLessThanOrEqualTo(String value) {
            addCriterion("studiolevel <=", value, "studiolevel");
            return (Criteria) this;
        }

        public Criteria andStudiolevelLike(String value) {
            addCriterion("studiolevel like", value, "studiolevel");
            return (Criteria) this;
        }

        public Criteria andStudiolevelNotLike(String value) {
            addCriterion("studiolevel not like", value, "studiolevel");
            return (Criteria) this;
        }

        public Criteria andStudiolevelIn(List<String> values) {
            addCriterion("studiolevel in", values, "studiolevel");
            return (Criteria) this;
        }

        public Criteria andStudiolevelNotIn(List<String> values) {
            addCriterion("studiolevel not in", values, "studiolevel");
            return (Criteria) this;
        }

        public Criteria andStudiolevelBetween(String value1, String value2) {
            addCriterion("studiolevel between", value1, value2, "studiolevel");
            return (Criteria) this;
        }

        public Criteria andStudiolevelNotBetween(String value1, String value2) {
            addCriterion("studiolevel not between", value1, value2, "studiolevel");
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