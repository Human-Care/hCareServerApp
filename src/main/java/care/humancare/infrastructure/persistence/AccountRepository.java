package care.humancare.infrastructure.persistence;

import care.humancare.domain.account.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    void deleteAccountById(Long id);
}
