package co.bibleit.springboot.database.mysql.entities.questions;

import javax.persistence.*;

@Entity
@Table(name="questions")
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="question")
    private String question;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="answer_id")
    private AnswerEntity answerEntity;



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

    public AnswerEntity getAnswerEntity() {
        return answerEntity;
    }

    public void setAnswerEntity(AnswerEntity answerEntity) {
        this.answerEntity = answerEntity;
    }

    @Override
    public String toString() {
        return "QuestionEntity{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answerEntity=" + answerEntity +
                '}';
    }
}
