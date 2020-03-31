package co.bibleit.microservice.biblejsonparser;

import co.bibleit.microservice.biblejsonparser.utl.environment.InstanceInformationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BibleJsonParserApplicationTests {

	@Autowired
	private InstanceInformationService instanceInfo;

	@Test
	void contextLoads() {
	}

	@Test
	public void getInstanceInformationString(){
		String instanceString = instanceInfo.retrieveInstanceInfo();

		System.out.println("\n Current environment information.");
		System.out.println(instanceString + "\n");
		Assertions.assertTrue(instanceString != null);
	}

}
