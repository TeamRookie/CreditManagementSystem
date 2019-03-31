package pojo;

import java.util.ArrayList;
import java.util.List;

public class PracticetypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PracticetypeExample() {
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

        public Criteria andPracticetimeIsNull() {
            addCriterion("practicetime is null");
            return (Criteria) this;
        }

        public Criteria andPracticetimeIsNotNull() {
            addCriterion("practicetime is not null");
            return (Criteria) this;
        }

        public Criteria andPracticetimeEqualTo(String value) {
            addCriterion("practicetime =", value, "practicetime");
            return (Criteria) this;
        }

        public Criteria andPracticetimeNotEqualTo(String value) {
            addCriterion("practicetime <>", value, "practicetime");
            return (Criteria) this;
        }

        public Criteria andPracticetimeGreaterThan(String value) {
            addCriterion("practicetime >", value, "practicetime");
            return (Criteria) this;
        }

        public Criteria andPracticetimeGreaterThanOrEqualTo(String value) {
            addCriterion("practicetime >=", value, "practicetime");
            return (Criteria) this;
        }

        public Criteria andPracticetimeLessThan(String value) {
            addCriterion("practicetime <", value, "practicetime");
            return (Criteria) this;
        }

        public Criteria andPracticetimeLessThanOrEqualTo(String value) {
            addCriterion("practicetime <=", value, "practicetime");
            return (Criteria) this;
        }

        public Criteria andPracticetimeLike(String value) {
            addCriterion("practicetime like", value, "practicetime");
            return (Criteria) this;
        }

        public Criteria andPracticetimeNotLike(String value) {
            addCriterion("practicetime not like", value, "practicetime");
            return (Criteria) this;
        }

        public Criteria andPracticetimeIn(List<String> values) {
            addCriterion("practicetime in", values, "practicetime");
            return (Criteria) this;
        }

        public Criteria andPracticetimeNotIn(List<String> values) {
            addCriterion("practicetime not in", values, "practicetime");
            return (Criteria) this;
        }

        public Criteria andPracticetimeBetween(String value1, String value2) {
            addCriterion("practicetime between", value1, value2, "practicetime");
            return (Criteria) this;
        }

        public Criteria andPracticetimeNotBetween(String value1, String value2) {
            addCriterion("practicetime not between", value1, value2, "practicetime");
            return (Criteria) this;
        }

        public Criteria andPracticenameIsNull() {
            addCriterion("practicename is null");
            return (Criteria) this;
        }

        public Criteria andPracticenameIsNotNull() {
            addCriterion("practicename is not null");
            return (Criteria) this;
        }

        public Criteria andPracticenameEqualTo(String value) {
            addCriterion("practicename =", value, "practicename");
            return (Criteria) this;
        }

        public Criteria andPracticenameNotEqualTo(String value) {
            addCriterion("practicename <>", value, "practicename");
            return (Criteria) this;
        }

        public Criteria andPracticenameGreaterThan(String value) {
            addCriterion("practicename >", value, "practicename");
            return (Criteria) this;
        }

        public Criteria andPracticenameGreaterThanOrEqualTo(String value) {
            addCriterion("practicename >=", value, "practicename");
            return (Criteria) this;
        }

        public Criteria andPracticenameLessThan(String value) {
            addCriterion("practicename <", value, "practicename");
            return (Criteria) this;
        }

        public Criteria andPracticenameLessThanOrEqualTo(String value) {
            addCriterion("practicename <=", value, "practicename");
            return (Criteria) this;
        }

        public Criteria andPracticenameLike(String value) {
            addCriterion("practicename like", value, "practicename");
            return (Criteria) this;
        }

        public Criteria andPracticenameNotLike(String value) {
            addCriterion("practicename not like", value, "practicename");
            return (Criteria) this;
        }

        public Criteria andPracticenameIn(List<String> values) {
            addCriterion("practicename in", values, "practicename");
            return (Criteria) this;
        }

        public Criteria andPracticenameNotIn(List<String> values) {
            addCriterion("practicename not in", values, "practicename");
            return (Criteria) this;
        }

        public Criteria andPracticenameBetween(String value1, String value2) {
            addCriterion("practicename between", value1, value2, "practicename");
            return (Criteria) this;
        }

        public Criteria andPracticenameNotBetween(String value1, String value2) {
            addCriterion("practicename not between", value1, value2, "practicename");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPracticelevelIsNull() {
            addCriterion("practicelevel is null");
            return (Criteria) this;
        }

        public Criteria andPracticelevelIsNotNull() {
            addCriterion("practicelevel is not null");
            return (Criteria) this;
        }

        public Criteria andPracticelevelEqualTo(String value) {
            addCriterion("practicelevel =", value, "practicelevel");
            return (Criteria) this;
        }

        public Criteria andPracticelevelNotEqualTo(String value) {
            addCriterion("practicelevel <>", value, "practicelevel");
            return (Criteria) this;
        }

        public Criteria andPracticelevelGreaterThan(String value) {
            addCriterion("practicelevel >", value, "practicelevel");
            return (Criteria) this;
        }

        public Criteria andPracticelevelGreaterThanOrEqualTo(String value) {
            addCriterion("practicelevel >=", value, "practicelevel");
            return (Criteria) this;
        }

        public Criteria andPracticelevelLessThan(String value) {
            addCriterion("practicelevel <", value, "practicelevel");
            return (Criteria) this;
        }

        public Criteria andPracticelevelLessThanOrEqualTo(String value) {
            addCriterion("practicelevel <=", value, "practicelevel");
            return (Criteria) this;
        }

        public Criteria andPracticelevelLike(String value) {
            addCriterion("practicelevel like", value, "practicelevel");
            return (Criteria) this;
        }

        public Criteria andPracticelevelNotLike(String value) {
            addCriterion("practicelevel not like", value, "practicelevel");
            return (Criteria) this;
        }

        public Criteria andPracticelevelIn(List<String> values) {
            addCriterion("practicelevel in", values, "practicelevel");
            return (Criteria) this;
        }

        public Criteria andPracticelevelNotIn(List<String> values) {
            addCriterion("practicelevel not in", values, "practicelevel");
            return (Criteria) this;
        }

        public Criteria andPracticelevelBetween(String value1, String value2) {
            addCriterion("practicelevel between", value1, value2, "practicelevel");
            return (Criteria) this;
        }

        public Criteria andPracticelevelNotBetween(String value1, String value2) {
            addCriterion("practicelevel not between", value1, value2, "practicelevel");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
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