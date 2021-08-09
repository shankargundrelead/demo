package com.pathlock.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pathlock.demo.entity.BatchSchedule;

public interface BatchScheduleRepository extends CrudRepository<BatchSchedule, Integer> {

}
