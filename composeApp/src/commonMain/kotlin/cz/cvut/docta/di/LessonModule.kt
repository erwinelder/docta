package cz.cvut.docta.di

import cz.cvut.docta.lesson.data.local.source.LessonLocalDataSource
import cz.cvut.docta.lesson.data.local.source.lessonLocalDataSourceFactory
import cz.cvut.docta.lesson.data.repository.LessonRepository
import cz.cvut.docta.lesson.data.repository.LessonRepositoryImpl
import cz.cvut.docta.lesson.domain.usecase.GetSectionLessonsDraftsUseCase
import cz.cvut.docta.lesson.domain.usecase.GetSectionLessonsDraftsUseCaseImpl
import cz.cvut.docta.lesson.domain.usecase.GetSectionLessonsWithStatisticsUseCase
import cz.cvut.docta.lesson.domain.usecase.GetSectionLessonsWithStatisticsUseCaseImpl
import cz.cvut.docta.lesson.presentation.viewmodel.SectionLessonsViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val lessonModule = module {

    single<LessonLocalDataSource> {
        lessonLocalDataSourceFactory(appLocalDatabase = get())
    }

    single<LessonRepository> {
        LessonRepositoryImpl(localSource = get())
    }

    single<GetSectionLessonsWithStatisticsUseCase> {
        GetSectionLessonsWithStatisticsUseCaseImpl(lessonRepository = get())
    }

    single<GetSectionLessonsDraftsUseCase> {
        GetSectionLessonsDraftsUseCaseImpl(lessonRepository = get())
    }

    viewModel {
        SectionLessonsViewModel(
            getSectionUseCase = get(),
            getSectionLessonsWithStatisticsUseCase = get()
        )
    }

}