package com.example.demo.impl;

import java.util.List;
//import java.util.stream.Collectors;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Repo.QuizRepo;
import com.example.demo.Service.QuestionClient;
import com.example.demo.Service.QuizService;
import com.example.demo.entity.QuizEntity;

@Service
public class QuizServiceImpl implements QuizService {
	
	//constructor injection
	private QuizRepo quizRepo;
    private QuestionClient questionClient;
   
    public QuizServiceImpl(QuizRepo quizRepo, QuestionClient questionClient) {
        this.quizRepo = quizRepo;
        this.questionClient = questionClient;
        
    }

    @Override
    public QuizEntity add(QuizEntity quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public List<QuizEntity> get() {
        List<QuizEntity> quizzes = quizRepo.findAll();
	
    

        List<QuizEntity> newQuizList = quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());

        return newQuizList;
    
    }

    @Override
    public QuizEntity get(Long id) {

    	QuizEntity quiz = quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
        quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
        return quiz;
    }
}



