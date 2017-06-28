package jahv.test.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerApplication.class, args);

		// For invoke
		// http://localhost:8888/{fileName}/{profile} if no profile, then use default
		//		http://localhost:8888/db/default
		//		http://localhost:8888/db/dev
		//		http://localhost:8888/db/qa
		//		http://localhost:8888/db/prod
	}
}
