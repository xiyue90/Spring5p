package main;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppCtx;
import spring.Client;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("[생명주기관리 테스트");
		
		System.out.println("1.빈객체 등록");
		AbstractApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppCtx.class);
		
		System.out.println("2.빈객체 가져오기");	
		

		Client client = ctx.getBean(Client.class);		
		
		
		System.out.println("3.빈객체 실행 ");		
		client.send();
		
		
		
		
		
		System.out.println("4.빈객체 사용 종용");
		ctx.close();
	}

}