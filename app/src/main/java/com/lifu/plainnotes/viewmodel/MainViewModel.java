package com.lifu.plainnotes.viewmodel;

import android.app.Application;

import com.lifu.plainnotes.dao.AppRepository;
import com.lifu.plainnotes.model.NoteEntity;
import com.lifu.plainnotes.util.SampleData;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel{

    public List<NoteEntity> mNotes;

    public AppRepository appRepo;

    public MainViewModel(@NonNull Application application) {
        super(application);
        AppRepository.getInstance();
        mNotes = appRepo.mNotes;
    }
}
