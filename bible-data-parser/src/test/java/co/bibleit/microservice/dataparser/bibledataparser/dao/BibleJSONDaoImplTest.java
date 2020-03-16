package co.bibleit.microservice.dataparser.bibledataparser.dao;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibleJSONDaoImplTest {

    @Test
    public void getCompleteBibleInJSON(){

        BibleJSONDaoImpl daoImplemented = new BibleJSONDaoImpl();

        assertEquals(66, daoImplemented.getBible().size());
    }

}