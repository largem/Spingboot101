package example.springboot101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringBoot101Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot101Application.class, args);
	}
}
