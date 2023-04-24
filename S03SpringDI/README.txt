[S03SpringDI]

1. Spring Dependency Injection(의존 주입)
2. 객체 간의 의존 관계


(MainForAssember.java)
등록: new abc@ez.co.kr 홍길동 1234 1234
변경: change abc@ez.co.kr 1234 9999
종료: exit


(@Bean)
1. @Bean 애너테이션이 지정되면 메소드이름이 빈객체 이름

2.예시
@Bean
public 리턴타입 메소드이름(...){
  }
  
3.빈 객체는 싱글통 객체

4.빈 객체 취득
	클래스이름 객체 =ctx.getBean("빈객체",클래스이름.class);
	클래스이름 객체 =(클래스이름)ctx.getBean("빈객체");
	ApplicationContext ctx= new AnnotationConfigApplicationContext(AppCtx.class);
	MemberRegistersService regSvc=ctx.getBean("memberRegSvc",MemberRegisterService.class);
	MemberRegistersService regSvc=(MemberRegistersService)ctx.getBean("memberRegSvc")
	
（오늘 날짜)
import java.time.localDateTime;
localDateTime registerDateTime = localDateTime.now();

	


