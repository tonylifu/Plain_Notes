package com.lifu.plainnotes.dao;

import com.lifu.plainnotes.model.NoteEntity;
import com.lifu.plainnotes.util.SampleData;

import java.util.List;

public class AppRepository {
    private static final AppRepository ourInstance = new AppRepository();

    public List<NoteEntity> mNotes;

    public static final AppRepository getInstance(){
        return ourInstance;
    }

    private AppRepository() {
        mNotes = SampleData.getNotes();
    }


}
