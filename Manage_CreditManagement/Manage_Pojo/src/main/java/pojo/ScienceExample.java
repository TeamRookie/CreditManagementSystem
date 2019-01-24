package pojo;

import java.util.ArrayList;
import java.util.List;

public class ScienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScienceExample() {
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

        public Criteria andSciencenameIsNull() {
            addCriterion("sciencename is null");
            return (Criteria) this;
        }

        public Criteria andSciencenameIsNotNull() {
            addCriterion("sciencename is not null");
            return (Criteria) this;
        }

        public Criteria andSciencenameEqualTo(String value) {
            addCriterion("sciencename =", value, "sciencename");
            return (Criteria) this;
        }

        public Criteria andSciencenameNotEqualTo(String value) {
            addCriterion("sciencename <>", value, "sciencename");
            return (Criteria) this;
        }

        public Criteria andSciencenameGreaterThan(String value) {
            addCriterion("sciencename >", value, "sciencename");
            return (Criteria) this;
        }

        public Criteria andSciencenameGreaterThanOrEqualTo(String value) {
            addCriterion("sciencename >=", value, "sciencename");
            return (Criteria) this;
        }

        public Criteria andSciencenameLessThan(String value) {
            addCriterion("sciencename <", value, "sciencename");
            return (Criteria) this;
        }

        public Criteria andSciencenameLessThanOrEqualTo(String value) {
            addCriterion("sciencename <=", value, "sciencename");
            return (Criteria) this;
        }

        public Criteria andSciencenameLike(String value) {
            addCriterion("sciencename like", value, "sciencename");
            return (Criteria) this;
        }

        public Criteria andSciencenameNotLike(String value) {
            addCriterion("sciencename not like", value, "sciencename");
            return (Criteria) this;
        }

        public Criteria andSciencenameIn(List<String> values) {
            addCriterion("sciencename in", values, "sciencename");
            return (Criteria) this;
        }

        public Criteria andSciencenameNotIn(List<String> values) {
            addCriterion("sciencename not in", values, "sciencename");
            return (Criteria) this;
        }

        public Criteria andSciencenameBetween(String value1, String value2) {
            addCriterion("sciencename between", value1, value2, "sciencename");
            return (Criteria) this;
        }

        public Criteria andSciencenameNotBetween(String value1, String value2) {
            addCriterion("sciencename not between", value1, value2, "sciencename");
            return (Criteria) this;
        }

        public Criteria andSciencetypeIsNull() {
            addCriterion("sciencetype is null");
            return (Criteria) this;
        }

        public Criteria andSciencetypeIsNotNull() {
            addCriterion("sciencetype is not null");
            return (Criteria) this;
        }

        public Criteria andSciencetypeEqualTo(String value) {
            addCriterion("sciencetype =", value, "sciencetype");
            return (Criteria) this;
        }

        public Criteria andSciencetypeNotEqualTo(String value) {
            addCriterion("sciencetype <>", value, "sciencetype");
            return (Criteria) this;
        }

        public Criteria andSciencetypeGreaterThan(String value) {
            addCriterion("sciencetype >", value, "sciencetype");
            return (Criteria) this;
        }

        public Criteria andSciencetypeGreaterThanOrEqualTo(String value) {
            addCriterion("sciencetype >=", value, "sciencetype");
            return (Criteria) this;
        }

        public Criteria andSciencetypeLessThan(String value) {
            addCriterion("sciencetype <", value, "sciencetype");
            return (Criteria) this;
        }

        public Criteria andSciencetypeLessThanOrEqualTo(String value) {
            addCriterion("sciencetype <=", value, "sciencetype");
            return (Criteria) this;
        }

        public Criteria andSciencetypeLike(String value) {
            addCriterion("sciencetype like", value, "sciencetype");
            return (Criteria) this;
        }

        public Criteria andSciencetypeNotLike(String value) {
            addCriterion("sciencetype not like", value, "sciencetype");
            return (Criteria) this;
        }

        public Criteria andSciencetypeIn(List<String> values) {
            addCriterion("sciencetype in", values, "sciencetype");
            return (Criteria) this;
        }

        public Criteria andSciencetypeNotIn(List<String> values) {
            addCriterion("sciencetype not in", values, "sciencetype");
            return (Criteria) this;
        }

        public Criteria andSciencetypeBetween(String value1, String value2) {
            addCriterion("sciencetype between", value1, value2, "sciencetype");
            return (Criteria) this;
        }

        public Criteria andSciencetypeNotBetween(String value1, String value2) {
            addCriterion("sciencetype not between", value1, value2, "sciencetype");
            return (Criteria) this;
        }

        public Criteria andSciencelevelIsNull() {
            addCriterion("sciencelevel is null");
            return (Criteria) this;
        }

        public Criteria andSciencelevelIsNotNull() {
            addCriterion("sciencelevel is not null");
            return (Criteria) this;
        }

        public Criteria andSciencelevelEqualTo(String value) {
            addCriterion("sciencelevel =", value, "sciencelevel");
            return (Criteria) this;
        }

        public Criteria andSciencelevelNotEqualTo(String value) {
            addCriterion("sciencelevel <>", value, "sciencelevel");
            return (Criteria) this;
        }

        public Criteria andSciencelevelGreaterThan(String value) {
            addCriterion("sciencelevel >", value, "sciencelevel");
            return (Criteria) this;
        }

        public Criteria andSciencelevelGreaterThanOrEqualTo(String value) {
            addCriterion("sciencelevel >=", value, "sciencelevel");
            return (Criteria) this;
        }

        public Criteria andSciencelevelLessThan(String value) {
            addCriterion("sciencelevel <", value, "sciencelevel");
            return (Criteria) this;
        }

        public Criteria andSciencelevelLessThanOrEqualTo(String value) {
            addCriterion("sciencelevel <=", value, "sciencelevel");
            return (Criteria) this;
        }

        public Criteria andSciencelevelLike(String value) {
            addCriterion("sciencelevel like", value, "sciencelevel");
            return (Criteria) this;
        }

        public Criteria andSciencelevelNotLike(String value) {
            addCriterion("sciencelevel not like", value, "sciencelevel");
            return (Criteria) this;
        }

        public Criteria andSciencelevelIn(List<String> values) {
            addCriterion("sciencelevel in", values, "sciencelevel");
            return (Criteria) this;
        }

        public Criteria andSciencelevelNotIn(List<String> values) {
            addCriterion("sciencelevel not in", values, "sciencelevel");
            return (Criteria) this;
        }

        public Criteria andSciencelevelBetween(String value1, String value2) {
            addCriterion("sciencelevel between", value1, value2, "sciencelevel");
            return (Criteria) this;
        }

        public Criteria andSciencelevelNotBetween(String value1, String value2) {
            addCriterion("sciencelevel not between", value1, value2, "sciencelevel");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeIsNull() {
            addCriterion("sciencestarttime is null");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeIsNotNull() {
            addCriterion("sciencestarttime is not null");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeEqualTo(String value) {
            addCriterion("sciencestarttime =", value, "sciencestarttime");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeNotEqualTo(String value) {
            addCriterion("sciencestarttime <>", value, "sciencestarttime");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeGreaterThan(String value) {
            addCriterion("sciencestarttime >", value, "sciencestarttime");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("sciencestarttime >=", value, "sciencestarttime");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeLessThan(String value) {
            addCriterion("sciencestarttime <", value, "sciencestarttime");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeLessThanOrEqualTo(String value) {
            addCriterion("sciencestarttime <=", value, "sciencestarttime");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeLike(String value) {
            addCriterion("sciencestarttime like", value, "sciencestarttime");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeNotLike(String value) {
            addCriterion("sciencestarttime not like", value, "sciencestarttime");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeIn(List<String> values) {
            addCriterion("sciencestarttime in", values, "sciencestarttime");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeNotIn(List<String> values) {
            addCriterion("sciencestarttime not in", values, "sciencestarttime");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeBetween(String value1, String value2) {
            addCriterion("sciencestarttime between", value1, value2, "sciencestarttime");
            return (Criteria) this;
        }

        public Criteria andSciencestarttimeNotBetween(String value1, String value2) {
            addCriterion("sciencestarttime not between", value1, value2, "sciencestarttime");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeIsNull() {
            addCriterion("scienceendtime is null");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeIsNotNull() {
            addCriterion("scienceendtime is not null");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeEqualTo(String value) {
            addCriterion("scienceendtime =", value, "scienceendtime");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeNotEqualTo(String value) {
            addCriterion("scienceendtime <>", value, "scienceendtime");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeGreaterThan(String value) {
            addCriterion("scienceendtime >", value, "scienceendtime");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("scienceendtime >=", value, "scienceendtime");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeLessThan(String value) {
            addCriterion("scienceendtime <", value, "scienceendtime");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeLessThanOrEqualTo(String value) {
            addCriterion("scienceendtime <=", value, "scienceendtime");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeLike(String value) {
            addCriterion("scienceendtime like", value, "scienceendtime");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeNotLike(String value) {
            addCriterion("scienceendtime not like", value, "scienceendtime");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeIn(List<String> values) {
            addCriterion("scienceendtime in", values, "scienceendtime");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeNotIn(List<String> values) {
            addCriterion("scienceendtime not in", values, "scienceendtime");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeBetween(String value1, String value2) {
            addCriterion("scienceendtime between", value1, value2, "scienceendtime");
            return (Criteria) this;
        }

        public Criteria andScienceendtimeNotBetween(String value1, String value2) {
            addCriterion("scienceendtime not between", value1, value2, "scienceendtime");
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