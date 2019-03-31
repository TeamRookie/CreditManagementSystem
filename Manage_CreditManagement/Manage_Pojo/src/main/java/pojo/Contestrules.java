package pojo;

import java.io.Serializable;

public class Contestrules implements Serializable
{
    private Integer id;

    private String contestlevel;

    private String rank;

    private Float credit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContestlevel() {
        return contestlevel;
    }

    public void setContestlevel(String contestlevel) {
        this.contestlevel = contestlevel == null ? null : contestlevel.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }
}