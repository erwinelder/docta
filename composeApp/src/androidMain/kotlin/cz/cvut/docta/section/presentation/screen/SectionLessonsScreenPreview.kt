package cz.cvut.docta.section.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import cz.cvut.docta.core.presentation.screen.ScreenPreviewContainer
import cz.cvut.docta.lesson.domain.model.Lesson
import cz.cvut.docta.lesson.domain.model.LessonDifficulty
import cz.cvut.docta.lesson.domain.model.LessonFilterType

@Preview(device = Devices.PIXEL_7_PRO)
@Composable
fun SectionLessonsScreenPreview() {
    val sectionName = "Section name"
    val activeDifficulty = LessonDifficulty.Easy
    val activeType = null
    val lessonList = listOf<Lesson>(
        Lesson.OneStepQuestionsLesson(
            id = 1,
            name = "Practice theory",
            isDone = true,
            difficulty = LessonDifficulty.Easy
        ),
        Lesson.OneStepQuestionsLesson(
            id = 2,
            name = "Practice limits vol.1",
            isDone = false,
            difficulty = LessonDifficulty.Medium
        ),
        Lesson.StepByStepLesson(
            id = 3,
            name = "(x→2) lim x² = 4",
            isDone = true,
            difficulty = LessonDifficulty.Medium,
            description = "Solve the limit by definition"
        ),
        Lesson.OneStepQuestionsLesson(
            id = 4,
            name = "Practice limits vol.2",
            isDone = false,
            difficulty = LessonDifficulty.Medium
        ),
        Lesson.StepByStepLesson(
            id = 5,
            name = "(x→∞) lim (3x³−2x²−1)",
            isDone = false,
            difficulty = LessonDifficulty.Medium,
            description = "Solve the limit"
        ),
        Lesson.TestLesson(
            id = 6,
            name = "Review limits",
            isDone = false
        ),
    )

    ScreenPreviewContainer {
        SectionLessonsScreen(
            sectionName = sectionName,
            activeDifficulty = activeDifficulty,
            onDifficultyChange = {},
            activeType = activeType,
            onTypeSelect = {},
            lessonList = lessonList
        )
    }
}