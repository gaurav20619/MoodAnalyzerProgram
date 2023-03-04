package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerException extends Exception {
    ExceptionType type;

    //To inform user whether the mood entered is empty or null
    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }

    public MoodAnalyzerException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
