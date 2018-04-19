package care.humancare.application.account;

import care.humancare.domain.account.AccountService;
import care.humancare.domain.account.entity.Account;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/account", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(description = "Controller which provides account's methods")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/test")
    @ApiOperation(value = "Just for test Get method", response = String.class)
    String test() {
        return "test";
    }

    // bd test
    @GetMapping("/account")
    @ApiOperation(value = "Get first account", response = Account.class)
    public String testGetAccountString(){
        Account account = accountService.getAccount(1L);
        return account.toString();
    }


    @GetMapping("/{id}")
    @ApiOperation(value = "Get account by id", response = Account.class)
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

    @GetMapping("/all_accounts")
    @ApiOperation(value = "Get all accounts", response = Account[].class)
    public Iterable<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @PostMapping("/save")
    @ApiOperation(value = "Post account to data base", response = Account.class)
    public Account saveAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }

    @PutMapping("/update")
    @ApiOperation(value = "Update account", response = Account.class)
    public Account updateAccount(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete account")
    public void deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
    }
}
