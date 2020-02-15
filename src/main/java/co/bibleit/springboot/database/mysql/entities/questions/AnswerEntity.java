package co.bibleit.springboot.database.mysql.entities.questions;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="answers")
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="answer")
    private String answer;

    @OneToOne(mappedBy="answerEntity",
            cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private QuestionEntity questionEntity;

    @OneToMany(fetch=FetchType.LAZY,
            mappedBy="answerEntity", // this id the answerEntity in the VersesEntity.class
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<VersesEntity> versesEntityList;

    public AnswerEntity() {
    }

    public AnswerEntity(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionEntity getQuestionEntity() {
        return questionEntity;
    }

    public void setQuestionEntity(QuestionEntity questionEntity) {
        this.questionEntity = questionEntity;
    }

    public List<VersesEntity> getVersesEntityList() {
        return versesEntityList;
    }

    public void setVersesEntityList(List<VersesEntity> versesEntityList) {
        this.versesEntityList = versesEntityList;
    }

    // convenience method to setup the bi relational relationship
    public void add(VersesEntity versesEntity){
        if (versesEntity == null){
            versesEntityList = new ArrayList<>();
        }
        versesEntityList.add(versesEntity);
        versesEntity.setAnswerEntity(this);
    }

    @Override
    public String toString() {
        return "AnswerEntity{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                '}';
    }
}
