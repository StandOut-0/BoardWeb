package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

//AOP aspect-oriented programming
//비즈니스 로직 메서드가 수행된 이후에 동작하는 사후처리를 구현

@Service //서비스 빈으로 등록
@Aspect //지므니스 로직 메서드를 가로채어 사후처리수행
public class AroundAdvice {
	
	//비즈니스 로직 메서드를 가로챌 지점을 정의
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {
	}
	
	//비즈니스 로직 메서드 실행 전후에 수행되는 어드바이스를 정의하는 메서드
	@Around("allPointcut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		String method = pjp.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object obj = pjp.proceed();
		stopWatch.stop();
		System.out.println(method + "() 메소드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");
		return obj;
	}
}