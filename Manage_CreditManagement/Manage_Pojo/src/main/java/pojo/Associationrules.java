package pojo;

import java.io.Serializable;

public class Associationrules implements Serializable
{
    private Integer id;

    private String associationlevel;

    private String responsibility;

    private Float credit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssociationlevel() {
        return associationlevel;
    }

    public void setAssociationlevel(String associationlevel) {
        this.associationlevel = associationlevel == null ? null : associationlevel.trim();
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility == null ? null : responsibility.trim();
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }
}