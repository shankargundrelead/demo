package com.pathlock.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pathlock.demo.entity.GltSystem;

public interface SystemRepository extends CrudRepository<GltSystem, Integer> {

}
