package com.lifu.plainnotes.dao;

import com.lifu.plainnotes.model.NoteEntity;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(NoteEntity note);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAllNote(List<NoteEntity> notes);

    @Delete
    void deleteNote(NoteEntity note);
    
    @Query("SELECT * FROM notes WHERE id = :id")
    NoteEntity getNoteById(int id);

    @Query("SELECT * FROM notes ORDER BY date DESC")
    LiveData<List<NoteEntity>> getAll();

    @Query("DELETE FROM notes")
    int deleteAll();

    @Query("SELECT COUNT(*) FROM notes")
    int getCount();
}
