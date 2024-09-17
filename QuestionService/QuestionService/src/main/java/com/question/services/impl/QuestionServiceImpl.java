package com.question.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.entities.Question;
import com.question.repositories.QuestionRepository;
import com.question.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	private QuestionRepository questionRepository;

	public QuestionServiceImpl(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}

	@Override
	public Question create(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getAll() {
		return questionRepository.findAll();
	}

	@Override
	public Question get(Long questionId) {
		return questionRepository.findById(questionId).orElseThrow(()->new RuntimeException("No question with this id"));
	}

	@Override
	public List<Question> getQuestionsOfQuiz(Long quizId) {
		return questionRepository.findByQuizId(quizId);
	}

}
