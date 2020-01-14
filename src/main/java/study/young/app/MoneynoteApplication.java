package study.young.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"study.young.controller"})
public class MoneynoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneynoteApplication.class, args);
	}

}
