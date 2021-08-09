package com.pathlock.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pathlock.demo.entity.BatchData;

public interface BatchDataRepository extends CrudRepository<BatchData, Integer> {

}
