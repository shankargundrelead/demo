package com.pathlock.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pathlock.demo.entity.Sequence;

public interface SequenceRepository extends CrudRepository<Sequence, Integer> {

}
