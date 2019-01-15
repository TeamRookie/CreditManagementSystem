package pojo;

public class Academic {
    private Integer id;

    private String academictime;

    private String theme;

    private String address;

    private String undertake;

    private Integer amount;

    private String teachernum;

    private String member;

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

    public String getAcademictime() {
        return academictime;
    }

    public void setAcademictime(String academictime) {
        this.academictime = academictime == null ? null : academictime.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getUndertake() {
        return undertake;
    }

    public void setUndertake(String undertake) {
        this.undertake = undertake == null ? null : undertake.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getTeachernum() {
        return teachernum;
    }

    public void setTeachernum(String teachernum) {
        this.teachernum = teachernum == null ? null : teachernum.trim();
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
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