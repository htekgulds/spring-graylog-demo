package com.tuik.tuikdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tuik.tuikdemo.model.Tablo;

public interface TabloRepository extends JpaRepository<Tablo, Long> {

}
