package pojo;

import java.util.ArrayList;
import java.util.List;

public class PatentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatentsExample() {
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

        public Criteria andPatentstypeIsNull() {
            addCriterion("patentstype is null");
            return (Criteria) this;
        }

        public Criteria andPatentstypeIsNotNull() {
            addCriterion("patentstype is not null");
            return (Criteria) this;
        }

        public Criteria andPatentstypeEqualTo(String value) {
            addCriterion("patentstype =", value, "patentstype");
            return (Criteria) this;
        }

        public Criteria andPatentstypeNotEqualTo(String value) {
            addCriterion("patentstype <>", value, "patentstype");
            return (Criteria) this;
        }

        public Criteria andPatentstypeGreaterThan(String value) {
            addCriterion("patentstype >", value, "patentstype");
            return (Criteria) this;
        }

        public Criteria andPatentstypeGreaterThanOrEqualTo(String value) {
            addCriterion("patentstype >=", value, "patentstype");
            return (Criteria) this;
        }

        public Criteria andPatentstypeLessThan(String value) {
            addCriterion("patentstype <", value, "patentstype");
            return (Criteria) this;
        }

        public Criteria andPatentstypeLessThanOrEqualTo(String value) {
            addCriterion("patentstype <=", value, "patentstype");
            return (Criteria) this;
        }

        public Criteria andPatentstypeLike(String value) {
            addCriterion("patentstype like", value, "patentstype");
            return (Criteria) this;
        }

        public Criteria andPatentstypeNotLike(String value) {
            addCriterion("patentstype not like", value, "patentstype");
            return (Criteria) this;
        }

        public Criteria andPatentstypeIn(List<String> values) {
            addCriterion("patentstype in", values, "patentstype");
            return (Criteria) this;
        }

        public Criteria andPatentstypeNotIn(List<String> values) {
            addCriterion("patentstype not in", values, "patentstype");
            return (Criteria) this;
        }

        public Criteria andPatentstypeBetween(String value1, String value2) {
            addCriterion("patentstype between", value1, value2, "patentstype");
            return (Criteria) this;
        }

        public Criteria andPatentstypeNotBetween(String value1, String value2) {
            addCriterion("patentstype not between", value1, value2, "patentstype");
            return (Criteria) this;
        }

        public Criteria andPatentsidIsNull() {
            addCriterion("patentsid is null");
            return (Criteria) this;
        }

        public Criteria andPatentsidIsNotNull() {
            addCriterion("patentsid is not null");
            return (Criteria) this;
        }

        public Criteria andPatentsidEqualTo(String value) {
            addCriterion("patentsid =", value, "patentsid");
            return (Criteria) this;
        }

        public Criteria andPatentsidNotEqualTo(String value) {
            addCriterion("patentsid <>", value, "patentsid");
            return (Criteria) this;
        }

        public Criteria andPatentsidGreaterThan(String value) {
            addCriterion("patentsid >", value, "patentsid");
            return (Criteria) this;
        }

        public Criteria andPatentsidGreaterThanOrEqualTo(String value) {
            addCriterion("patentsid >=", value, "patentsid");
            return (Criteria) this;
        }

        public Criteria andPatentsidLessThan(String value) {
            addCriterion("patentsid <", value, "patentsid");
            return (Criteria) this;
        }

        public Criteria andPatentsidLessThanOrEqualTo(String value) {
            addCriterion("patentsid <=", value, "patentsid");
            return (Criteria) this;
        }

        public Criteria andPatentsidLike(String value) {
            addCriterion("patentsid like", value, "patentsid");
            return (Criteria) this;
        }

        public Criteria andPatentsidNotLike(String value) {
            addCriterion("patentsid not like", value, "patentsid");
            return (Criteria) this;
        }

        public Criteria andPatentsidIn(List<String> values) {
            addCriterion("patentsid in", values, "patentsid");
            return (Criteria) this;
        }

        public Criteria andPatentsidNotIn(List<String> values) {
            addCriterion("patentsid not in", values, "patentsid");
            return (Criteria) this;
        }

        public Criteria andPatentsidBetween(String value1, String value2) {
            addCriterion("patentsid between", value1, value2, "patentsid");
            return (Criteria) this;
        }

        public Criteria andPatentsidNotBetween(String value1, String value2) {
            addCriterion("patentsid not between", value1, value2, "patentsid");
            return (Criteria) this;
        }

        public Criteria andPatentstimeIsNull() {
            addCriterion("patentstime is null");
            return (Criteria) this;
        }

        public Criteria andPatentstimeIsNotNull() {
            addCriterion("patentstime is not null");
            return (Criteria) this;
        }

        public Criteria andPatentstimeEqualTo(String value) {
            addCriterion("patentstime =", value, "patentstime");
            return (Criteria) this;
        }

        public Criteria andPatentstimeNotEqualTo(String value) {
            addCriterion("patentstime <>", value, "patentstime");
            return (Criteria) this;
        }

        public Criteria andPatentstimeGreaterThan(String value) {
            addCriterion("patentstime >", value, "patentstime");
            return (Criteria) this;
        }

        public Criteria andPatentstimeGreaterThanOrEqualTo(String value) {
            addCriterion("patentstime >=", value, "patentstime");
            return (Criteria) this;
        }

        public Criteria andPatentstimeLessThan(String value) {
            addCriterion("patentstime <", value, "patentstime");
            return (Criteria) this;
        }

        public Criteria andPatentstimeLessThanOrEqualTo(String value) {
            addCriterion("patentstime <=", value, "patentstime");
            return (Criteria) this;
        }

        public Criteria andPatentstimeLike(String value) {
            addCriterion("patentstime like", value, "patentstime");
            return (Criteria) this;
        }

        public Criteria andPatentstimeNotLike(String value) {
            addCriterion("patentstime not like", value, "patentstime");
            return (Criteria) this;
        }

        public Criteria andPatentstimeIn(List<String> values) {
            addCriterion("patentstime in", values, "patentstime");
            return (Criteria) this;
        }

        public Criteria andPatentstimeNotIn(List<String> values) {
            addCriterion("patentstime not in", values, "patentstime");
            return (Criteria) this;
        }

        public Criteria andPatentstimeBetween(String value1, String value2) {
            addCriterion("patentstime between", value1, value2, "patentstime");
            return (Criteria) this;
        }

        public Criteria andPatentstimeNotBetween(String value1, String value2) {
            addCriterion("patentstime not between", value1, value2, "patentstime");
            return (Criteria) this;
        }

        public Criteria andProposerIsNull() {
            addCriterion("proposer is null");
            return (Criteria) this;
        }

        public Criteria andProposerIsNotNull() {
            addCriterion("proposer is not null");
            return (Criteria) this;
        }

        public Criteria andProposerEqualTo(String value) {
            addCriterion("proposer =", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotEqualTo(String value) {
            addCriterion("proposer <>", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThan(String value) {
            addCriterion("proposer >", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThanOrEqualTo(String value) {
            addCriterion("proposer >=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThan(String value) {
            addCriterion("proposer <", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThanOrEqualTo(String value) {
            addCriterion("proposer <=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLike(String value) {
            addCriterion("proposer like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotLike(String value) {
            addCriterion("proposer not like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerIn(List<String> values) {
            addCriterion("proposer in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotIn(List<String> values) {
            addCriterion("proposer not in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerBetween(String value1, String value2) {
            addCriterion("proposer between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotBetween(String value1, String value2) {
            addCriterion("proposer not between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andInventorIsNull() {
            addCriterion("inventor is null");
            return (Criteria) this;
        }

        public Criteria andInventorIsNotNull() {
            addCriterion("inventor is not null");
            return (Criteria) this;
        }

        public Criteria andInventorEqualTo(String value) {
            addCriterion("inventor =", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotEqualTo(String value) {
            addCriterion("inventor <>", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorGreaterThan(String value) {
            addCriterion("inventor >", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorGreaterThanOrEqualTo(String value) {
            addCriterion("inventor >=", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorLessThan(String value) {
            addCriterion("inventor <", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorLessThanOrEqualTo(String value) {
            addCriterion("inventor <=", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorLike(String value) {
            addCriterion("inventor like", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotLike(String value) {
            addCriterion("inventor not like", value, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorIn(List<String> values) {
            addCriterion("inventor in", values, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotIn(List<String> values) {
            addCriterion("inventor not in", values, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorBetween(String value1, String value2) {
            addCriterion("inventor between", value1, value2, "inventor");
            return (Criteria) this;
        }

        public Criteria andInventorNotBetween(String value1, String value2) {
            addCriterion("inventor not between", value1, value2, "inventor");
            return (Criteria) this;
        }

        public Criteria andPatentsnameIsNull() {
            addCriterion("patentsname is null");
            return (Criteria) this;
        }

        public Criteria andPatentsnameIsNotNull() {
            addCriterion("patentsname is not null");
            return (Criteria) this;
        }

        public Criteria andPatentsnameEqualTo(String value) {
            addCriterion("patentsname =", value, "patentsname");
            return (Criteria) this;
        }

        public Criteria andPatentsnameNotEqualTo(String value) {
            addCriterion("patentsname <>", value, "patentsname");
            return (Criteria) this;
        }

        public Criteria andPatentsnameGreaterThan(String value) {
            addCriterion("patentsname >", value, "patentsname");
            return (Criteria) this;
        }

        public Criteria andPatentsnameGreaterThanOrEqualTo(String value) {
            addCriterion("patentsname >=", value, "patentsname");
            return (Criteria) this;
        }

        public Criteria andPatentsnameLessThan(String value) {
            addCriterion("patentsname <", value, "patentsname");
            return (Criteria) this;
        }

        public Criteria andPatentsnameLessThanOrEqualTo(String value) {
            addCriterion("patentsname <=", value, "patentsname");
            return (Criteria) this;
        }

        public Criteria andPatentsnameLike(String value) {
            addCriterion("patentsname like", value, "patentsname");
            return (Criteria) this;
        }

        public Criteria andPatentsnameNotLike(String value) {
            addCriterion("patentsname not like", value, "patentsname");
            return (Criteria) this;
        }

        public Criteria andPatentsnameIn(List<String> values) {
            addCriterion("patentsname in", values, "patentsname");
            return (Criteria) this;
        }

        public Criteria andPatentsnameNotIn(List<String> values) {
            addCriterion("patentsname not in", values, "patentsname");
            return (Criteria) this;
        }

        public Criteria andPatentsnameBetween(String value1, String value2) {
            addCriterion("patentsname between", value1, value2, "patentsname");
            return (Criteria) this;
        }

        public Criteria andPatentsnameNotBetween(String value1, String value2) {
            addCriterion("patentsname not between", value1, value2, "patentsname");
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

        public Criteria andFacultynumIsNull() {
            addCriterion("facultynum is null");
            return (Criteria) this;
        }

        public Criteria andFacultynumIsNotNull() {
            addCriterion("facultynum is not null");
            return (Criteria) this;
        }

        public Criteria andFacultynumEqualTo(Integer value) {
            addCriterion("facultynum =", value, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumNotEqualTo(Integer value) {
            addCriterion("facultynum <>", value, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumGreaterThan(Integer value) {
            addCriterion("facultynum >", value, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("facultynum >=", value, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumLessThan(Integer value) {
            addCriterion("facultynum <", value, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumLessThanOrEqualTo(Integer value) {
            addCriterion("facultynum <=", value, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumIn(List<Integer> values) {
            addCriterion("facultynum in", values, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumNotIn(List<Integer> values) {
            addCriterion("facultynum not in", values, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumBetween(Integer value1, Integer value2) {
            addCriterion("facultynum between", value1, value2, "facultynum");
            return (Criteria) this;
        }

        public Criteria andFacultynumNotBetween(Integer value1, Integer value2) {
            addCriterion("facultynum not between", value1, value2, "facultynum");
            return (Criteria) this;
        }

        public Criteria andMajornumIsNull() {
            addCriterion("majornum is null");
            return (Criteria) this;
        }

        public Criteria andMajornumIsNotNull() {
            addCriterion("majornum is not null");
            return (Criteria) this;
        }

        public Criteria andMajornumEqualTo(Integer value) {
            addCriterion("majornum =", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotEqualTo(Integer value) {
            addCriterion("majornum <>", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThan(Integer value) {
            addCriterion("majornum >", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThanOrEqualTo(Integer value) {
            addCriterion("majornum >=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThan(Integer value) {
            addCriterion("majornum <", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThanOrEqualTo(Integer value) {
            addCriterion("majornum <=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumIn(List<Integer> values) {
            addCriterion("majornum in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotIn(List<Integer> values) {
            addCriterion("majornum not in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumBetween(Integer value1, Integer value2) {
            addCriterion("majornum between", value1, value2, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotBetween(Integer value1, Integer value2) {
            addCriterion("majornum not between", value1, value2, "majornum");
            return (Criteria) this;
        }

        public Criteria andGradenumIsNull() {
            addCriterion("gradenum is null");
            return (Criteria) this;
        }

        public Criteria andGradenumIsNotNull() {
            addCriterion("gradenum is not null");
            return (Criteria) this;
        }

        public Criteria andGradenumEqualTo(Integer value) {
            addCriterion("gradenum =", value, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumNotEqualTo(Integer value) {
            addCriterion("gradenum <>", value, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumGreaterThan(Integer value) {
            addCriterion("gradenum >", value, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("gradenum >=", value, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumLessThan(Integer value) {
            addCriterion("gradenum <", value, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumLessThanOrEqualTo(Integer value) {
            addCriterion("gradenum <=", value, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumIn(List<Integer> values) {
            addCriterion("gradenum in", values, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumNotIn(List<Integer> values) {
            addCriterion("gradenum not in", values, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumBetween(Integer value1, Integer value2) {
            addCriterion("gradenum between", value1, value2, "gradenum");
            return (Criteria) this;
        }

        public Criteria andGradenumNotBetween(Integer value1, Integer value2) {
            addCriterion("gradenum not between", value1, value2, "gradenum");
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