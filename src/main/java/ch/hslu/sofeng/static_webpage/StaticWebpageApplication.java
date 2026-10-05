package ch.hslu.sofeng.static_webpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StaticWebpageApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(StaticWebpageApplication.class, args);

		// Service aus dem Application Context holen
		CampusPayTransactionService service = applicationContext.getBean(CampusPayTransactionService.class);

		// Funktionalität testen
		service.transferMoney(500.0);       // Sollte akzeptiert werden
		service.transferMoney(2000000.0);   // Sollte abgelehnt werden)
	}
}
