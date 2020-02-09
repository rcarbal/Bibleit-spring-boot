package co.bibleit.springboot.database.mysql.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="book")
public class BibleBook implements DatabaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

//    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="section_id")
    private BibleSection bibleSection;

    // associated book refers to the name of the variable in the BibleBookChapter.
    @OneToMany(mappedBy="associatedBook", cascade={
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<BibleBookChapter> chapters;



    public BibleBook(){

    }

    public BibleBook(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAssociation(DatabaseEntity usedAsAssociation) {
        this.bibleSection = (BibleSection) usedAsAssociation;
    }
    @Override
    public DatabaseEntity getAssociation() {
        return bibleSection;
    }


    public BibleSection getBibleSection() {
        return bibleSection;
    }

    public void setBibleSection(BibleSection bibleSection) {
        this.bibleSection = bibleSection;
    }

    public List<BibleBookChapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<BibleBookChapter> chapters) {
        this.chapters = chapters;
    }
    // convenience method for bi-directional relationship.
    public void add(BibleBookChapter tempChapter){
        if (chapters == null){
            chapters = new ArrayList<>();
        }

        chapters.add(tempChapter);
        tempChapter.setAssociation(this);
    }
}
