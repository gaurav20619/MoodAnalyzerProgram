package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public String analyseMood(String message) {

        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}