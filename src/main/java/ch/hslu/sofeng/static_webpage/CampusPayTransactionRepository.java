package ch.hslu.sofeng.static_webpage;

import org.springframework.stereotype.Repository;

@Repository
public class CampusPayTransactionRepository {

    public void createTransaction(double amount) {
        System.out.println("Transaktion erfolgreich verarbeitet: " + amount);
    }
}