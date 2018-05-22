package com.tiki.taskboard.repositories

import com.tiki.taskboard.domain.Task
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository : JpaRepository<Task, Long> {
}