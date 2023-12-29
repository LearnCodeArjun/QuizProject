package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.QuizEntity;


	

public interface QuizService {

	//quiz add
	QuizEntity add(QuizEntity quiz);
    
    //get all
    List<QuizEntity> get();
   
     //get long
    QuizEntity get(Long id);

}


