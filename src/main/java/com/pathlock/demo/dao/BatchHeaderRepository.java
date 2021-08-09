package com.pathlock.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pathlock.demo.entity.BatchHeader;

public interface BatchHeaderRepository extends CrudRepository<BatchHeader, Integer> {

}
