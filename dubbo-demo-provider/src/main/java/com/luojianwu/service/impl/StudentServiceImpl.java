package com.luojianwu.service.impl;

import com.luojianwu.pojo.Student;
import com.luojianwu.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setAge(20);
		student.setId(id);
		student.setName("dubbo"+id);
		
		return student;
	}

	@Override
	public Student addAge(Student stu, int n) {
		// TODO Auto-generated method stub
		stu.setAge(stu.getAge()+n);
		return stu;
	}

	@Override
	public String jia(int a, int b) {
		// TODO Auto-generated method stub
		int he=a+b;
		return Integer.toString(he);
	}

	@Override
	public String cheng(int a, int b) {
		// TODO Auto-generated method stub
		int ji=a*b;
		System.out.println(a+"  "+b+"  "+ji);
		return Integer.toString(ji);
	}
	
	
	
	
	
}
