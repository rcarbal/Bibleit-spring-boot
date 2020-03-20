package co.bibleit.microservice.bibleparserendpoints;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients("co.bibleit.microservice.bibleparserendpoints")
@EnableDiscoveryClient
public class BibleParserEndpointsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibleParserEndpointsApplication.class, args);
	}

	// you need this bean an always sampler for tracing
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}

}
