package pojo;

public class Contestrules {
    private Integer id;

    private String contestlevel;

    private String rank;

    private Float credit;

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