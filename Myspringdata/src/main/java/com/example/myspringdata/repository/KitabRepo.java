package com.example.myspringdata.repository;

import com.example.myspringdata.entity.Kitab;
import com.example.myspringdata.entity.Yazici;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface KitabRepo extends JpaRepository<Kitab, Integer> {
    @Query("SELECT k FROM Kitab k JOIN k.yazici y")

    public List<Kitab> findAll();

}
