package ru.yandexpraktikum.core.di

import android.content.Context
import androidx.room.Room
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.yandexpraktikum.core.data.db.NoteDao
import ru.yandexpraktikum.core.data.db.NoteDatabase
import ru.yandexpraktikum.core.data.repository.NotesRepositoryImpl
import ru.yandexpraktikum.core.domain.repository.NotesRepository
import javax.inject.Singleton

private const val DATABASE_NAME = "note_database"

@Module
@InstallIn(SingletonComponent::class)
interface CoreModule {

    @Binds
    @Singleton
    fun bindNotesRepository(repositoryImpl: NotesRepositoryImpl): NotesRepository

    companion object {
        @Provides
        @Singleton
        fun provideNoteDatabase(context: Context): NoteDatabase {
            return Room.databaseBuilder(
                context.applicationContext, NoteDatabase::class.java, DATABASE_NAME
            ).build()
        }

        @Provides
        @Singleton
        fun providesNoteDao(noteDatabase: NoteDatabase): NoteDao {
            return noteDatabase.noteDao()
        }
    }
}