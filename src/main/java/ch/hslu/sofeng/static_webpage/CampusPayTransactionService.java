package ch.hslu.sofeng.static_webpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CampusPayTransactionService {

    private CampusPayTransactionRepository repository;
    private CampusPayCustomer sender;
    private CampusPayCustomer receiver;

    @Value("${max-transaction-amount}")
    private double maxTransactionAmount;

    @Autowired
    public CampusPayTransactionService(
            CampusPayTransactionRepository repository,
            @Qualifier("customer1") CampusPayCustomer sender,
            @Qualifier("customer2") CampusPayCustomer receiver) {
        this.repository = repository;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String transferMoney(double amount) {
        if (amount > maxTransactionAmount) {
            return "Transaktion abgelehnt: Der Betrag ueberschreitet die Limite!";
        } else {
            repository.createTransaction(amount);
            return "Super! Es wurden " + amount + " CHF von " + sender.getFirstName() + " an " + receiver.getFirstName() + " ueberwiesen.";
        }
    }
}