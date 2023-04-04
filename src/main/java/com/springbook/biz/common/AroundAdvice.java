package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {
	
	//Around 어드바이스는 다른 어드바이스와는 다르게 반드시 ProceedingJoinPoint 객체를 매개변수로 받아야한다.
	//ProceedingJoinPoint는 비즈니스 메소드를 호출하는 proceed() 메소를 가지고 있다.
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