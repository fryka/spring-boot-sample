package se.replior.tol5.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}

	@GetMapping(value = "/")
	public String testing() {
		return "It works!";
	}
}
