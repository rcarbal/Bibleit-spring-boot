package co.bibleit.springboot.utilities.entitybuilder;

import co.bibleit.springboot.database.mysql.entities.BibleBook;
import co.bibleit.springboot.database.mysql.entities.DatabaseEntity;

public class BibleBookEntity implements EntityType {
    @Override
    public DatabaseEntity getEntity() {
        return new BibleBook();
    }
}
