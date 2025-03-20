package ru.yandexpraktikum.add_note.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteInteractor
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteInteractorImpl

@InstallIn(ViewModelComponent::class)
@Module
interface AddNoteModule {

    @Binds
    fun provideAddNoteInteractor(impl: AddNoteInteractorImpl): AddNoteInteractor
}