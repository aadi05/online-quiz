package com.testapp.model;

import java.util.List;

public class Test {
	private int testId;
	private List<QuestionAnswer> quiz;
	
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public List<QuestionAnswer> getQuiz() {
		return quiz;
	}
	public void setQuiz(List<QuestionAnswer> quiz) {
		this.quiz = quiz;
	}
	
}
