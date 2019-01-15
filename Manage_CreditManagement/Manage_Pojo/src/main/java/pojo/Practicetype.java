package pojo;

public class Practicetype {
    private Integer id;

    private String practicetime;

    private String practicename;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPracticetime() {
        return practicetime;
    }

    public void setPracticetime(String practicetime) {
        this.practicetime = practicetime == null ? null : practicetime.trim();
    }

    public String getPracticename() {
        return practicename;
    }

    public void setPracticename(String practicename) {
        this.practicename = practicename == null ? null : practicename.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}