package pojo;

import java.util.ArrayList;
import java.util.List;

public class TypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeExample() {
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

        public Criteria andTypenameIsNull() {
            addCriterion("typename is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typename is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typename =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typename <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typename >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typename >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typename <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typename <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typename like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typename not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typename in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typename not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typename between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typename not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andInformationurlIsNull() {
            addCriterion("informationurl is null");
            return (Criteria) this;
        }

        public Criteria andInformationurlIsNotNull() {
            addCriterion("informationurl is not null");
            return (Criteria) this;
        }

        public Criteria andInformationurlEqualTo(String value) {
            addCriterion("informationurl =", value, "informationurl");
            return (Criteria) this;
        }

        public Criteria andInformationurlNotEqualTo(String value) {
            addCriterion("informationurl <>", value, "informationurl");
            return (Criteria) this;
        }

        public Criteria andInformationurlGreaterThan(String value) {
            addCriterion("informationurl >", value, "informationurl");
            return (Criteria) this;
        }

        public Criteria andInformationurlGreaterThanOrEqualTo(String value) {
            addCriterion("informationurl >=", value, "informationurl");
            return (Criteria) this;
        }

        public Criteria andInformationurlLessThan(String value) {
            addCriterion("informationurl <", value, "informationurl");
            return (Criteria) this;
        }

        public Criteria andInformationurlLessThanOrEqualTo(String value) {
            addCriterion("informationurl <=", value, "informationurl");
            return (Criteria) this;
        }

        public Criteria andInformationurlLike(String value) {
            addCriterion("informationurl like", value, "informationurl");
            return (Criteria) this;
        }

        public Criteria andInformationurlNotLike(String value) {
            addCriterion("informationurl not like", value, "informationurl");
            return (Criteria) this;
        }

        public Criteria andInformationurlIn(List<String> values) {
            addCriterion("informationurl in", values, "informationurl");
            return (Criteria) this;
        }

        public Criteria andInformationurlNotIn(List<String> values) {
            addCriterion("informationurl not in", values, "informationurl");
            return (Criteria) this;
        }

        public Criteria andInformationurlBetween(String value1, String value2) {
            addCriterion("informationurl between", value1, value2, "informationurl");
            return (Criteria) this;
        }

        public Criteria andInformationurlNotBetween(String value1, String value2) {
            addCriterion("informationurl not between", value1, value2, "informationurl");
            return (Criteria) this;
        }

        public Criteria andRulesurlIsNull() {
            addCriterion("rulesurl is null");
            return (Criteria) this;
        }

        public Criteria andRulesurlIsNotNull() {
            addCriterion("rulesurl is not null");
            return (Criteria) this;
        }

        public Criteria andRulesurlEqualTo(String value) {
            addCriterion("rulesurl =", value, "rulesurl");
            return (Criteria) this;
        }

        public Criteria andRulesurlNotEqualTo(String value) {
            addCriterion("rulesurl <>", value, "rulesurl");
            return (Criteria) this;
        }

        public Criteria andRulesurlGreaterThan(String value) {
            addCriterion("rulesurl >", value, "rulesurl");
            return (Criteria) this;
        }

        public Criteria andRulesurlGreaterThanOrEqualTo(String value) {
            addCriterion("rulesurl >=", value, "rulesurl");
            return (Criteria) this;
        }

        public Criteria andRulesurlLessThan(String value) {
            addCriterion("rulesurl <", value, "rulesurl");
            return (Criteria) this;
        }

        public Criteria andRulesurlLessThanOrEqualTo(String value) {
            addCriterion("rulesurl <=", value, "rulesurl");
            return (Criteria) this;
        }

        public Criteria andRulesurlLike(String value) {
            addCriterion("rulesurl like", value, "rulesurl");
            return (Criteria) this;
        }

        public Criteria andRulesurlNotLike(String value) {
            addCriterion("rulesurl not like", value, "rulesurl");
            return (Criteria) this;
        }

        public Criteria andRulesurlIn(List<String> values) {
            addCriterion("rulesurl in", values, "rulesurl");
            return (Criteria) this;
        }

        public Criteria andRulesurlNotIn(List<String> values) {
            addCriterion("rulesurl not in", values, "rulesurl");
            return (Criteria) this;
        }

        public Criteria andRulesurlBetween(String value1, String value2) {
            addCriterion("rulesurl between", value1, value2, "rulesurl");
            return (Criteria) this;
        }

        public Criteria andRulesurlNotBetween(String value1, String value2) {
            addCriterion("rulesurl not between", value1, value2, "rulesurl");
            return (Criteria) this;
        }

        public Criteria andImporttypeIsNull() {
            addCriterion("importType is null");
            return (Criteria) this;
        }

        public Criteria andImporttypeIsNotNull() {
            addCriterion("importType is not null");
            return (Criteria) this;
        }

        public Criteria andImporttypeEqualTo(String value) {
            addCriterion("importType =", value, "importtype");
            return (Criteria) this;
        }

        public Criteria andImporttypeNotEqualTo(String value) {
            addCriterion("importType <>", value, "importtype");
            return (Criteria) this;
        }

        public Criteria andImporttypeGreaterThan(String value) {
            addCriterion("importType >", value, "importtype");
            return (Criteria) this;
        }

        public Criteria andImporttypeGreaterThanOrEqualTo(String value) {
            addCriterion("importType >=", value, "importtype");
            return (Criteria) this;
        }

        public Criteria andImporttypeLessThan(String value) {
            addCriterion("importType <", value, "importtype");
            return (Criteria) this;
        }

        public Criteria andImporttypeLessThanOrEqualTo(String value) {
            addCriterion("importType <=", value, "importtype");
            return (Criteria) this;
        }

        public Criteria andImporttypeLike(String value) {
            addCriterion("importType like", value, "importtype");
            return (Criteria) this;
        }

        public Criteria andImporttypeNotLike(String value) {
            addCriterion("importType not like", value, "importtype");
            return (Criteria) this;
        }

        public Criteria andImporttypeIn(List<String> values) {
            addCriterion("importType in", values, "importtype");
            return (Criteria) this;
        }

        public Criteria andImporttypeNotIn(List<String> values) {
            addCriterion("importType not in", values, "importtype");
            return (Criteria) this;
        }

        public Criteria andImporttypeBetween(String value1, String value2) {
            addCriterion("importType between", value1, value2, "importtype");
            return (Criteria) this;
        }

        public Criteria andImporttypeNotBetween(String value1, String value2) {
            addCriterion("importType not between", value1, value2, "importtype");
            return (Criteria) this;
        }

        public Criteria andDisableIsNull() {
            addCriterion("disable is null");
            return (Criteria) this;
        }

        public Criteria andDisableIsNotNull() {
            addCriterion("disable is not null");
            return (Criteria) this;
        }

        public Criteria andDisableEqualTo(Integer value) {
            addCriterion("disable =", value, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableNotEqualTo(Integer value) {
            addCriterion("disable <>", value, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableGreaterThan(Integer value) {
            addCriterion("disable >", value, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableGreaterThanOrEqualTo(Integer value) {
            addCriterion("disable >=", value, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableLessThan(Integer value) {
            addCriterion("disable <", value, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableLessThanOrEqualTo(Integer value) {
            addCriterion("disable <=", value, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableIn(List<Integer> values) {
            addCriterion("disable in", values, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableNotIn(List<Integer> values) {
            addCriterion("disable not in", values, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableBetween(Integer value1, Integer value2) {
            addCriterion("disable between", value1, value2, "disable");
            return (Criteria) this;
        }

        public Criteria andDisableNotBetween(Integer value1, Integer value2) {
            addCriterion("disable not between", value1, value2, "disable");
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