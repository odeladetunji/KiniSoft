package com.repository;

import com.entity.Kini;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KiniRepository extends CrudRepository<Kini, Long> {
}
