package com.luojianwu;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStart {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		// 鍔犺浇鏈嶅姟鍒板鍣�
		context.start();
		
		// 鍔犱竴涓樆濉�
		System.in.read();
	}

}
