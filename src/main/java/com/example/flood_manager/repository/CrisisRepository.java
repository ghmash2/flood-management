package com.example.flood_manager.repository;

import com.example.flood_manager.domain.entity.Crisis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrisisRepository extends JpaRepository<Crisis, Long> {
}
