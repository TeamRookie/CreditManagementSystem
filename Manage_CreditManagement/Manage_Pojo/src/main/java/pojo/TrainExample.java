package pojo;

import java.util.ArrayList;
import java.util.List;

public class TrainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainExample() {
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

        public Criteria andTraincontentIsNull() {
            addCriterion("traincontent is null");
            return (Criteria) this;
        }

        public Criteria andTraincontentIsNotNull() {
            addCriterion("traincontent is not null");
            return (Criteria) this;
        }

        public Criteria andTraincontentEqualTo(String value) {
            addCriterion("traincontent =", value, "traincontent");
            return (Criteria) this;
        }

        public Criteria andTraincontentNotEqualTo(String value) {
            addCriterion("traincontent <>", value, "traincontent");
            return (Criteria) this;
        }

        public Criteria andTraincontentGreaterThan(String value) {
            addCriterion("traincontent >", value, "traincontent");
            return (Criteria) this;
        }

        public Criteria andTraincontentGreaterThanOrEqualTo(String value) {
            addCriterion("traincontent >=", value, "traincontent");
            return (Criteria) this;
        }

        public Criteria andTraincontentLessThan(String value) {
            addCriterion("traincontent <", value, "traincontent");
            return (Criteria) this;
        }

        public Criteria andTraincontentLessThanOrEqualTo(String value) {
            addCriterion("traincontent <=", value, "traincontent");
            return (Criteria) this;
        }

        public Criteria andTraincontentLike(String value) {
            addCriterion("traincontent like", value, "traincontent");
            return (Criteria) this;
        }

        public Criteria andTraincontentNotLike(String value) {
            addCriterion("traincontent not like", value, "traincontent");
            return (Criteria) this;
        }

        public Criteria andTraincontentIn(List<String> values) {
            addCriterion("traincontent in", values, "traincontent");
            return (Criteria) this;
        }

        public Criteria andTraincontentNotIn(List<String> values) {
            addCriterion("traincontent not in", values, "traincontent");
            return (Criteria) this;
        }

        public Criteria andTraincontentBetween(String value1, String value2) {
            addCriterion("traincontent between", value1, value2, "traincontent");
            return (Criteria) this;
        }

        public Criteria andTraincontentNotBetween(String value1, String value2) {
            addCriterion("traincontent not between", value1, value2, "traincontent");
            return (Criteria) this;
        }

        public Criteria andTraintimeIsNull() {
            addCriterion("traintime is null");
            return (Criteria) this;
        }

        public Criteria andTraintimeIsNotNull() {
            addCriterion("traintime is not null");
            return (Criteria) this;
        }

        public Criteria andTraintimeEqualTo(String value) {
            addCriterion("traintime =", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeNotEqualTo(String value) {
            addCriterion("traintime <>", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeGreaterThan(String value) {
            addCriterion("traintime >", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeGreaterThanOrEqualTo(String value) {
            addCriterion("traintime >=", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeLessThan(String value) {
            addCriterion("traintime <", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeLessThanOrEqualTo(String value) {
            addCriterion("traintime <=", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeLike(String value) {
            addCriterion("traintime like", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeNotLike(String value) {
            addCriterion("traintime not like", value, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeIn(List<String> values) {
            addCriterion("traintime in", values, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeNotIn(List<String> values) {
            addCriterion("traintime not in", values, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeBetween(String value1, String value2) {
            addCriterion("traintime between", value1, value2, "traintime");
            return (Criteria) this;
        }

        public Criteria andTraintimeNotBetween(String value1, String value2) {
            addCriterion("traintime not between", value1, value2, "traintime");
            return (Criteria) this;
        }

        public Criteria andTrainsiteIsNull() {
            addCriterion("trainsite is null");
            return (Criteria) this;
        }

        public Criteria andTrainsiteIsNotNull() {
            addCriterion("trainsite is not null");
            return (Criteria) this;
        }

        public Criteria andTrainsiteEqualTo(String value) {
            addCriterion("trainsite =", value, "trainsite");
            return (Criteria) this;
        }

        public Criteria andTrainsiteNotEqualTo(String value) {
            addCriterion("trainsite <>", value, "trainsite");
            return (Criteria) this;
        }

        public Criteria andTrainsiteGreaterThan(String value) {
            addCriterion("trainsite >", value, "trainsite");
            return (Criteria) this;
        }

        public Criteria andTrainsiteGreaterThanOrEqualTo(String value) {
            addCriterion("trainsite >=", value, "trainsite");
            return (Criteria) this;
        }

        public Criteria andTrainsiteLessThan(String value) {
            addCriterion("trainsite <", value, "trainsite");
            return (Criteria) this;
        }

        public Criteria andTrainsiteLessThanOrEqualTo(String value) {
            addCriterion("trainsite <=", value, "trainsite");
            return (Criteria) this;
        }

        public Criteria andTrainsiteLike(String value) {
            addCriterion("trainsite like", value, "trainsite");
            return (Criteria) this;
        }

        public Criteria andTrainsiteNotLike(String value) {
            addCriterion("trainsite not like", value, "trainsite");
            return (Criteria) this;
        }

        public Criteria andTrainsiteIn(List<String> values) {
            addCriterion("trainsite in", values, "trainsite");
            return (Criteria) this;
        }

        public Criteria andTrainsiteNotIn(List<String> values) {
            addCriterion("trainsite not in", values, "trainsite");
            return (Criteria) this;
        }

        public Criteria andTrainsiteBetween(String value1, String value2) {
            addCriterion("trainsite between", value1, value2, "trainsite");
            return (Criteria) this;
        }

        public Criteria andTrainsiteNotBetween(String value1, String value2) {
            addCriterion("trainsite not between", value1, value2, "trainsite");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitIsNull() {
            addCriterion("organizationunit is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitIsNotNull() {
            addCriterion("organizationunit is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitEqualTo(String value) {
            addCriterion("organizationunit =", value, "organizationunit");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitNotEqualTo(String value) {
            addCriterion("organizationunit <>", value, "organizationunit");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitGreaterThan(String value) {
            addCriterion("organizationunit >", value, "organizationunit");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitGreaterThanOrEqualTo(String value) {
            addCriterion("organizationunit >=", value, "organizationunit");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitLessThan(String value) {
            addCriterion("organizationunit <", value, "organizationunit");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitLessThanOrEqualTo(String value) {
            addCriterion("organizationunit <=", value, "organizationunit");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitLike(String value) {
            addCriterion("organizationunit like", value, "organizationunit");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitNotLike(String value) {
            addCriterion("organizationunit not like", value, "organizationunit");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitIn(List<String> values) {
            addCriterion("organizationunit in", values, "organizationunit");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitNotIn(List<String> values) {
            addCriterion("organizationunit not in", values, "organizationunit");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitBetween(String value1, String value2) {
            addCriterion("organizationunit between", value1, value2, "organizationunit");
            return (Criteria) this;
        }

        public Criteria andOrganizationunitNotBetween(String value1, String value2) {
            addCriterion("organizationunit not between", value1, value2, "organizationunit");
            return (Criteria) this;
        }

        public Criteria andTearchenameIsNull() {
            addCriterion("tearchename is null");
            return (Criteria) this;
        }

        public Criteria andTearchenameIsNotNull() {
            addCriterion("tearchename is not null");
            return (Criteria) this;
        }

        public Criteria andTearchenameEqualTo(String value) {
            addCriterion("tearchename =", value, "tearchename");
            return (Criteria) this;
        }

        public Criteria andTearchenameNotEqualTo(String value) {
            addCriterion("tearchename <>", value, "tearchename");
            return (Criteria) this;
        }

        public Criteria andTearchenameGreaterThan(String value) {
            addCriterion("tearchename >", value, "tearchename");
            return (Criteria) this;
        }

        public Criteria andTearchenameGreaterThanOrEqualTo(String value) {
            addCriterion("tearchename >=", value, "tearchename");
            return (Criteria) this;
        }

        public Criteria andTearchenameLessThan(String value) {
            addCriterion("tearchename <", value, "tearchename");
            return (Criteria) this;
        }

        public Criteria andTearchenameLessThanOrEqualTo(String value) {
            addCriterion("tearchename <=", value, "tearchename");
            return (Criteria) this;
        }

        public Criteria andTearchenameLike(String value) {
            addCriterion("tearchename like", value, "tearchename");
            return (Criteria) this;
        }

        public Criteria andTearchenameNotLike(String value) {
            addCriterion("tearchename not like", value, "tearchename");
            return (Criteria) this;
        }

        public Criteria andTearchenameIn(List<String> values) {
            addCriterion("tearchename in", values, "tearchename");
            return (Criteria) this;
        }

        public Criteria andTearchenameNotIn(List<String> values) {
            addCriterion("tearchename not in", values, "tearchename");
            return (Criteria) this;
        }

        public Criteria andTearchenameBetween(String value1, String value2) {
            addCriterion("tearchename between", value1, value2, "tearchename");
            return (Criteria) this;
        }

        public Criteria andTearchenameNotBetween(String value1, String value2) {
            addCriterion("tearchename not between", value1, value2, "tearchename");
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