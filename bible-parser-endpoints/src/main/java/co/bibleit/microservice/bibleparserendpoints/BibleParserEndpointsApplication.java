package co.bibleit.microservice.bibleparserendpoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("co.bibleit.microservice.bibleparserendpoints")
public class BibleParserEndpointsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibleParserEndpointsApplication.class, args);
	}

}
