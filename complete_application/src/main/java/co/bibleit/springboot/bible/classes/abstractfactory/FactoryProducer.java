package co.bibleit.springboot.bible.classes.abstractfactory;

public class FactoryProducer {

    public static BibleFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("PRIMARY")){
            return new PrimaryBibleFactory();
        }
        else if (choice.equalsIgnoreCase("SECONDARY")){
            return new SecondaryBibleFactory();
        }
        return null;
    }
}
