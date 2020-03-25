package co.bibleit.microservice.biblejsonparser;

import co.bibleit.microservice.biblejsonparser.dao.BibleJSONDaoImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParsingJSONFileTest {

    @Test
    public void parseJSONFile_passing(){
        BibleJSONDaoImpl imple = new BibleJSONDaoImpl();

        Assertions.assertTrue(imple.getBible().size() == 66);
    }

    @Test
    public void getContextOfCurrentFilt(){
        String s = getClass().getName();
        int i = s.lastIndexOf(".");
        if(i > -1) s = s.substring(i + 1);
        s = s + ".class";
        System.out.println("name " +s);
        Object testPath = this.getClass().getResource(s);
        System.out.println(testPath);
    }
}
