package co.bibleit.springboot.database.mysql.entities.questions;

import javax.persistence.*;

@Entity
@Table(name="suggestion")
public class SuggestionEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="suggest")
    private String suggestion;

    public SuggestionEntity() {
    }

    public SuggestionEntity(String suggestion) {
        this.suggestion = suggestion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public String toString() {
        return "SuggestionEntity{" +
                "id=" + id +
                ", suggestion='" + suggestion + '\'' +
                '}';
    }
}
