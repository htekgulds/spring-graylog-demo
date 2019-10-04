package com.tuik.tuikdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tuik.tuikdemo.model.Proje;

public interface ProjeRepository extends JpaRepository<Proje, Long> {

}
