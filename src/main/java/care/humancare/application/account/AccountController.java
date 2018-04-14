package care.humancare.application.account;

import care.humancare.domain.account.AccountService;
import care.humancare.domain.account.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/test")
    String test() {
        return "test";
    }

    // bd test
    @GetMapping("/account")
    public String testGetAccountString(){
        Account account = accountService.getAccount(1L);
        return account.toString();
    }


    @GetMapping("/{id}")
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

    @GetMapping("/all_accounts")
    public Iterable<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @PostMapping("/save")
    public Account saveAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }

    @PutMapping("/update")
    public Account updateAccount(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
    }
}
