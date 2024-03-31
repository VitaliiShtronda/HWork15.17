package com.example.HWork157.service.exception;

import java.util.UUID;


public class NoteNotFoundException extends Exception {
    private static final String EXCEPTION_TEXT = "Note with id = %s not found.";
    private static final String NO_ID_EXCEPTION_TEXT = "Cannot find note without id.";

    public NoteNotFoundException() {
        super(NO_ID_EXCEPTION_TEXT);
    }

    public NoteNotFoundException(UUID id) {
        super(String.format(EXCEPTION_TEXT, id));
    }
}
