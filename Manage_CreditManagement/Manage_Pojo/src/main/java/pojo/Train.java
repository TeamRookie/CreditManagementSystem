package pojo;

public class Train {
    private Integer id;

    private String traincontent;

    private String traintime;

    private String trainsite;

    private String organizationunit;

    private String tearchename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTraincontent() {
        return traincontent;
    }

    public void setTraincontent(String traincontent) {
        this.traincontent = traincontent == null ? null : traincontent.trim();
    }

    public String getTraintime() {
        return traintime;
    }

    public void setTraintime(String traintime) {
        this.traintime = traintime == null ? null : traintime.trim();
    }

    public String getTrainsite() {
        return trainsite;
    }

    public void setTrainsite(String trainsite) {
        this.trainsite = trainsite == null ? null : trainsite.trim();
    }

    public String getOrganizationunit() {
        return organizationunit;
    }

    public void setOrganizationunit(String organizationunit) {
        this.organizationunit = organizationunit == null ? null : organizationunit.trim();
    }

    public String getTearchename() {
        return tearchename;
    }

    public void setTearchename(String tearchename) {
        this.tearchename = tearchename == null ? null : tearchename.trim();
    }
}