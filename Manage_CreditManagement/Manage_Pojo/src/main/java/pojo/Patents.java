package pojo;

public class Patents {
    private Integer id;

    private String patentstype;

    private String patentsid;

    private String patentstime;

    private String proposer;

    private String inventor;

    private String patentsname;

    private String stunum;

    private String stuname;

    private Integer facultynum;

    private Integer majornum;

    private Integer gradenum;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatentstype() {
        return patentstype;
    }

    public void setPatentstype(String patentstype) {
        this.patentstype = patentstype == null ? null : patentstype.trim();
    }

    public String getPatentsid() {
        return patentsid;
    }

    public void setPatentsid(String patentsid) {
        this.patentsid = patentsid == null ? null : patentsid.trim();
    }

    public String getPatentstime() {
        return patentstime;
    }

    public void setPatentstime(String patentstime) {
        this.patentstime = patentstime == null ? null : patentstime.trim();
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer == null ? null : proposer.trim();
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor == null ? null : inventor.trim();
    }

    public String getPatentsname() {
        return patentsname;
    }

    public void setPatentsname(String patentsname) {
        this.patentsname = patentsname == null ? null : patentsname.trim();
    }

    public String getStunum() {
        return stunum;
    }

    public void setStunum(String stunum) {
        this.stunum = stunum == null ? null : stunum.trim();
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}