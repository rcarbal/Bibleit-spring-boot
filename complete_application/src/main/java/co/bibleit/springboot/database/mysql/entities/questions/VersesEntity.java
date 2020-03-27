package co.bibleit.springboot.database.mysql.entities.questions;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="verses")
public class VersesEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="number")
    private int number;

    @Column(name="verse")
    private String verse;

    @ManyToOne(cascade={
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name="answer_id")
    private AnswerEntity answerEntity;

    @ManyToMany(fetch=FetchType.LAZY,
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name="verse_suggestion",
            joinColumns=@JoinColumn(name="verse_id"),
            inverseJoinColumns=@JoinColumn(name="suggestion_id")
    )
    private List<SuggestionEntity> suggestionEntityList;

    public VersesEntity() {
    }

    public VersesEntity(int number, String verse) {
        this.number = number;
        this.verse = verse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getVerse() {
        return verse;
    }

    public void setVerse(String verse) {
        this.verse = verse;
    }

    public AnswerEntity getAnswerEntity() {
        return answerEntity;
    }

    public void setAnswerEntity(AnswerEntity answerEntity) {
        this.answerEntity = answerEntity;
    }

    public List<SuggestionEntity> getSuggestionEntityList() {
        return suggestionEntityList;
    }

    public void setSuggestionEntityList(List<SuggestionEntity> suggestionEntityList) {
        this.suggestionEntityList = suggestionEntityList;
    }

    @Override
    public String toString() {
        return "VersesEntity{" +
                "id=" + id +
                ", number=" + number +
                ", verse='" + verse + '\'' +
                '}';
    }
}
