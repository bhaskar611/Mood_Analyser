package com.bhaskar.Analyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void print_Welcome_Message() {
		MoodAnalyser mood = new MoodAnalyser();
		mood.PrintWelcomeMessage();
	}
	// Test case 1.1
	@Test 
	public void Test1() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = moodAnalyser.AnalyseMood("This is a Sad Message");
		Assert.assertEquals("SAD", mood);
	}
	// Test case 1.2

	@Test 
	public void Test2() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = moodAnalyser.AnalyseMood("This is a Happy Message");
		Assert.assertEquals("HAPPY", mood);
	}
}
