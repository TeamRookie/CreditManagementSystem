package pojo;

import java.io.Serializable;

public class Traintype implements Serializable {
    private Integer id;

    private String traintime;

    private String traincontent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTraintime() {
        return traintime;
    }

    public void setTraintime(String traintime) {
        this.traintime = traintime == null ? null : traintime.trim();
    }

    public String getTraincontent() {
        return traincontent;
    }

    public void setTraincontent(String traincontent) {
        this.traincontent = traincontent == null ? null : traincontent.trim();
    }
}