package co.bibleit.springboot.configurations;


import co.bibleit.springboot.bible.classes.beans.BibleDataContainerBean;
import co.bibleit.springboot.bible.classes.beans.HolyBibleBean;
import co.bibleit.springboot.bible.interfaces.beans.Book;
import co.bibleit.springboot.bible.interfaces.beans.ScriptureCollection;
import co.bibleit.springboot.bibleJson.classes.QuestionsJson;
import co.bibleit.springboot.bibleJson.interfaces.JsonProcessor;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
//@ComponentScan("co.bibleit.springboot")
//@PropertySource("application.properties")
public class BibleitConfig {


    @Bean
    public Map<String, Book> dataContainer(){
        return new BibleDataContainerBean();
    }

    @Bean
    public ScriptureCollection holyBible(){
        return new HolyBibleBean();
    }

    @Bean
    public JsonProcessor questionJsonProcessor(){
        return new QuestionsJson();
    }

    @Bean
    public ServletWebServerFactory servletWebServerFactory(){
        return new TomcatServletWebServerFactory();
    }


}
