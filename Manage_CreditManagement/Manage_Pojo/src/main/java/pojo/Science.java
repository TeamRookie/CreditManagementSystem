package pojo;

import java.io.Serializable;

public class Science implements Serializable {
    private Integer id;

    private String sciencename;

    private String sciencetype;

    private String sciencelevel;

    private String sciencestarttime;

    private String scienceendtime;

    private String teachername;

    private String responsibility;

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

    public String getSciencename() {
        return sciencename;
    }

    public void setSciencename(String sciencename) {
        this.sciencename = sciencename == null ? null : sciencename.trim();
    }

    public String getSciencetype() {
        return sciencetype;
    }

    public void setSciencetype(String sciencetype) {
        this.sciencetype = sciencetype == null ? null : sciencetype.trim();
    }

    public String getSciencelevel() {
        return sciencelevel;
    }

    public void setSciencelevel(String sciencelevel) {
        this.sciencelevel = sciencelevel == null ? null : sciencelevel.trim();
    }

    public String getSciencestarttime() {
        return sciencestarttime;
    }

    public void setSciencestarttime(String sciencestarttime) {
        this.sciencestarttime = sciencestarttime == null ? null : sciencestarttime.trim();
    }

    public String getScienceendtime() {
        return scienceendtime;
    }

    public void setScienceendtime(String scienceendtime) {
        this.scienceendtime = scienceendtime == null ? null : scienceendtime.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
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