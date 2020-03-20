package co.bibleit.microservice.dataparser.bibledataparser;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class BibleDataParserApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibleDataParserApplication.class, args);
	}

	// you need this bean an always sampler for tracing
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}

}
