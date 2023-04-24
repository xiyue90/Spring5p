[S05ComponentScan]

1. 컴포넌트 스캔
2. @ComponentScan
	- 컴포넌트 스캔 설정
3. 컴포넌트 스캔 대상 
	- @Component
	- @Controller
	- @Service
	- @Repository
	- @Aspect
	- @Configuration

(@componentScan)
1.지정된 패키지와 그 하위 패키지에 속한 클래스를 스캔 대상
2.스캔 대상 해당하는 클래스 중에서
	@componemt do
	
(@component)
1.스캔 대상이 되는 클래스로서 빈객체로 등록
2.빈객체 이름을 지정하지 않으면 첫문자를 소문자 변경해서 클래스 이름으로 등록
-예:
@component
public class Component{
}
3.명시적으로 빈객체 이름을 지정
예2:
@Component("comp")
public class Component{
}




































