package co.bibleit.springboot.database.mysql.entities.questions;

import javax.persistence.*;

@Entity
@Table(name="question")
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="question")
    private String question;

    public QuestionEntity() {
    }

    public QuestionEntity(String question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "QuestionEntity{" +
                "id=" + id +
                ", answer='" + question + '\'' +
                '}';
    }
}
