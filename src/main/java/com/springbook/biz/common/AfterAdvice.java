package com.springbook.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//AOP aspect-oriented programming
//����Ͻ� ���� �޼��尡 ����� ���Ŀ� �����ϴ� ����ó���� ����

@Service //���� ������ ���
@Aspect //���ǴϽ� ���� �޼��带 ����ä�� ����ó������
public class AfterAdvice {
	
	//����Ͻ� ���� �޼��带 ����ç ������ ����
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {
	}
	
	//���� �޼��� ���� �Ŀ� �����ϴ� �����̽��� �����ϴ� �޼���.
	@After("allPointcut()")
	public void finallyLog() {
		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ������ ����");
	}
}  
