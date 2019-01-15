package pojo;

public class Associationtype {
    private Integer id;

    private String associationtime;

    private String associationname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssociationtime() {
        return associationtime;
    }

    public void setAssociationtime(String associationtime) {
        this.associationtime = associationtime == null ? null : associationtime.trim();
    }

    public String getAssociationname() {
        return associationname;
    }

    public void setAssociationname(String associationname) {
        this.associationname = associationname == null ? null : associationname.trim();
    }
}