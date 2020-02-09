package co.bibleit.springboot.database.mysql.entities;


import javax.persistence.*;

@Entity
@Table(name="book")
public class BibleBookChapter implements DatabaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="number")
    private String number;

    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="book_id")
    private BibleBook associatedBook;

    public BibleBookChapter(){

    }

    public BibleBookChapter(String number) {
        this.number = number;
    }

    @Override
    public String getName() {
        return number;
    }

    @Override
    public void setName(String name) {
        this.number = name;
    }

    @Override
    public void setAssociation(DatabaseEntity usedAsAssociation) {
        this.associatedBook = (BibleBook) usedAsAssociation;
    }

    @Override
    public DatabaseEntity getAssociation() {
        return associatedBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BibleBookChapter{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", associatedBook=" + associatedBook +
                '}';
    }
}
