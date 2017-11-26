package com.ecareserverapp.accommodation.repository;

import com.ecareserverapp.accommodation.entity.Accommodation;
import org.springframework.data.repository.CrudRepository;

public interface AccommodationRepository extends CrudRepository<Accommodation, Long> {
}
