package co.bibleit.microservice.bibledataendpoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("co.bibleit.microservice.bibledataendpoints")
@EnableDiscoveryClient
public class BibleDataEndpointsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibleDataEndpointsApplication.class, args);
	}

}
