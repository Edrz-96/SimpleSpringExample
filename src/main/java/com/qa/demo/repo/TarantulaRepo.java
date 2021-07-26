package com.qa.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.demo.domain.Tarantula;

@Repository
public interface TarantulaRepo extends JpaRepository<Tarantula, Long> {

}
