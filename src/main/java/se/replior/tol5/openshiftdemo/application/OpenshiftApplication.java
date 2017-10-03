package se.replior.tol5.openshiftdemo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"se.replior.tol5.openshiftdemo.interfaces"})
public class OpenshiftApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}
}
