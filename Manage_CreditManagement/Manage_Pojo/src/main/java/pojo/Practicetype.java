package pojo;

import java.io.Serializable;

public class Practicetype implements Serializable
{
    private Integer id;

    private String practicetime;

    private String practicename;

    private String practicelevel;

    private String score;

    private static final long serialVersionUID = 1L;

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

    public String getPracticelevel() {
        return practicelevel;
    }

    public void setPracticelevel(String practicelevel) {
        this.practicelevel = practicelevel == null ? null : practicelevel.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }
}