package care.humancare.domain.nails;

import care.humancare.domain.nails.entity.Nails;
import care.humancare.infrastructure.persistence.NailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class NailsService {

    private final NailsRepository nailsRepository;

    @Autowired
    public NailsService(NailsRepository nailsRepository) {
        this.nailsRepository = nailsRepository;
    }

    public Optional<Nails> getNails(String id) {
        return nailsRepository.findById(id);
    }

    public Iterable<Nails> getAllNails() {
        return nailsRepository.findAll();
    }

    public Nails saveNails(Nails account) {
        return nailsRepository.save(account);
    }

    public Nails updateNails(Nails account) {
        return nailsRepository.save(account);
    }

    public void deleteNails(String id) {
        nailsRepository.deleteById(id);
    }
}
