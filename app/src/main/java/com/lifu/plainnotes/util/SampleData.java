package com.lifu.plainnotes.util;

import com.lifu.plainnotes.model.NoteEntity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class SampleData {
    public static final String SAMPLE_TEXT_1 = "a simple note";
    public static final String SAMPLE_TEXT_2 = "a simple note with a\nline feed";
    public  static final String SAMPLE_TEXT_3 = "This is a really long note. What story should I tell here or should just write jargons? Or maybe I should just be writing meaningless word like bal blalblds sjsjksdjks dkjsjds sjks sjk" +
            "hjdsjkd\njsjksdkj sidslkds sdddskjdskjsd \n\nuusduisdiudsuid jsdkjd sskjsdsd sdjhdds shjdjhds djhs";

    private static Date getDate(int diff){
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.MILLISECOND, diff);
        return cal.getTime();
    }

    public static List<NoteEntity> getNotes(){
        List<NoteEntity> notes = new ArrayList<>();
        notes.add(new NoteEntity(1,getDate(0), SAMPLE_TEXT_1));
        notes.add(new NoteEntity(2,getDate(-1), SAMPLE_TEXT_2));
        notes.add(new NoteEntity(3,getDate(-2), SAMPLE_TEXT_3));
        return notes;
    }

}
