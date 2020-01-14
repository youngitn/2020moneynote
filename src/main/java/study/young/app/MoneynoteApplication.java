package study.young.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//因為資料夾結構的關係(如 和controller為同或上一層 app就會抓不到) 需要在此告訴app 請來掃描basePackages
//才會被註冊為bean
@ComponentScan(basePackages = { "study.young.controller, study.young.aop" })
public class MoneynoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneynoteApplication.class, args);
	}

}
