package pojo;

public class Credentialrules {
    private Integer id;

    private String credentiallevel;

    private Float credit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCredentiallevel() {
        return credentiallevel;
    }

    public void setCredentiallevel(String credentiallevel) {
        this.credentiallevel = credentiallevel == null ? null : credentiallevel.trim();
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }
}