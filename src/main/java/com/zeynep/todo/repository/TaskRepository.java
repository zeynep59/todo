package com.zeynep.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeynep.todo.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
