package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {
	
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
//	public void allPointcut() {
//	}
//	
//	@Before("allPointcut()")
//	public void beforeLog(JoinPoint jp){
//		String method = jp.getSignature().getName();
//		Object[] args = jp.getArgs();
//		
//		System.out.println("[���� ó��] " + method +
//				"() �޼ҵ� ARGS ���� : " + args[0].toString());
//	}
	
	//����Ʈ���� �������� ��ϵɼ��ְ�, xml���� pointcut-ref="id��"���� Ư�� ����Ʈ���� ������ ����� �� �־���.
	//�ֳ����̼Ǽ������� �����ϸ� �����̽� Ŭ�������� ����Ʈ�� ������ ���ԵǸ鼭 ���� ����Ʈ���� �ݺ� ����Ǵ� ������ �߻��Ѵ�.
	//�����̾ƴ� PointcutCommon�� ��� �����غ���.
	
	//���ǵ� ����Ʈ���� �����Ϸ��� Ŭ���� �̸��� �����޼��� �̸��� �����Ͽ� �����ؾ� �Ѵ�.
	@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint jp){
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[���� ó��] " + method +
				"() �޼ҵ� ARGS ���� : " + args[0].toString());
	}
	
}
