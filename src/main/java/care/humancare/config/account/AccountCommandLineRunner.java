package care.humancare.config.account;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class AccountCommandLineRunner implements CommandLineRunner {

//    private final AccountRepository accountRepository;
//
//    @Autowired
//    public AccountCommandLineRunner(AccountRepository accountRepository) {
//        this.accountRepository = accountRepository;
//    }

    @Override
    public void run(String... args) throws Exception {
       /* // save a couple of customers
        accountRepository.save(new Account("Jack", "Bauer"));
        accountRepository.save(new Account("Chloe", "O'Brian"));
        accountRepository.save(new Account("Kim", "Bauer"));
        accountRepository.save(new Account("David", "Palmer"));
        accountRepository.save(new Account("Michelle", "Dessler"));

        // fetch all customers
        log.info("Customers found with findAll():");
        log.info("-------------------------------");
        for (Account customer : accountRepository.findAll()) {
            log.info(customer.toString());
        }
        log.info("");

        // fetch an individual customer by ID
        Optional<Account> optionalAccount = accountRepository.findById(1L);
        log.info("Customer found with findOne(1L):");
        log.info("--------------------------------");
        log.info(optionalAccount.orElseThrow(() -> new RuntimeException("didn't find " + optionalAccount.toString())).toString());
        log.info(""); */
    }
}
