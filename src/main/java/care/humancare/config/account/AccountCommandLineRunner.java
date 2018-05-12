package care.humancare.config.account;

import care.humancare.domain.account.entity.Account;
import care.humancare.infrastructure.persistence.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Slf4j
@Configuration
public class AccountCommandLineRunner implements CommandLineRunner {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountCommandLineRunner(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // save a couple of customers
        accountRepository.save(new Account("Jack", "Bauer", "jack.bauer@gmai.com", "+79314487564", "1234"));
        accountRepository.save(new Account("Chloe", "O'Brian", "jack.bauer@gmai.com", "+79314487564", "1234"));
        accountRepository.save(new Account("Kim", "Bauer", "jack.bauer@gmai.com", "+79314487564", "1234"));
        accountRepository.save(new Account("David", "Palmer", "jack.bauer@gmai.com", "+79314487564", "1234"));
        accountRepository.save(new Account("Michelle", "Dessler", "jack.bauer@gmai.com", "+79314487564", "1234"));

        // fetch all customers
        log.info("Customers found with findAll():");
        log.info("-------------------------------");
//        for (Account customer : accountRepository.findAll()) {
//            log.info(customer.toString());
//        }
        log.info("");

        // fetch an individual customer by ID
        Optional<Account> optionalAccount = accountRepository.findById(1L);
        log.info("Customer found with findOne(1L):");
        log.info("--------------------------------");
//        log.info(optionalAccount.orElseThrow(() -> new RuntimeException("didn't find " + optionalAccount.toString())).toString());
        log.info("");
    }
}
