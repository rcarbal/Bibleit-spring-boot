package co.bibleit.springboot.database.mysql.entities;

import javax.persistence.*;

public class BibleBook implements DatabaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToOne(cascade=CascadeType.ALL)
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BibleSection getBibleSection() {
        return bibleSection;
    }

    public void setBibleSection(BibleSection bibleSection) {
        this.bibleSection = bibleSection;
    }
}
