package com.luojianwu.service;

import com.luojianwu.pojo.Student;

public interface StudentService {
	
	Student getById(int id);
	
	Student addAge(Student stu,int n);
	
	String jia(int a,int b);
	
	String cheng(int a,int b);
}
