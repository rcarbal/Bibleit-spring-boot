package co.bibleit.springboot.database.mysql.entities.bible;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="bible_section")
public class BibleSection implements DatabaseEntity{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy="bibleSection", cascade={
        CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<BibleBook> books;



    public BibleSection() {
    }

    public BibleSection(String name) {
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
    }

    @Override
    public DatabaseEntity getAssociation() {
        return null;
    }

    public List<BibleBook> getBooks() {
        return books;
    }

    public void setBooks(List<BibleBook> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BibleSections{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

        // convenience method for bi-directional relationship.
    public void add(BibleBook tempBooks){
        if (books == null){
            books = new ArrayList<>();
        }

        books.add(tempBooks);
        tempBooks.setAssociation(this);
    }
}
