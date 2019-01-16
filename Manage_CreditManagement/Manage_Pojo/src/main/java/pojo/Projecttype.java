package pojo;

public class Projecttype {
    private Integer id;

    private String projecttime;

    private String type;

    private String projectname;

    private String projectid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjecttime() {
        return projecttime;
    }

    public void setProjecttime(String projecttime) {
        this.projecttime = projecttime == null ? null : projecttime.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }
}