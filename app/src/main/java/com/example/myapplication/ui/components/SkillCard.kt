package com.example.myapplication.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.Skill
import com.example.myapplication.ui.theme.ProfilDeveloppeurTheme

@Composable
fun SkillCard(
    skill: Skill,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier.width(140.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
        ),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = skill.name, style = MaterialTheme.typography.titleMedium)
            Text(text = skill.category, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SkillCardPreview() {
    ProfilDeveloppeurTheme {
        SkillCard(skill = Skill("Kotlin", "Mobile"), modifier = Modifier.padding(16.dp))
    }
}