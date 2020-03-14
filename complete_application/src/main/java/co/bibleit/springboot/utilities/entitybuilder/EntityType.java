package co.bibleit.springboot.utilities.entitybuilder;

import co.bibleit.springboot.database.mysql.entities.bible.DatabaseEntity;

public interface EntityType {

    DatabaseEntity getEntity();
}
