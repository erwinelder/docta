package cz.cvut.docta.section.domain.usecase

import cz.cvut.docta.section.domain.model.CourseSectionLightweight

interface GetSectionUseCase {
    suspend fun execute(sectionId: Long): CourseSectionLightweight
}