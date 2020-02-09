package co.bibleit.springboot.utilities.entitybuilder;

public class EntityFactory {

    public static EntityType getEntityType(String entityType){
        if (entityType == null){
            return null;
        }
        else if (entityType.equalsIgnoreCase("SECTION")){
            return new BibleSectionEntity();
        }
        else if (entityType.equalsIgnoreCase("BOOK")){
            return new BibleBookEntity();
        }
        return null;
    }
}
