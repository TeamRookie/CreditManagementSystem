package pojo;

import java.io.Serializable;

public class Contesttype implements Serializable
{
    private Integer id;

    private String contesttime;

    private String contestname;

    private static final long serialVersionUID = 1L;

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

    public String getContestname() {
        return contestname;
    }

    public void setContestname(String contestname) {
        this.contestname = contestname == null ? null : contestname.trim();
    }
}