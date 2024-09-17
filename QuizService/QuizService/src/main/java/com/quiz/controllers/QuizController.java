package com.quiz.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	private QuizService quizService;

	public QuizController(QuizService quizService) {
		this.quizService = quizService;
	}
	
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		return quizService.add(quiz);
	}
	
	@GetMapping
	public List<Quiz> getAll(){
		return quizService.getAllQuiz();
	}
	
	@GetMapping("/{id}")
	public Quiz getQuiz(@PathVariable Long id) {
		return quizService.getQuiz(id);
	}
}
