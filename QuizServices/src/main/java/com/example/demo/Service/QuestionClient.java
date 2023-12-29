package com.example.demo.Service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Question;

//@FeignClient(url="http://localhost:8082",value="Question-client")//questionservice url
@FeignClient(name="QUESTION-SERVICE",value="Question-client")
public interface QuestionClient {
	
	
   
	@GetMapping("/question/quiz/{quizId}")
	List<Question>getQuestionOfQuiz(@PathVariable Long quizId);

}
