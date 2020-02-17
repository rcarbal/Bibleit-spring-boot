package co.bibleit.springboot.database.mysql.entities.questions;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="suggestion")
public class SuggestionEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="suggest")
    private String suggestion;

    @ManyToMany(fetch=FetchType.LAZY,
            cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name="verse_suggestion",
            joinColumns=@JoinColumn(name="suggestion_id"),
            inverseJoinColumns=@JoinColumn(name="verse_id")
    )
    private List<VersesEntity> versesEntityList;

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

    public List<VersesEntity> getVersesEntityList() {
        return versesEntityList;
    }

    public void setVersesEntityList(List<VersesEntity> versesEntityList) {
        this.versesEntityList = versesEntityList;
    }

    public void addVerse(VersesEntity verse){
        if (versesEntityList == null){
            versesEntityList = new ArrayList<>();
        }

        versesEntityList.add(verse);
    }

    @Override
    public String toString() {
        return "SuggestionEntity{" +
                "id=" + id +
                ", suggestion='" + suggestion + '\'' +
                '}';
    }
}
