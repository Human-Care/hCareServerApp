package care.humancare.domain.account;

import care.humancare.domain.account.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    void deleteAccountById(Long id);
}
