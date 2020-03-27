package co.bibleit.springboot.database.mysql.entities.bible;

import javax.persistence.*;

@Entity
@Table(name="book")
public class BibleBook implements DatabaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="section_id")
    private BibleSection bibleSection;

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

//    public List<BibleBookChapter> getChapters() {
//        return chapters;
//    }
//
//    public void setChapters(List<BibleBookChapter> chapters) {
//        this.chapters = chapters;
//    }
//    // convenience method for bi-directional relationship.
//    public void add(BibleBookChapter tempChapter){
//        if (chapters == null){
//            chapters = new ArrayList<>();
//        }
//
//        chapters.add(tempChapter);
//        tempChapter.setAssociation(this);
//    }
}
