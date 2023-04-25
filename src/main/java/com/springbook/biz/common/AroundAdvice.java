package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

//AOP aspect-oriented programming
//����Ͻ� ���� �޼��尡 ����� ���Ŀ� �����ϴ� ����ó���� ����

@Service //���� ������ ���
@Aspect //���ǴϽ� ���� �޼��带 ����ä�� ����ó������
public class AroundAdvice {
	
	//����Ͻ� ���� �޼��带 ����ç ������ ����
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {
	}
	
	//����Ͻ� ���� �޼��� ���� ���Ŀ� ����Ǵ� �����̽��� �����ϴ� �޼���
	@Around("allPointcut()")
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