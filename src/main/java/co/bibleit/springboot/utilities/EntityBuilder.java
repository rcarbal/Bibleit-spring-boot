package co.bibleit.springboot.utilities;

import co.bibleit.springboot.database.mysql.entities.DatabaseEntity;
import co.bibleit.springboot.utilities.entitybuilder.EntityFactory;
import co.bibleit.springboot.utilities.entitybuilder.EntityType;

import java.util.ArrayList;
import java.util.List;

public class EntityBuilder {

    public static List<DatabaseEntity> getEntityListWithoutAssociation(String entityToGetString,
                                                                       int numberOfRequiredEntities,
                                                                       String nameThatWillBeUsedInTheEntity) {
        List<DatabaseEntity> entitiesToReturn = new ArrayList<>();

        for (int i = 0 ; i < numberOfRequiredEntities; i++){
            EntityType entityType = EntityFactory.getEntityType(entityToGetString);
            DatabaseEntity entity = entityType.getEntity();
            entity.setName(nameThatWillBeUsedInTheEntity);

            entitiesToReturn.add(entity);
        }

        return entitiesToReturn;
    }

    public static List<DatabaseEntity> getEntityListWithoutAssociationFromAList(String entityToGetString,
                                                                       String nameThatWillBeUsedInTheEntity,
                                                                       List<String> listToBuildEntities) {

        List<DatabaseEntity> entitiesToReturn = new ArrayList<>();

        for (int i = 0 ; i < listToBuildEntities.size(); i++){
            EntityType entityType = EntityFactory.getEntityType(entityToGetString);
            DatabaseEntity entity = entityType.getEntity();
            String name = listToBuildEntities.get(i);
            entity.setName(name);

            entitiesToReturn.add(entity);
        }

        return entitiesToReturn;
    }

    public static List<DatabaseEntity> getEntityListWithAssociationFromAList(String entityToGetString,
                                                                                String nameThatWillBeUsedInTheEntity,
                                                                                List<String> listToBuildEntities,
                                                                                DatabaseEntity usedAsAssociation) {

        List<DatabaseEntity> entitiesToReturn = new ArrayList<>();

        for (int i = 0 ; i < listToBuildEntities.size(); i++){
            EntityType entityType = EntityFactory.getEntityType(entityToGetString);
            DatabaseEntity entity = entityType.getEntity();
            String name = listToBuildEntities.get(i);
            entity.setName(name);
            entity.setAssociation(usedAsAssociation);

            entitiesToReturn.add(entity);
        }

        return entitiesToReturn;
    }
}
