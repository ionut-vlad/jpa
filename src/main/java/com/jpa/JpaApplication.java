package com.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.jpa.services.HelloWorldService;
import com.jpa.util.HibernateUtil;

@SpringBootApplication(scanBasePackages= {"com.jpa"})
@EnableAutoConfiguration
public class JpaApplication {

	@Autowired 
	HibernateUtil hibernateUtil;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		System.out.println("=====JPA APP STARTED =====");
		hibernateUtil.insertNewBook();
		hibernateUtil.insertNewCourse();
		hibernateUtil.insertNewStudent();
		hibernateUtil.insertAnimals();
		

	}
	
//	@Bean(initMethod = "start", destroyMethod = "stop")
//	public Server inMemoryH2DatabaseaServer() throws SQLException {
//	    return Server.createTcpServer(
//	      "-tcp", "-tcpAllowOthers", "-tcpPort", "8091");
//	}
	
}
