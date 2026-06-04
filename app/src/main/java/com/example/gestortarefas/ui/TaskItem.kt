package com.example.gestortarefas.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gestortarefas.data.Task

@Composable
fun TaskItem(
    task: Task,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = task.title
            )

            Button(
                onClick = onClick
            ) {
                Text(
                    if (task.completed)
                        "Concluída"
                    else
                        "Concluir"
                )
            }
        }
    }
}