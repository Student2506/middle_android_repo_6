package ru.yandexpraktikum.add_note.di

import dagger.Subcomponent
import ru.yandexpraktikum.add_note.presentation.AddNoteViewModelFactory

@AddNoteScope
@Subcomponent(modules = [AddNoteModule::class])
interface AddNoteSubcomponent {
    fun provideAddNoteViewModelFactory(): AddNoteViewModelFactory

    @Subcomponent.Factory
    interface Factory {
        fun create(): AddNoteSubcomponent
    }
}