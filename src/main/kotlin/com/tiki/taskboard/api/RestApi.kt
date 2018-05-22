package com.tiki.taskboard.api

import com.tiki.taskboard.domain.Task
import com.tiki.taskboard.repositories.TaskRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tasks")
class RestApi(private val taskRepository: TaskRepository) {

    @GetMapping()
    fun getTasks(): List<Task> {
        return taskRepository.findAll()
    }
    

    @PostMapping
    fun postTask(@RequestBody tasks: List<Task>) {
        taskRepository.saveAll(tasks)
    }
}