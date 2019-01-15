package pojo;

public class Contest {
    private Integer id;

    private String contesttime;

    private String theme;

    private String level;

    private String rank;

    private String cachet;

    private String booktime;

    private String member;

    private String teachernum;

    private String stunum;

    private Float credit;

    private Integer facultynum;

    private Integer majornum;

    private Integer gradenum;

    private String stuname;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContesttime() {
        return contesttime;
    }

    public void setContesttime(String contesttime) {
        this.contesttime = contesttime == null ? null : contesttime.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getCachet() {
        return cachet;
    }

    public void setCachet(String cachet) {
        this.cachet = cachet == null ? null : cachet.trim();
    }

    public String getBooktime() {
        return booktime;
    }

    public void setBooktime(String booktime) {
        this.booktime = booktime == null ? null : booktime.trim();
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }

    public String getTeachernum() {
        return teachernum;
    }

    public void setTeachernum(String teachernum) {
        this.teachernum = teachernum == null ? null : teachernum.trim();
    }

    public String getStunum() {
        return stunum;
    }

    public void setStunum(String stunum) {
        this.stunum = stunum == null ? null : stunum.trim();
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public Integer getFacultynum() {
        return facultynum;
    }

    public void setFacultynum(Integer facultynum) {
        this.facultynum = facultynum;
    }

    public Integer getMajornum() {
        return majornum;
    }

    public void setMajornum(Integer majornum) {
        this.majornum = majornum;
    }

    public Integer getGradenum() {
        return gradenum;
    }

    public void setGradenum(Integer gradenum) {
        this.gradenum = gradenum;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}