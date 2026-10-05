package ch.hslu.sofeng.static_webpage;

import ch.hslu.sofeng.static_webpage.CampusPayTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CampusPayTransactionService {

    private CampusPayTransactionRepository repository;

    @Value("${max-transaction-amount}")
    private double maxTransactionAmount;

    @Autowired
    public CampusPayTransactionService(CampusPayTransactionRepository repository) {
        this.repository = repository;
    }

    public void transferMoney(double amount) {
        if (amount > maxTransactionAmount) {
            System.out.println("Transaktion abgelehnt: Der Betrag ueberschreitet die Limite.");
        } else {
            repository.createTransaction(amount);
        }
    }
}