package test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessengerAspect {
	//return type 은 void이고 send로 시작하는 모든 메소드가 point cut 이다.
	@Around("execution(void send*(..))")
	public void checkGreeting(ProceedingJoinPoint joinPoint) throws Throwable {
		
		//aop 가 적용된 메소드 수행하기 이전에 해야할 작업 before
		
		joinPoint.proceed(); // aop 가 적용된 메소드 수행하기 조건을줘서 실행시킬수있음 if문
		
		//aop 가 적용된 메소드 수행된 이후에 해야할 작업 after
	}
}
