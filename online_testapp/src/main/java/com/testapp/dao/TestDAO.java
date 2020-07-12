package com.testapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testapp.model.QuestionAnswer;

@Repository
public interface TestDAO extends JpaRepository<QuestionAnswer, Integer> {

}
