package com.lifu.plainnotes.dao;

import android.content.Context;
import android.util.Log;
import com.lifu.plainnotes.util.SampleData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;

import static org.junit.Assert.*;

public class DatabaseTest {
    public static final String TAG = "JUnit";
    private AppDatabase mDb;
    private NoteDao mNoteDao;

    @Before
    public void createDatabase(){
        Context context = ApplicationProvider.getApplicationContext();
        mDb = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        mNoteDao = mDb.noteDao();
        Log.i(TAG, "Created DB");
    }

    @After
    public void closeDatabase(){
        mDb.close();
        Log.i(TAG, "Close DB");
    }

    @Test
    public void createAndRetrieveNotes(){
        mNoteDao.insertAllNote(SampleData.getNotes());
        int count = mNoteDao.getCount();
        Log.i(TAG, "CreatedAndRetrieve - Count: " + count);
        assertEquals(SampleData.getNotes().size(), count);
    }
}
