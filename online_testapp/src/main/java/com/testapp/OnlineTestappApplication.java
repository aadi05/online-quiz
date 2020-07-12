package com.testapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.testapp.dao.TestDAO;
import com.testapp.model.QuestionAnswer;

@SpringBootApplication
public class OnlineTestappApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineTestappApplication.class, args);
	}

}

@Component
class InitialRecords implements CommandLineRunner{
	
	@Autowired
	private TestDAO dao;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<QuestionAnswer> list = new ArrayList<>();
		QuestionAnswer qa1 = new QuestionAnswer("What is the name our galaxy?","Andromeda", "Milky way", "Whirlpool","Messier 81", 2);
		QuestionAnswer qa2 = new QuestionAnswer("On what planet will you find the largest volcano in the solar system?","Earth", "Jupiter", "Uranus","Mars", 4);
		QuestionAnswer qa3 = new QuestionAnswer("What does a light year measure?","Time", "Distance", "Brightness","Force", 2);
		QuestionAnswer qa4 = new QuestionAnswer("Sun will absorb/engulf earth in how many years?","400 million years","2 billion years","7.5 billion years","Tomorrow morning",3);
		QuestionAnswer qa5 = new QuestionAnswer("Which is the nearest star from earth other than sun?","Proxima Centauri", "UY Scuti", "Betelgeuse","Sirius", 1);
		list.add(qa1);
		list.add(qa2);
		list.add(qa3);
		list.add(qa4);
		list.add(qa5);
		
		dao.saveAll(list);
		
	}
	
}
