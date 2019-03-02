package pojo;

import java.io.Serializable;

public class Sciencerules implements Serializable {
    private Integer id;

    private String sciencelevel;

    private String responsibility;

    private Float credit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSciencelevel() {
        return sciencelevel;
    }

    public void setSciencelevel(String sciencelevel) {
        this.sciencelevel = sciencelevel == null ? null : sciencelevel.trim();
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