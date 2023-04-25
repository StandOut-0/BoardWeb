package com.springbook.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//AOP aspect-oriented programming
//비즈니스 로직 메서드가 수행된 이후에 동작하는 사후처리를 구현

@Service //서비스 빈으로 등록
@Aspect //지므니스 로직 메서드를 가로채어 사후처리수행
public class AfterAdvice {
	
	//비즈니스 로직 메서드를 가로챌 지점을 정의
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {
	}
	
	//로직 메서드 실행 후에 동작하는 어드바이스를 정의하는 메서드.
	@After("allPointcut()")
	public void finallyLog() {
		System.out.println("[사후 처리] 비즈니스 로직 수행 후 무조건 동작");
	}
}  
