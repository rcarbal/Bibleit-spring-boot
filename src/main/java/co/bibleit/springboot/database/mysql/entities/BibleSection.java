package co.bibleit.springboot.database.mysql.entities;

import javax.persistence.*;

@Entity
@Table(name="bible_section")
public class BibleSection implements DatabaseEntity{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BibleSections{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
