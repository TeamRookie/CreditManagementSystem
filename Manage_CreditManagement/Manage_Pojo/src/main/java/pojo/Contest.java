package pojo;

import java.io.Serializable;

public class Contest implements Serializable
{
    private Integer id;

    private String workname;

    private String contesttime;

    private String contestname;

    private String contestlevel;

    private String rank;

    private String cachet;

    private String booktime;

    private String member;

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

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname == null ? null : workname.trim();
    }

    public String getContesttime() {
        return contesttime;
    }

    public void setContesttime(String contesttime) {
        this.contesttime = contesttime == null ? null : contesttime.trim();
    }

    public String getContestname() {
        return contestname;
    }

    public void setContestname(String contestname) {
        this.contestname = contestname == null ? null : contestname.trim();
    }

    public String getContestlevel() {
        return contestlevel;
    }

    public void setContestlevel(String contestlevel) {
        this.contestlevel = contestlevel == null ? null : contestlevel.trim();
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