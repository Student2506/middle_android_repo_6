package ru.yandexpraktikum.add_note.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.yandexpraktikum.add_note.domain.interactors.AddNoteInteractor
import ru.yandexpraktikum.core.presentation.mappers.PresentationNoteMapper
import javax.inject.Inject

class AddNoteViewModelFactory @Inject constructor(
    private val addNoteInteractor: AddNoteInteractor,
    private val noteMapper: PresentationNoteMapper,
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AddNoteViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST") return AddNoteViewModel(addNoteInteractor, noteMapper) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}