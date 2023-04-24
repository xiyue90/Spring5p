package main;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppCtx;
import network.NetworkBean;
import spring.Client2;

public class MainNetwork {

	public static void main(String[] args) throws IOException {
		
		System.out.println("[생명주기관리 테스트");
		
		System.out.println("1.빈객체 등록");
		AbstractApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppCtx.class);
		
		System.out.println("2.빈객체 가져오기");	
		NetworkBean net= ctx.getBean(NetworkBean.class);

		Client2 client2 = ctx.getBean(Client2.class);		
		net.send("접속을 환영합니다.");
		
		System.out.println("3.빈객체 실행 ");		
		client2.send();
		
		
		
		
		
		System.out.println("4.빈객체 사용 종용");
		ctx.close();
	}

}