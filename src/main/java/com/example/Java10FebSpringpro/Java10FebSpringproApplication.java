package com.example.Java10FebSpringpro;

import com.example.Java10FebSpringpro.AOP.Boy;
import com.example.Java10FebSpringpro.AOP.Girl;
import com.example.Java10FebSpringpro.di.Company;
import com.example.Java10FebSpringpro.ioc.SimConfig;
import com.example.Java10FebSpringpro.ioc.Vodafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Java10FebSpringproApplication {

	public static void main(String[] args) throws Exception {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(Java10FebSpringproApplication.class, args);
		Vodafone vodafone1 = applicationContext.getBean(Vodafone.class);
//        vodafone1.calling();

		ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(applicationContext1);
//
//        Jio jio = context.getBean(Jio.class);
//        jio.calling();
//        jio.msg();

//        Vodafone vodafone = context.getBean(Vodafone.class);
//        vodafone.msg();
//        vodafone.calling();

		Company company = applicationContext.getBean(Company.class);
		company.display();

		Boy boy = applicationContext.getBean(Boy.class);
		Girl girl = applicationContext.getBean(Girl.class);

		boy.studyMaths(6);
		girl.study();
		boy.myException();


	}

	@GetMapping("hello")
	public String msg() {
		return "Hello Spring...";
	}

}
