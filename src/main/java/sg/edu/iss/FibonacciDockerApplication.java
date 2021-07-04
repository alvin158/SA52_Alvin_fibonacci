package sg.edu.iss;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FibonacciDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FibonacciDockerApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			
			};
		}
}
