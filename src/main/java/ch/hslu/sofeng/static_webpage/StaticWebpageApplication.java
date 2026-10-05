package ch.hslu.sofeng.static_webpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StaticWebpageApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaticWebpageApplication.class, args);
	}

	@Bean("customer1")
	public CampusPayCustomer customer1() {
		return new CampusPayCustomer("Mark", "Muster", "mark@muster.ch");
	}

	@Bean("customer2")
	public CampusPayCustomer customer2() {
		return new CampusPayCustomer("Hanna", "Muster", "hanna@muster.ch");
	}
}
