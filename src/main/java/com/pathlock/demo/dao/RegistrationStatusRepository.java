package com.pathlock.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pathlock.demo.entity.RegistrationStatus;

public interface RegistrationStatusRepository extends CrudRepository<RegistrationStatus, Integer> {

}
