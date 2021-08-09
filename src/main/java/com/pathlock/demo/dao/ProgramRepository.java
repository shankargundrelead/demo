package com.pathlock.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pathlock.demo.entity.Program;

public interface ProgramRepository extends CrudRepository<Program, Integer> {

}
