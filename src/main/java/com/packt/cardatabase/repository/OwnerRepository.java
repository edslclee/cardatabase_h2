package com.packt.cardatabase.repository;

import com.packt.cardatabase.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
