package pojo;

import java.io.Serializable;

public class Safetyrules implements Serializable
{
    private Integer id;

    private String safetylevel;

    private Float credit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSafetylevel() {
        return safetylevel;
    }

    public void setSafetylevel(String safetylevel) {
        this.safetylevel = safetylevel == null ? null : safetylevel.trim();
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }
}