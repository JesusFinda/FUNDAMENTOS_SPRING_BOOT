package ao.com.jesusfinda.firstprojectsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ao.com.jesusfinda")
public class FirstprojectspApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectspApplication.class, args);
	}

}
