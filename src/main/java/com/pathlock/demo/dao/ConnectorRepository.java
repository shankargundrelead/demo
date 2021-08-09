package com.pathlock.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pathlock.demo.entity.Connector;

public interface ConnectorRepository extends CrudRepository<Connector, Integer> {

}