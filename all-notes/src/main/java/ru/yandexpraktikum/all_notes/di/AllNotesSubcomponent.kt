package ru.yandexpraktikum.all_notes.di

import dagger.Subcomponent
import ru.yandexpraktikum.all_notes.presentation.AllNotesViewModelFactory

@AllNotesScope
@Subcomponent(modules = [AllNotesModule::class])
interface AllNotesSubcomponent {
    fun provideAllNoteViewModelFactory(): AllNotesViewModelFactory

    @Subcomponent.Factory
    interface Factory {
        fun create(): AllNotesSubcomponent
    }
}