package pojo;

import java.util.ArrayList;
import java.util.List;

public class ContestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContestExample() {
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

        public Criteria andWorknameIsNull() {
            addCriterion("workname is null");
            return (Criteria) this;
        }

        public Criteria andWorknameIsNotNull() {
            addCriterion("workname is not null");
            return (Criteria) this;
        }

        public Criteria andWorknameEqualTo(String value) {
            addCriterion("workname =", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotEqualTo(String value) {
            addCriterion("workname <>", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameGreaterThan(String value) {
            addCriterion("workname >", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameGreaterThanOrEqualTo(String value) {
            addCriterion("workname >=", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLessThan(String value) {
            addCriterion("workname <", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLessThanOrEqualTo(String value) {
            addCriterion("workname <=", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLike(String value) {
            addCriterion("workname like", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotLike(String value) {
            addCriterion("workname not like", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameIn(List<String> values) {
            addCriterion("workname in", values, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotIn(List<String> values) {
            addCriterion("workname not in", values, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameBetween(String value1, String value2) {
            addCriterion("workname between", value1, value2, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotBetween(String value1, String value2) {
            addCriterion("workname not between", value1, value2, "workname");
            return (Criteria) this;
        }

        public Criteria andContesttimeIsNull() {
            addCriterion("contesttime is null");
            return (Criteria) this;
        }

        public Criteria andContesttimeIsNotNull() {
            addCriterion("contesttime is not null");
            return (Criteria) this;
        }

        public Criteria andContesttimeEqualTo(String value) {
            addCriterion("contesttime =", value, "contesttime");
            return (Criteria) this;
        }

        public Criteria andContesttimeNotEqualTo(String value) {
            addCriterion("contesttime <>", value, "contesttime");
            return (Criteria) this;
        }

        public Criteria andContesttimeGreaterThan(String value) {
            addCriterion("contesttime >", value, "contesttime");
            return (Criteria) this;
        }

        public Criteria andContesttimeGreaterThanOrEqualTo(String value) {
            addCriterion("contesttime >=", value, "contesttime");
            return (Criteria) this;
        }

        public Criteria andContesttimeLessThan(String value) {
            addCriterion("contesttime <", value, "contesttime");
            return (Criteria) this;
        }

        public Criteria andContesttimeLessThanOrEqualTo(String value) {
            addCriterion("contesttime <=", value, "contesttime");
            return (Criteria) this;
        }

        public Criteria andContesttimeLike(String value) {
            addCriterion("contesttime like", value, "contesttime");
            return (Criteria) this;
        }

        public Criteria andContesttimeNotLike(String value) {
            addCriterion("contesttime not like", value, "contesttime");
            return (Criteria) this;
        }

        public Criteria andContesttimeIn(List<String> values) {
            addCriterion("contesttime in", values, "contesttime");
            return (Criteria) this;
        }

        public Criteria andContesttimeNotIn(List<String> values) {
            addCriterion("contesttime not in", values, "contesttime");
            return (Criteria) this;
        }

        public Criteria andContesttimeBetween(String value1, String value2) {
            addCriterion("contesttime between", value1, value2, "contesttime");
            return (Criteria) this;
        }

        public Criteria andContesttimeNotBetween(String value1, String value2) {
            addCriterion("contesttime not between", value1, value2, "contesttime");
            return (Criteria) this;
        }

        public Criteria andContestnameIsNull() {
            addCriterion("contestname is null");
            return (Criteria) this;
        }

        public Criteria andContestnameIsNotNull() {
            addCriterion("contestname is not null");
            return (Criteria) this;
        }

        public Criteria andContestnameEqualTo(String value) {
            addCriterion("contestname =", value, "contestname");
            return (Criteria) this;
        }

        public Criteria andContestnameNotEqualTo(String value) {
            addCriterion("contestname <>", value, "contestname");
            return (Criteria) this;
        }

        public Criteria andContestnameGreaterThan(String value) {
            addCriterion("contestname >", value, "contestname");
            return (Criteria) this;
        }

        public Criteria andContestnameGreaterThanOrEqualTo(String value) {
            addCriterion("contestname >=", value, "contestname");
            return (Criteria) this;
        }

        public Criteria andContestnameLessThan(String value) {
            addCriterion("contestname <", value, "contestname");
            return (Criteria) this;
        }

        public Criteria andContestnameLessThanOrEqualTo(String value) {
            addCriterion("contestname <=", value, "contestname");
            return (Criteria) this;
        }

        public Criteria andContestnameLike(String value) {
            addCriterion("contestname like", value, "contestname");
            return (Criteria) this;
        }

        public Criteria andContestnameNotLike(String value) {
            addCriterion("contestname not like", value, "contestname");
            return (Criteria) this;
        }

        public Criteria andContestnameIn(List<String> values) {
            addCriterion("contestname in", values, "contestname");
            return (Criteria) this;
        }

        public Criteria andContestnameNotIn(List<String> values) {
            addCriterion("contestname not in", values, "contestname");
            return (Criteria) this;
        }

        public Criteria andContestnameBetween(String value1, String value2) {
            addCriterion("contestname between", value1, value2, "contestname");
            return (Criteria) this;
        }

        public Criteria andContestnameNotBetween(String value1, String value2) {
            addCriterion("contestname not between", value1, value2, "contestname");
            return (Criteria) this;
        }

        public Criteria andContestlevelIsNull() {
            addCriterion("contestlevel is null");
            return (Criteria) this;
        }

        public Criteria andContestlevelIsNotNull() {
            addCriterion("contestlevel is not null");
            return (Criteria) this;
        }

        public Criteria andContestlevelEqualTo(String value) {
            addCriterion("contestlevel =", value, "contestlevel");
            return (Criteria) this;
        }

        public Criteria andContestlevelNotEqualTo(String value) {
            addCriterion("contestlevel <>", value, "contestlevel");
            return (Criteria) this;
        }

        public Criteria andContestlevelGreaterThan(String value) {
            addCriterion("contestlevel >", value, "contestlevel");
            return (Criteria) this;
        }

        public Criteria andContestlevelGreaterThanOrEqualTo(String value) {
            addCriterion("contestlevel >=", value, "contestlevel");
            return (Criteria) this;
        }

        public Criteria andContestlevelLessThan(String value) {
            addCriterion("contestlevel <", value, "contestlevel");
            return (Criteria) this;
        }

        public Criteria andContestlevelLessThanOrEqualTo(String value) {
            addCriterion("contestlevel <=", value, "contestlevel");
            return (Criteria) this;
        }

        public Criteria andContestlevelLike(String value) {
            addCriterion("contestlevel like", value, "contestlevel");
            return (Criteria) this;
        }

        public Criteria andContestlevelNotLike(String value) {
            addCriterion("contestlevel not like", value, "contestlevel");
            return (Criteria) this;
        }

        public Criteria andContestlevelIn(List<String> values) {
            addCriterion("contestlevel in", values, "contestlevel");
            return (Criteria) this;
        }

        public Criteria andContestlevelNotIn(List<String> values) {
            addCriterion("contestlevel not in", values, "contestlevel");
            return (Criteria) this;
        }

        public Criteria andContestlevelBetween(String value1, String value2) {
            addCriterion("contestlevel between", value1, value2, "contestlevel");
            return (Criteria) this;
        }

        public Criteria andContestlevelNotBetween(String value1, String value2) {
            addCriterion("contestlevel not between", value1, value2, "contestlevel");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("rank like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("rank not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andCachetIsNull() {
            addCriterion("cachet is null");
            return (Criteria) this;
        }

        public Criteria andCachetIsNotNull() {
            addCriterion("cachet is not null");
            return (Criteria) this;
        }

        public Criteria andCachetEqualTo(String value) {
            addCriterion("cachet =", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetNotEqualTo(String value) {
            addCriterion("cachet <>", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetGreaterThan(String value) {
            addCriterion("cachet >", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetGreaterThanOrEqualTo(String value) {
            addCriterion("cachet >=", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetLessThan(String value) {
            addCriterion("cachet <", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetLessThanOrEqualTo(String value) {
            addCriterion("cachet <=", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetLike(String value) {
            addCriterion("cachet like", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetNotLike(String value) {
            addCriterion("cachet not like", value, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetIn(List<String> values) {
            addCriterion("cachet in", values, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetNotIn(List<String> values) {
            addCriterion("cachet not in", values, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetBetween(String value1, String value2) {
            addCriterion("cachet between", value1, value2, "cachet");
            return (Criteria) this;
        }

        public Criteria andCachetNotBetween(String value1, String value2) {
            addCriterion("cachet not between", value1, value2, "cachet");
            return (Criteria) this;
        }

        public Criteria andBooktimeIsNull() {
            addCriterion("booktime is null");
            return (Criteria) this;
        }

        public Criteria andBooktimeIsNotNull() {
            addCriterion("booktime is not null");
            return (Criteria) this;
        }

        public Criteria andBooktimeEqualTo(String value) {
            addCriterion("booktime =", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeNotEqualTo(String value) {
            addCriterion("booktime <>", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeGreaterThan(String value) {
            addCriterion("booktime >", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeGreaterThanOrEqualTo(String value) {
            addCriterion("booktime >=", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeLessThan(String value) {
            addCriterion("booktime <", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeLessThanOrEqualTo(String value) {
            addCriterion("booktime <=", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeLike(String value) {
            addCriterion("booktime like", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeNotLike(String value) {
            addCriterion("booktime not like", value, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeIn(List<String> values) {
            addCriterion("booktime in", values, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeNotIn(List<String> values) {
            addCriterion("booktime not in", values, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeBetween(String value1, String value2) {
            addCriterion("booktime between", value1, value2, "booktime");
            return (Criteria) this;
        }

        public Criteria andBooktimeNotBetween(String value1, String value2) {
            addCriterion("booktime not between", value1, value2, "booktime");
            return (Criteria) this;
        }

        public Criteria andMemberIsNull() {
            addCriterion("member is null");
            return (Criteria) this;
        }

        public Criteria andMemberIsNotNull() {
            addCriterion("member is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEqualTo(String value) {
            addCriterion("member =", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotEqualTo(String value) {
            addCriterion("member <>", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThan(String value) {
            addCriterion("member >", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThanOrEqualTo(String value) {
            addCriterion("member >=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThan(String value) {
            addCriterion("member <", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThanOrEqualTo(String value) {
            addCriterion("member <=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLike(String value) {
            addCriterion("member like", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotLike(String value) {
            addCriterion("member not like", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberIn(List<String> values) {
            addCriterion("member in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotIn(List<String> values) {
            addCriterion("member not in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberBetween(String value1, String value2) {
            addCriterion("member between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotBetween(String value1, String value2) {
            addCriterion("member not between", value1, value2, "member");
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