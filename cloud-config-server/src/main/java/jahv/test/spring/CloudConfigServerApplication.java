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
		// http://localhost:8888/myApp/dev
        // http://localhost:8888/myApp/dev.json
        // http://localhost:8888/myApp-dev.json
	}
}
