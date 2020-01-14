package study.young.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
/**
 * 這隻類別是用來定義log要怎麼輸出的設置
 * @author young
 *
 */
@Aspect // AOP的Aspect類別，用來設定切入點(Pointcut)及切入的邏輯(Advice)，Aspect類別上須加上@Aspect
@Component // Aspect類別記得加上@Component，如此才能被Spring Boot掃描為bean。
public class LogAspect {

	// 要被AOP切入的位置，使用pointcut expression來表示，而Pointcut位置的Join point即為Advice施行的目標。
	// @Pointcut("execution(*study.young.controller..*(..))")即表示切入位置為study.young.controller下的任意method。
	//綁定controller packageru.就對了
	@Pointcut("execution(* study.young.controller..*(..))")
	public void pointcut() {
	}
	
	//上面綁定的controller 其方法 執行前DO
	@Before("pointcut()")
	public void before(JoinPoint joinPoint) {
		Logger logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass().getName());
		logger.info("start");
	}

	//上上面綁定的controller 其方法 執行後DO
	@After("pointcut()")
	public void after(JoinPoint joinPoint) {
		Logger logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass().getName());
		logger.info("end");
	}

}
