package com.question.entity;
//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

	
    @Entity
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	//@Document("Question_table")
	
	@Table(name="questions_u")
	public class Question {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private  Long questionId;
	    private  String question;
	    private  Long quizId;
 
	}


    
