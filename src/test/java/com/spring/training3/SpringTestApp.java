package com.spring.training3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.training3.bean.Person;
import com.spring.training3.config.AppInitConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppInitConfig.class})
public class SpringTestApp {

	@Autowired
	Person person;
	
	@Test
	public void test1() {
		System.out.println("JUnit test company " + person.getFirstName());
	}
}
