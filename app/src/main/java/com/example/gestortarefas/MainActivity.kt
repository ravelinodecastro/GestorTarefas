package com.example.gestortarefas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.gestortarefas.ui.screens.TaskListScreen
import com.example.gestortarefas.viewmodel.TaskViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: TaskViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {

            val uiState by viewModel.uiState.collectAsState()

            TaskListScreen(
                uiState = uiState,
                onTaskClick = { id ->
                    viewModel.toggleTask(id)
                }
            )
        }
    }
}