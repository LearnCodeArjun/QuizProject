package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


	
	@Entity
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public class QuizEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String title;
	    
//i will decalre one varible and i declare transient beacuse i wont give databse this variable
	    transient private List<Question> questions;
	}



