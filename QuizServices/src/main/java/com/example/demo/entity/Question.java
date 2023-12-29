package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	//@Document(collection="Question_table")
	
	//@Table(name="questions")
	public class Question {
	    
	    private  Long questionId;
	    private  String question;
	    private  Long quizId;

}
