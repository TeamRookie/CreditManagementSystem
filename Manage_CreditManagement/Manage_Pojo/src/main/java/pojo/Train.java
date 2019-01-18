package pojo;

public class Train {
    private Integer id;

    private String traincontent;

    private String traintime;

    private String trainsite;

    private String organizationunit;

    private String tearchename;

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

    public String getTraincontent() {
        return traincontent;
    }

    public void setTraincontent(String traincontent) {
        this.traincontent = traincontent == null ? null : traincontent.trim();
    }

    public String getTraintime() {
        return traintime;
    }

    public void setTraintime(String traintime) {
        this.traintime = traintime == null ? null : traintime.trim();
    }

    public String getTrainsite() {
        return trainsite;
    }

    public void setTrainsite(String trainsite) {
        this.trainsite = trainsite == null ? null : trainsite.trim();
    }

    public String getOrganizationunit() {
        return organizationunit;
    }

    public void setOrganizationunit(String organizationunit) {
        this.organizationunit = organizationunit == null ? null : organizationunit.trim();
    }

    public String getTearchename() {
        return tearchename;
    }

    public void setTearchename(String tearchename) {
        this.tearchename = tearchename == null ? null : tearchename.trim();
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