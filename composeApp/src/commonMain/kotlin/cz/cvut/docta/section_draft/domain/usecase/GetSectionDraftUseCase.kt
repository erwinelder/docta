package cz.cvut.docta.section_draft.domain.usecase

import cz.cvut.docta.section_draft.domain.model.SectionDraft

interface GetSectionDraftUseCase {
    suspend fun execute(id: Long): SectionDraft?
}