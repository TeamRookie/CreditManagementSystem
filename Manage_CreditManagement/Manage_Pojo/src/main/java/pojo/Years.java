package pojo;

public class Years {
    private Integer id;

    private String schoolyear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolyear() {
        return schoolyear;
    }

    public void setSchoolyear(String schoolyear) {
        this.schoolyear = schoolyear == null ? null : schoolyear.trim();
    }
}