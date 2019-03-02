package pojo;

import java.io.Serializable;

public class Productionrules implements Serializable {
    private Integer id;

    private String productionlevel;

    private String responsibility;

    private Float credit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductionlevel() {
        return productionlevel;
    }

    public void setProductionlevel(String productionlevel) {
        this.productionlevel = productionlevel == null ? null : productionlevel.trim();
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