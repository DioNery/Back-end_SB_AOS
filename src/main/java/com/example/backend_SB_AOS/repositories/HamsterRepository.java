package com.example.backend_SB_AOS.repositories;

import com.example.backend_SB_AOS.models.Hamster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HamsterRepository extends JpaRepository<Hamster, Long> {
}
