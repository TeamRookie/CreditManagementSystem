package pojo;

import java.io.Serializable;

public class Enterpriserules implements Serializable {
    private Integer id;

    private String enterpriselevel;

    private Float credit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnterpriselevel() {
        return enterpriselevel;
    }

    public void setEnterpriselevel(String enterpriselevel) {
        this.enterpriselevel = enterpriselevel == null ? null : enterpriselevel.trim();
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }
}