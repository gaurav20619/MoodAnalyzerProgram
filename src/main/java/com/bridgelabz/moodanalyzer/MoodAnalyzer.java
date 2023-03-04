package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public String message;

    //Parameterized Constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    //Handle Customized Exception using try-catch block
    public String analyseMood() throws MoodAnalyzerException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY , "Please enter proper message!");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_NULL , "Please enter proper message!");
        }
    }
}
