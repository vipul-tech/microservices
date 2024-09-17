package com.quiz.entities;

public class Question {
	
	private long questionId;
	
	private String question;
	
	private long quizId;

	public long getQuizId() {
		return quizId;
	}

	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}

	public Question() {
		super();
	}
	
	public Question(long questionId, String question, long quizId) {
		super();
		this.quizId = quizId;
		this.questionId = questionId;
		this.question = question;
	}

	public long getQuestionId() {
		return questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
}
