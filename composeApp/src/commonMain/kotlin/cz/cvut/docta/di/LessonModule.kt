package cz.cvut.docta.di

import cz.cvut.docta.lesson.domain.usecase.GetSectionLessonsUseCase
import cz.cvut.docta.lesson.domain.usecase.GetSectionLessonsUseCaseImpl
import cz.cvut.docta.lesson.presentation.viewmodel.SectionLessonsViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val lessonModule = module {

//    single<LessonLocalDataSource> {
        // TODO-LESSON
//    }

//    single<LessonRepository> {
//        LessonRepositoryImpl(localSource = get())
//    }

    single<GetSectionLessonsUseCase> {
        GetSectionLessonsUseCaseImpl(
//            lessonRepository = get() // TODO-USECASE
        )
    }

    viewModel {
        SectionLessonsViewModel(
            getSectionUseCase = get(),
            getSectionLessonsUseCase = get()
        )
    }

}