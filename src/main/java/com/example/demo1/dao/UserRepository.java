package com.example.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.entity.Employee;

public interface UserRepository extends JpaRepository<Employee,Integer> {

}
