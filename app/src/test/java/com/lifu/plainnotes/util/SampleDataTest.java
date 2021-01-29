package com.lifu.plainnotes.util;

import com.lifu.plainnotes.model.NoteEntity;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SampleDataTest {

    @Test
    public void getNotes() {
        List<NoteEntity> notes = SampleData.getNotes();

        assertEquals(notes.get(0).getTxt(), SampleData.SAMPLE_TEXT_1);
        assertEquals(notes.get(1).getTxt(), SampleData.SAMPLE_TEXT_2);
        assertEquals(notes.get(2).getTxt(), SampleData.SAMPLE_TEXT_3);
    }
}