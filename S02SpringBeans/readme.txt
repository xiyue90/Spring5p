[C02SpringBeans]

1.스프링 빈즈 사용하기
	-IoC(Inversion of Control)(제어의 역전)
	-객체의 생명 주기 관리를 스프링 프래임워크에서 담당
2.메이븐 프로젝트 생성
	-File/New/Maven Project
	-Create a simple project(check)
	-경로 :프로젝트 경로
				workspace 아래 프로젝트 명으로 폴더 생성
	-configure project
		.Group Id:S02SpringBeans
		.Artifact Id:S02SpringBeans
	-Maven/update project

3.메이븐 저장소
	-https://mvnrepository.com/
	-검색:spring context---5.0.2 release
(pom.xml)
  <dependencies>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>5.0.2.RELEASE</version>
		</dependency>
	</dependencies>
	-------------------------------------------------------
	AnnotationConfigApplicationContext
	1.자바 애너테이션을 이용하여 클래스로부터 객체 설정 정보를 취득
	2.객체를 생성하고 초기화 작업 수행
	
	(BeanFactory)
	1 객체 생성과 검색에 대한 기능 정의
	2 객체 검색
	3 싱글톤/프로토타입 빈인지 확인하는 기능 제공
	
	(ApplicationContext)
	1 메시지,프로필/환경변수 등을 처리 할 수 있는 기능 정의
	

4.스프링 빈즈 설정 Annotation
	-@Configuration
	-@Bean
5.스프링 빈즈 취득
	-AnnotationConfigApplicationContext 클래스
	-getBean() 메소드

	
	
	
	
	
	
	