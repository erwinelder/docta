package cz.cvut.docta.section.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import cz.cvut.docta.core.presentation.screen.ScreenPreviewContainer
import cz.cvut.docta.section.domain.model.SectionWithStatistics
import cz.cvut.docta.section.domain.model.SectionStatistics

@Preview(device = Devices.PIXEL_7_PRO)
@Composable
fun CourseSectionsScreenPreview() {
    val courseName = "Course name"
    val sectionList = listOf(
        SectionWithStatistics(
            id = 1,
            name = "Section name 1",
            statistics = SectionStatistics(
                correctAnswerAmount = 10, wrongAnswerAmount = 20
            )
        ),
        SectionWithStatistics(
            id = 2,
            name = "Section name 2",
            statistics = SectionStatistics(
                correctAnswerAmount = 30, wrongAnswerAmount = 40
            )
        ),
    )

    ScreenPreviewContainer {
        CourseSectionsScreen(
            courseName = courseName,
            onNavigateBack = {},
            sectionList = sectionList,
            onSectionClick = {}
        )
    }
}