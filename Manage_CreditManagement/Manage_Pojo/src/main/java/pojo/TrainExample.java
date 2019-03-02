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

        public Criteria andTrainnameIsNull() {
            addCriterion("trainname is null");
            return (Criteria) this;
        }

        public Criteria andTrainnameIsNotNull() {
            addCriterion("trainname is not null");
            return (Criteria) this;
        }

        public Criteria andTrainnameEqualTo(String value) {
            addCriterion("trainname =", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameNotEqualTo(String value) {
            addCriterion("trainname <>", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameGreaterThan(String value) {
            addCriterion("trainname >", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameGreaterThanOrEqualTo(String value) {
            addCriterion("trainname >=", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameLessThan(String value) {
            addCriterion("trainname <", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameLessThanOrEqualTo(String value) {
            addCriterion("trainname <=", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameLike(String value) {
            addCriterion("trainname like", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameNotLike(String value) {
            addCriterion("trainname not like", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameIn(List<String> values) {
            addCriterion("trainname in", values, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameNotIn(List<String> values) {
            addCriterion("trainname not in", values, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameBetween(String value1, String value2) {
            addCriterion("trainname between", value1, value2, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameNotBetween(String value1, String value2) {
            addCriterion("trainname not between", value1, value2, "trainname");
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

        public Criteria andTrainstarttimeIsNull() {
            addCriterion("trainstarttime is null");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeIsNotNull() {
            addCriterion("trainstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeEqualTo(String value) {
            addCriterion("trainstarttime =", value, "trainstarttime");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeNotEqualTo(String value) {
            addCriterion("trainstarttime <>", value, "trainstarttime");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeGreaterThan(String value) {
            addCriterion("trainstarttime >", value, "trainstarttime");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("trainstarttime >=", value, "trainstarttime");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeLessThan(String value) {
            addCriterion("trainstarttime <", value, "trainstarttime");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeLessThanOrEqualTo(String value) {
            addCriterion("trainstarttime <=", value, "trainstarttime");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeLike(String value) {
            addCriterion("trainstarttime like", value, "trainstarttime");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeNotLike(String value) {
            addCriterion("trainstarttime not like", value, "trainstarttime");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeIn(List<String> values) {
            addCriterion("trainstarttime in", values, "trainstarttime");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeNotIn(List<String> values) {
            addCriterion("trainstarttime not in", values, "trainstarttime");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeBetween(String value1, String value2) {
            addCriterion("trainstarttime between", value1, value2, "trainstarttime");
            return (Criteria) this;
        }

        public Criteria andTrainstarttimeNotBetween(String value1, String value2) {
            addCriterion("trainstarttime not between", value1, value2, "trainstarttime");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeIsNull() {
            addCriterion("trainendtime is null");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeIsNotNull() {
            addCriterion("trainendtime is not null");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeEqualTo(String value) {
            addCriterion("trainendtime =", value, "trainendtime");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeNotEqualTo(String value) {
            addCriterion("trainendtime <>", value, "trainendtime");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeGreaterThan(String value) {
            addCriterion("trainendtime >", value, "trainendtime");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("trainendtime >=", value, "trainendtime");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeLessThan(String value) {
            addCriterion("trainendtime <", value, "trainendtime");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeLessThanOrEqualTo(String value) {
            addCriterion("trainendtime <=", value, "trainendtime");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeLike(String value) {
            addCriterion("trainendtime like", value, "trainendtime");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeNotLike(String value) {
            addCriterion("trainendtime not like", value, "trainendtime");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeIn(List<String> values) {
            addCriterion("trainendtime in", values, "trainendtime");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeNotIn(List<String> values) {
            addCriterion("trainendtime not in", values, "trainendtime");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeBetween(String value1, String value2) {
            addCriterion("trainendtime between", value1, value2, "trainendtime");
            return (Criteria) this;
        }

        public Criteria andTrainendtimeNotBetween(String value1, String value2) {
            addCriterion("trainendtime not between", value1, value2, "trainendtime");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("teachername is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("teachername is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("teachername =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("teachername <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("teachername >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("teachername >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("teachername <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("teachername <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("teachername like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("teachername not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("teachername in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("teachername not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("teachername between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("teachername not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andStunumIsNull() {
            addCriterion("stunum is null");
            return (Criteria) this;
        }

        public Criteria andStunumIsNotNull() {
            addCriterion("stunum is not null");
            return (Criteria) this;
        }

        public Criteria andStunumEqualTo(String value) {
            addCriterion("stunum =", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotEqualTo(String value) {
            addCriterion("stunum <>", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumGreaterThan(String value) {
            addCriterion("stunum >", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumGreaterThanOrEqualTo(String value) {
            addCriterion("stunum >=", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLessThan(String value) {
            addCriterion("stunum <", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLessThanOrEqualTo(String value) {
            addCriterion("stunum <=", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLike(String value) {
            addCriterion("stunum like", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotLike(String value) {
            addCriterion("stunum not like", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumIn(List<String> values) {
            addCriterion("stunum in", values, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotIn(List<String> values) {
            addCriterion("stunum not in", values, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumBetween(String value1, String value2) {
            addCriterion("stunum between", value1, value2, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotBetween(String value1, String value2) {
            addCriterion("stunum not between", value1, value2, "stunum");
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

        public Criteria andFacultynameIsNull() {
            addCriterion("facultyname is null");
            return (Criteria) this;
        }

        public Criteria andFacultynameIsNotNull() {
            addCriterion("facultyname is not null");
            return (Criteria) this;
        }

        public Criteria andFacultynameEqualTo(String value) {
            addCriterion("facultyname =", value, "facultyname");
            return (Criteria) this;
        }

        public Criteria andFacultynameNotEqualTo(String value) {
            addCriterion("facultyname <>", value, "facultyname");
            return (Criteria) this;
        }

        public Criteria andFacultynameGreaterThan(String value) {
            addCriterion("facultyname >", value, "facultyname");
            return (Criteria) this;
        }

        public Criteria andFacultynameGreaterThanOrEqualTo(String value) {
            addCriterion("facultyname >=", value, "facultyname");
            return (Criteria) this;
        }

        public Criteria andFacultynameLessThan(String value) {
            addCriterion("facultyname <", value, "facultyname");
            return (Criteria) this;
        }

        public Criteria andFacultynameLessThanOrEqualTo(String value) {
            addCriterion("facultyname <=", value, "facultyname");
            return (Criteria) this;
        }

        public Criteria andFacultynameLike(String value) {
            addCriterion("facultyname like", value, "facultyname");
            return (Criteria) this;
        }

        public Criteria andFacultynameNotLike(String value) {
            addCriterion("facultyname not like", value, "facultyname");
            return (Criteria) this;
        }

        public Criteria andFacultynameIn(List<String> values) {
            addCriterion("facultyname in", values, "facultyname");
            return (Criteria) this;
        }

        public Criteria andFacultynameNotIn(List<String> values) {
            addCriterion("facultyname not in", values, "facultyname");
            return (Criteria) this;
        }

        public Criteria andFacultynameBetween(String value1, String value2) {
            addCriterion("facultyname between", value1, value2, "facultyname");
            return (Criteria) this;
        }

        public Criteria andFacultynameNotBetween(String value1, String value2) {
            addCriterion("facultyname not between", value1, value2, "facultyname");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNull() {
            addCriterion("majorname is null");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNotNull() {
            addCriterion("majorname is not null");
            return (Criteria) this;
        }

        public Criteria andMajornameEqualTo(String value) {
            addCriterion("majorname =", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotEqualTo(String value) {
            addCriterion("majorname <>", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThan(String value) {
            addCriterion("majorname >", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThanOrEqualTo(String value) {
            addCriterion("majorname >=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThan(String value) {
            addCriterion("majorname <", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThanOrEqualTo(String value) {
            addCriterion("majorname <=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLike(String value) {
            addCriterion("majorname like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotLike(String value) {
            addCriterion("majorname not like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameIn(List<String> values) {
            addCriterion("majorname in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotIn(List<String> values) {
            addCriterion("majorname not in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameBetween(String value1, String value2) {
            addCriterion("majorname between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotBetween(String value1, String value2) {
            addCriterion("majorname not between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andGradenameIsNull() {
            addCriterion("gradename is null");
            return (Criteria) this;
        }

        public Criteria andGradenameIsNotNull() {
            addCriterion("gradename is not null");
            return (Criteria) this;
        }

        public Criteria andGradenameEqualTo(String value) {
            addCriterion("gradename =", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotEqualTo(String value) {
            addCriterion("gradename <>", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameGreaterThan(String value) {
            addCriterion("gradename >", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameGreaterThanOrEqualTo(String value) {
            addCriterion("gradename >=", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameLessThan(String value) {
            addCriterion("gradename <", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameLessThanOrEqualTo(String value) {
            addCriterion("gradename <=", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameLike(String value) {
            addCriterion("gradename like", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotLike(String value) {
            addCriterion("gradename not like", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameIn(List<String> values) {
            addCriterion("gradename in", values, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotIn(List<String> values) {
            addCriterion("gradename not in", values, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameBetween(String value1, String value2) {
            addCriterion("gradename between", value1, value2, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotBetween(String value1, String value2) {
            addCriterion("gradename not between", value1, value2, "gradename");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuname is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuname is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuname =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuname <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuname >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuname >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuname <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuname <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuname like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuname not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuname in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuname not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuname between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuname not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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