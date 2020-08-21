package test.util;

import org.springframework.stereotype.Component;

// Spring Bean Container으로 객체관리된다. 빈됨  제어의 역전 프레임워크가 처리하도록 만듬 Inversion Of Control(제어의 역전 객체의 생성과관리를 스프링워크에 맡김IOC)
//DI 의존성 주입 , AOP
// 스프링 3대 DI 의존관계를 느슨하게 만들어서 유지보수를 편하게함 , AOP , IOC
@Component //component scan 을 했을때 bean이 되도록 어노테이션을 붙인다.
public class Messenger {
	public void sendGreeting(String msg) {
		System.out.println("전달된 오늘의 인사:"+msg);
	}
	public String getMessage() {
		System.out.println("getMessage() 메소드가 수행 됩니다.");
		return "공부하자";
	}
}
