package pojo;

import java.io.Serializable;

public class Safety implements Serializable {
    private Integer id;

    private String safetytime;

    private String safetylevel;

    private String teachername;

    private String stunum;

    private Float credit;

    private String facultyname;

    private String majorname;

    private String gradename;

    private String stuname;

    private String url;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSafetytime() {
        return safetytime;
    }

    public void setSafetytime(String safetytime) {
        this.safetytime = safetytime == null ? null : safetytime.trim();
    }

    public String getSafetylevel() {
        return safetylevel;
    }

    public void setSafetylevel(String safetylevel) {
        this.safetylevel = safetylevel == null ? null : safetylevel.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
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