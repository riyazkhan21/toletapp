package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Cource;

public interface CourseDao extends JpaRepository<Cource, Long>{

}
