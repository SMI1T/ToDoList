package com.sample.todolist

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Types.NULL
import java.util.UUID
import java.util.Date

@Entity(tableName = "list")
data class ListItem(
    @PrimaryKey
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var priority: Int = NULL,
    //val creationDate: Date = Date()
)
