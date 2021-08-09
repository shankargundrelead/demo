package com.pathlock.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pathlock.demo.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}