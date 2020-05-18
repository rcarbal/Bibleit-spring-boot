package co.bibleit.microservice.biblejsonparser.utils.josnExtractor;

import co.bibleit.microservice.biblejsonparser.dao.BibleJSONDaoImpl;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JSONObjectParserImplTest {

    @Test
    public void parseThroughJSONToGetBookName_TEST(){
        String book = "Genesis";
        BibleJSONDaoImpl dao = new BibleJSONDaoImpl();
        JSONObjectParserImpl parser = new JSONObjectParserImpl();
        JSONObject object = parser.getBook(book, dao.getBible());
        assertNotNull(object);
    }

}