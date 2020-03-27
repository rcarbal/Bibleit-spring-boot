package co.bibleit.springboot.utilities.entitybuilder;

import co.bibleit.springboot.database.mysql.entities.bible.BibleSection;

public class BibleSectionEntity implements EntityType {

    @Override
    public BibleSection getEntity() {
        return new BibleSection();
    }
}
