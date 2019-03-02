package pojo;

import java.io.Serializable;

public class Studiotype implements Serializable {
    private Integer id;

    private String studiotime;

    private String department;

    private String studioname;

    private String studiolevel;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudiotime() {
        return studiotime;
    }

    public void setStudiotime(String studiotime) {
        this.studiotime = studiotime == null ? null : studiotime.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getStudioname() {
        return studioname;
    }

    public void setStudioname(String studioname) {
        this.studioname = studioname == null ? null : studioname.trim();
    }

    public String getStudiolevel() {
        return studiolevel;
    }

    public void setStudiolevel(String studiolevel) {
        this.studiolevel = studiolevel == null ? null : studiolevel.trim();
    }
}