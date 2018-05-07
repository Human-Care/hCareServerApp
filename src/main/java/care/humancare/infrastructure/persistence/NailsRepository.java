package care.humancare.infrastructure.persistence;

import care.humancare.domain.nails.entity.Nails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NailsRepository extends CrudRepository<Nails, String> {
    void deleteById(String id);
}
