package com.zeynep.todo.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import com.zeynep.todo.models.Task;
import com.zeynep.todo.services.TaskService;

@RestController
public class TaskController {

        private final TaskService taskService;
        public TaskController(TaskService taskService) {
            this.taskService = taskService;
        }

        public String getTasks(Model model){
            List<Task> tasks = taskService.getAllTasks();
            model.addAttribute("tasks", tasks);
            return "tasks";
        }
}
