package com.example.gestortarefas.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.gestortarefas.ui.TaskItem
import com.example.gestortarefas.viewmodel.TaskUiState

@Composable
fun TaskListScreen(
    uiState: TaskUiState,
    onTaskClick: (Int) -> Unit
) {

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {

        items(uiState.tasks) { task ->

            TaskItem(
                task = task,
                onClick = {
                    onTaskClick(task.id)
                }
            )
        }
    }
}