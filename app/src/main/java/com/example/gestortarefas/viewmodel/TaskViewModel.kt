package com.example.gestortarefas.viewmodel

import androidx.lifecycle.ViewModel
import com.example.gestortarefas.data.Task
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class TaskViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        TaskUiState(
            tasks = listOf(
                Task(1, "Estudar Computação Móvel"),
                Task(2, "Entregar relatório"),
                Task(3, "Preparar apresentação"),
                Task(4, "Ler artigo científico"),
                Task(5, "Resolver exercícios")
            )
        )
    )

    val uiState: StateFlow<TaskUiState> = _uiState

    fun toggleTask(id: Int) {

        _uiState.update { currentState ->

            currentState.copy(
                tasks = currentState.tasks.map { task ->

                    if (task.id == id)
                        task.copy(completed = !task.completed)
                    else
                        task
                }
            )
        }
    }
}