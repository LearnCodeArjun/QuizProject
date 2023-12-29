package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.QuizEntity;

public interface QuizRepo extends JpaRepository<QuizEntity,Long>  {

}
