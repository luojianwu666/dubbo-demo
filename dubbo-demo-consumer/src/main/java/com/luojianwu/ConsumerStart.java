package com.luojianwu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luojianwu.math.MathService;
import com.luojianwu.pojo.Student;
import com.luojianwu.service.StudentService;

public class ConsumerStart {
	private static ClassPathXmlApplicationContext context;
	private static StudentService studentService;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		
		
		studentService = context.getBean(StudentService.class);
		
		Student student = studentService.getById(20);
		System.out.println("stuent is "  + student);
		
		Student addAge = studentService.addAge(student, 5);
		
		System.out.println("变更后为 "  + addAge);
		
		
		System.out.println(studentService.cheng(10, 2));
		System.out.println(studentService.jia(88,66));
		
	}
}
