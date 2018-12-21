package pl.piomin.services.caller.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Callme {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String message;
    @Column(name = "add_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addDate;

    public Callme() {
    }

    public Callme(String message, Date addDate) {
        this.message = message;
        this.addDate = addDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

}
