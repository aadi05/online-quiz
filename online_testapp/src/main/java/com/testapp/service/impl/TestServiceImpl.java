package com.testapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.dao.TestDAO;
import com.testapp.model.QuestionAnswer;
import com.testapp.model.Test;
import com.testapp.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestDAO dao;
	private static int testId=1;
	
	@Override
	public Test getNewTest() {
		Test test = new Test();
		List<QuestionAnswer> quiz = dao.findAll();
		test.setTestId(testId++);
		test.setQuiz(quiz);
		return test;
	}

	@Override
	public int computeResult(Test test) {
		int total = 0;
		for(QuestionAnswer question:test.getQuiz()) {
			QuestionAnswer questiondb = dao.findById(question.getQuestionId()).get();
			if(questiondb.getAns() == question.getAns()) {
				total += 1;
			}
		}
		System.out.println(total);
		return total;
	}

}
