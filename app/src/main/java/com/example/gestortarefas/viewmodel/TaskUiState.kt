package com.example.gestortarefas.viewmodel

import com.example.gestortarefas.data.Task

data class TaskUiState(
    val tasks: List<Task> = emptyList()
)