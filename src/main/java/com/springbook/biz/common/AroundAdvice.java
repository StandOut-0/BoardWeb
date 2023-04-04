package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {
	
	//Around �����̽��� �ٸ� �����̽��ʹ� �ٸ��� �ݵ�� ProceedingJoinPoint ��ü�� �Ű������� �޾ƾ��Ѵ�.
	//ProceedingJoinPoint�� ����Ͻ� �޼ҵ带 ȣ���ϴ� proceed() �޼Ҹ� ������ �ִ�.
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		String method = pjp.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object obj = pjp.proceed();
		stopWatch.stop();
		System.out.println(method + "() �޼ҵ� ���࿡ �ɸ� �ð� : " + stopWatch.getTotalTimeMillis() + "(ms)��");
		return obj;
	}
}