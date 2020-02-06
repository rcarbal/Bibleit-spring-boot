package co.bibleit.springboot.configurations;


import co.bibleit.springboot.bible.classes.beans.BibleDataContainer;
import co.bibleit.springboot.bible.classes.beans.HolyBible;
import co.bibleit.springboot.bible.interfaces.beans.Book;
import co.bibleit.springboot.bible.interfaces.beans.ScriptureCollection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Map;

@Configuration
//@ComponentScan("co.bibleit.springboot")
@PropertySource("application.properties")
public class BibleitConfig {

    @Bean
    public Map<String, Book> dataContainer(){
        return new BibleDataContainer();
    }

    @Bean
    public ScriptureCollection holyBible(){
        return new HolyBible();
    }

}
