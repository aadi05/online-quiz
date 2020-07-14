package com.testapp.service;

import com.testapp.model.Test;

public interface TestService {
	public Test getNewTest();
	public int computeResult(Test test);
}
