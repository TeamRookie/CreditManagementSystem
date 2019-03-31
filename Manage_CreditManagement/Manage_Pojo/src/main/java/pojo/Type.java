package pojo;

import java.io.Serializable;

public class Type implements Serializable
{
    private Integer id;

    private String typename;

    private String informationurl;

    private String rulesurl;

    private String importtype;

    private Integer disable;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getInformationurl() {
        return informationurl;
    }

    public void setInformationurl(String informationurl) {
        this.informationurl = informationurl == null ? null : informationurl.trim();
    }

    public String getRulesurl() {
        return rulesurl;
    }

    public void setRulesurl(String rulesurl) {
        this.rulesurl = rulesurl == null ? null : rulesurl.trim();
    }

    public String getImporttype() {
        return importtype;
    }

    public void setImporttype(String importtype) {
        this.importtype = importtype == null ? null : importtype.trim();
    }

    public Integer getDisable() {
        return disable;
    }

    public void setDisable(Integer disable) {
        this.disable = disable;
    }
}