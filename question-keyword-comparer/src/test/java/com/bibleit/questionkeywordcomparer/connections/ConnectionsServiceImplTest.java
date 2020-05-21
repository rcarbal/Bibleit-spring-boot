package com.bibleit.questionkeywordcomparer.connections;

import com.bibleit.questionkeywordcomparer.model.QuestionAnswerImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConnectionsServiceImplTest {

    ConnectionsService serv = new ConnectionsServiceImpl();

    @Test
    public void connectToQuestionRetrievalService_Test(){
        //call connections
        ConnectionsServiceImpl connectionsServiceImpl = new ConnectionsServiceImpl();
        QuestionAnswerImpl[] questions = connectionsServiceImpl.getAllResponse();
        assertNotNull(questions);
    }

    @Test
    public void getFirstQuestionFromQuestionRetrievalService_Test(){
        // Get a single item
        ConnectionsServiceImpl connectionsServiceImpl = new ConnectionsServiceImpl();
        int index = 1;
//        QuestionAnswerImpl response = connectionsServiceImpl.getIndexResponse(index);
    }

    @Test
    public void testWebClientDocumentation(){

    }

    @Test
    public void makeTestRequest(){
        
        QuestionAnswerImpl[] arr = new QuestionAnswerImpl[2];
        
        QuestionAnswerImpl data = new QuestionAnswerImpl();
        data.setQuestion("why did God limit humans lifespan");
        data.setAnswer("This is a test answer");
        data.setVerse("This is the verse");
        data.setKeywords("verse");

        QuestionAnswerImpl data2 = new QuestionAnswerImpl();
        data2.setQuestion("why did God limit humans lifespan2");
        data2.setAnswer("This is a test answer2");
        data2.setVerse("This is the verse2");
        data2.setKeywords("verse2");
        
        arr[0] = data;
        arr[1] = data2;
        
        
        String uri = "http://localhost:8400";
        QuestionAnswerImpl[]  response =  serv.testPostConnection(uri, arr);
        assertNotNull(response);
    }
    
    @Test
    public void getQuestionsByPriority(){
        String uri = "http://localhost:8400";
        String userInput = "God create humans";
        String jsonString = "[{\"id\":254,\"question\":\"why did God limit humans lifespan\",\"answer\":\"The answer " +
                "is not found\",\"verse\":\"Verse NOT FOUND\",\"note\":null,\"keywords\":\"found answer\",\"score\"" +
                ":2.0,\"matches\":\"God:God humans:humans \"},{\"id\":253,\"question\":\"did God limit humans " +
                "lifespan?\",\"answer\":\"God declared that mankind lifespan would be 120 years.\",\"verse\":" +
                "\"Genesis 6:3\",\"note\":null,\"keywords\":\"lifespan god mankind years declared\",\"score\":2.0," +
                "\"matches\":\"God:God humans:humans \"},{\"id\":250,\"question\":\"why did the sons of God take and" +
                " marry the daughters of humans?\",\"answer\":\"The sons of God saw that women were beautiful, so " +
                "they took and marry which ever they choose.\",\"verse\":\"Genesis 6:1-Genesis 6:2\",\"note\":null," +
                "\"keywords\":\"choose god women saw sons took beautiful marry\",\"score\":2.0,\"matches\":\"God:God " +
                "humans:humans? \"},{\"id\":249,\"question\":\"what did the sons of God do to the daughters of " +
                "humans?\",\"answer\":\"The sons of God took any of the women they choose, and marry them.\",\"" +
                "verse\":\"Genesis 6:1-Genesis 6:2\",\"note\":null,\"keywords\":\"choose god women sons took marry\"," +
                "\"score\":2.0,\"matches\":\"God:God humans:humans? \"},{\"id\":196,\"question\":\"Did God name humans " +
                "\\\"Mankind\\\"?\",\"answer\":\"When God created humans he called them \\\"Mankind.\",\"verse\":" +
                "\"Genesis 5:2\",\"note\":null,\"keywords\":\"god mankind created humans called\",\"score\":2.0," +
                "\"matches\":\"God:God humans:humans \"},{\"id\":80,\"question\":\"what did God create with Adam's " +
                "rib?\",\"answer\":\"God used Adams's rib to create a women.\",\"verse\":\"Genesis 2:22\",\"note\":" +
                "null,\"keywords\":\"god women rib create adams\",\"score\":2.0,\"matches\":\"God:God create:create " +
                "\"},{\"id\":40,\"question\":\"when did God create all the animals that walk on land?\",\"answer\"" +
                ":\"God created all the animals that walk on the ground on the sixth day of creation, along with" +
                " mankind.\",\"verse\":\"Genesis 1:24-Genesis 1:25, Genesis 1:31\",\"note\":null,\"keywords\":\"god " +
                "creation walk created animals sixth mankind ground day\",\"score\":2.0,\"matches\":\"God:God create:" +
                "create \"},{\"id\":39,\"question\":\"when did God create mankind?\",\"answer\":\"God created mankind " +
                "on the sixth day of creation.\",\"verse\":\"Genesis 1:26-Genesis 1:31\",\"note\":null,\"keywords\"" +
                ":\"god creation sixth mankind created day\",\"score\":2.0,\"matches\":\"God:God create:create \"}," +
                "{\"id\":33,\"question\":\"how many genders did God create for mankind?\",\"answer\":\"God created " +
                "two genders for mankind, male and female.\",\"verse\":\"Genesis 1:27, Genesis 5:1\",\"note\":null," +
                "\"keywords\":\"god mankind created female genders male\",\"score\":2.0,\"matches\":\"God:God create:" +
                "create \"},{\"id\":31,\"question\":\"did God create man according to his image?\",\"answer\":\"God " +
                "declared man would be according to his likeness, and image.\",\"verse\":\"Genesis 1:26-Genesis 1:27," +
                " Genesis 5:1\",\"note\":null,\"keywords\":\"god image man likeness declared according\",\"score\"" +
                ":2.0,\"matches\":\"God:God create:create \"}]";

//        QuestionAnswer[] sorted = serv.sortListByInput()

    }

}