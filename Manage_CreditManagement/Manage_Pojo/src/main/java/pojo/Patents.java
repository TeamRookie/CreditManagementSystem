package pojo;

public class Patents {
    private Integer id;

    private String patentstype;

    private String patentsid;

    private String patentstime;

    private String proposer;

    private String inventor;

    private String patentsname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatentstype() {
        return patentstype;
    }

    public void setPatentstype(String patentstype) {
        this.patentstype = patentstype == null ? null : patentstype.trim();
    }

    public String getPatentsid() {
        return patentsid;
    }

    public void setPatentsid(String patentsid) {
        this.patentsid = patentsid == null ? null : patentsid.trim();
    }

    public String getPatentstime() {
        return patentstime;
    }

    public void setPatentstime(String patentstime) {
        this.patentstime = patentstime == null ? null : patentstime.trim();
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer == null ? null : proposer.trim();
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor == null ? null : inventor.trim();
    }

    public String getPatentsname() {
        return patentsname;
    }

    public void setPatentsname(String patentsname) {
        this.patentsname = patentsname == null ? null : patentsname.trim();
    }
}