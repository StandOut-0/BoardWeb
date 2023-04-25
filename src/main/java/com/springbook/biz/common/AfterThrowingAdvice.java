package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//AOP aspect-oriented programming
//비즈니스 로직 메서드가 수행된 이후에 동작하는 사후처리를 구현

@Service //서비스 빈으로 등록
@Aspect //지므니스 로직 메서드를 가로채어 사후처리수행
public class AfterThrowingAdvice {
	
	//비즈니스 로직 메서드를 가로챌 지점을 정의
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {
	}
	
	//비즈니스 로직 메서드 실행 중 예외가 발생한 경우 동작하는 어드바이스를 정의하는 메서드
	@AfterThrowing(pointcut="allPointcut()", throwing="exceptObj")
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		 System.out.println("[예외 처리] " + method + "() 메소드 수행 중 발생된 예외 메시지 : "
		 + exceptObj.getMessage());

		System.out.println(method + "() 메소드 수행 중 예외 발생!");
		if (exceptObj instanceof IllegalArgumentException) {
			System.out.println("부적합한 값이 입력되었습니다.");
		} else if (exceptObj instanceof NumberFormatException) {
			System.out.println("숫자 형식의 값이 아닙니다.");
		} else if (exceptObj instanceof Exception) {
			System.out.println("문제가 발생했습니다.");
		}
	}
}
