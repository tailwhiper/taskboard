package com.tiki.taskboard.domain

import java.util.*
import javax.persistence.*

@Entity
data class Task(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = null,
        val title: String? = null,
        val description: String? = null,
        val creationDate: Date? = null,
        val dueDate: Date? = null
)