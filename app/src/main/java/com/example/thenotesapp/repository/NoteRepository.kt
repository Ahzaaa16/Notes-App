package com.example.thenotesapp.repository

import com.example.thenotesapp.database.NoteDataBase
import com.example.thenotesapp.model.Note

class NoteRepository(private val db: NoteDataBase) {

    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)

    fun getAllNotes() = db.getNoteDao().getAlLNotes()
    fun searchNote(query: String?) = db.getNoteDao().searchNote(query)
}