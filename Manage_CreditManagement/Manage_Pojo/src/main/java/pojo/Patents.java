package pojo;

public class Patents {
    private Integer id;

    private String patentstype;

    private String patentsid;

    private String patentstime;

    private String proposer;

    private String inventor;

    private String patentsname;

    private String responsibility;

    private String stunum;

    private Float credit;

    private String facultyname;

    private String majorname;

    private String gradename;

    private String stuname;

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

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility == null ? null : responsibility.trim();
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

    public String getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(String facultyname) {
        this.facultyname = facultyname == null ? null : facultyname.trim();
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public String getGradename() {
        return gradename;
    }

    public void setGradename(String gradename) {
        this.gradename = gradename == null ? null : gradename.trim();
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