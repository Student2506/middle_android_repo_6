package ru.yandexpraktikum.all_notes.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractor
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractorImpl
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractor
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractorImpl
import ru.yandexpraktikum.all_notes.presentation.AllNotesViewModel

@Module
@InstallIn(ViewModelComponent::class)
internal interface AllNotesModule {

    @Binds
    fun provideFetchAllNotesInteractor(impl: FetchAllNotesInteractorImpl): FetchAllNotesInteractor

    @Binds
    fun provideDeleteNoteInteractor(impl: DeleteNoteInteractorImpl): DeleteNoteInteractor
}