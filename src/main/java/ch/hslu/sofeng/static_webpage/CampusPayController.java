package ch.hslu.sofeng.static_webpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampusPayController {

    private CampusPayTransactionService transactionService;

    @Autowired
    public CampusPayController(CampusPayTransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/transfer")
    public String executeTransfer(@RequestParam(defaultValue = "500") double amount) {
        return transactionService.transferMoney(amount);
    }
}