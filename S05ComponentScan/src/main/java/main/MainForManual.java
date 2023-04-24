package main;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppCtxManual1;
import config.AppCtxManual2;

public class MainForManual {

	private static AbstractApplicationContext ctx = null;
	
	public static void main(String[] args) throws IOException {
		ctx = new AnnotationConfigApplicationContext(
				AppCtxManual1.class, AppCtxManual2.class);
		
		System.out.println("[빈객체 목록]");
		String [] names=ctx.getBeanDefinitionNames();
		Arrays.stream(names).forEach(name -> System.out.println(name));
		System.out.println("----------------------------------------------");
		System.out.println("-메누열로 빈객체 등록하면 overriding 된다.");
		
		ctx.close();
	}

}