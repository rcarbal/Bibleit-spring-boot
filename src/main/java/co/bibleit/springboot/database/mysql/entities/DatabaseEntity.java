package co.bibleit.springboot.database.mysql.entities;

public interface DatabaseEntity {

    String getName();
    void setName(String name);

    void setAssociation(DatabaseEntity usedAsAssociation);

    DatabaseEntity getAssociation();
}
