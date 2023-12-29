package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.QuizService;
import com.example.demo.entity.QuizEntity;


	
	@RestController
	@RequestMapping("/quiz")
	public class QuizController {
	    
	     //constructor injection
		private QuizService quizService;
	    public QuizController(QuizService quizService) {
	        this.quizService = quizService;
	    }

	    //    create
	    @PostMapping
	    public QuizEntity create(@RequestBody QuizEntity quiz) {
	        return quizService.add(quiz);
	    }

//	    get all

	    @GetMapping
	    public List<QuizEntity> get() {
	        return quizService.get();
	    }

	    @GetMapping("/{id}")
	    public QuizEntity getOne(@PathVariable Long id) {
	        return quizService.get(id);
	    }


	}



