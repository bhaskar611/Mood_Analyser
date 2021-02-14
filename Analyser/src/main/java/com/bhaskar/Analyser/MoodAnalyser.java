package com.bhaskar.Analyser;

public class MoodAnalyser {
	public void PrintWelcomeMessage() {
		System.out.println("*******Welcome to the Mood Analyser Problem********");
	}
	
	public String AnalyseMood(String message) {
		if(message.contains("Sad")) {
		return "SAD";
		}
		else {
		return "HAPPY";
		}
	}
}
