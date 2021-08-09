package com.pathlock.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pathlock.demo.entity.Application;

public interface ApplicationRepository extends CrudRepository<Application, Integer> {

}
