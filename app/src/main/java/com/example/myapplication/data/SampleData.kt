package com.example.myapplication.data

val sampleProfile = DeveloperProfile(
    name = "Fabio Jorge",
    role = "Développeur junior",
    bio = "Étudiant en informatique, passionné par le développement web et mobile. " +
            "J’aime créer des applications modernes et découvrir de nouvelles technologies.",
    location = "France",
    email = "prenom.nom@example.com",
    availability = "Disponible pour une alternance",
    skills = listOf(
        Skill("Kotlin", "Mobile"),
        Skill("Jetpack Compose", "Mobile"),
        Skill("React", "Web"),
        Skill("TypeScript", "Web"),
        Skill("Git", "Outils"),
        Skill("Material 3", "Design"),
    ),
    projects = listOf(
        Project(
            title = "Fiche Profil – Jetpack Compose",
            description = "Première application Compose : fiche de profil avec composables réutilisables.",
            technologies = listOf("Kotlin", "Compose"),
        ),
        Project(
            title = "Outlook Mail Agent",
            description = "Agent qui aide à trier et traiter des e-mails Outlook.",
            technologies = listOf("Python", "Git"),
        ),
        Project(
            title = "Gestion de dressing Vinted",
            description = "Outil personnel pour suivre et gérer des annonces de vente.",
            technologies = listOf("Python"),
        ),
    ),
)