package com.zeynep.todo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zeynep.todo.models.Task;
import com.zeynep.todo.repository.TaskRepository;

@Service
public class TaskService {

        private final TaskRepository taskRepository;
        public TaskService(TaskRepository taskRepository) {
            this.taskRepository = taskRepository;
        }

        public List<Task> getAllTasks(){
            return taskRepository.findAll();
        }
}
