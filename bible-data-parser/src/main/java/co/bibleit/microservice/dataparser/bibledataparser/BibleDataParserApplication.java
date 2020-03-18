package co.bibleit.microservice.dataparser.bibledataparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BibleDataParserApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibleDataParserApplication.class, args);
	}

}
