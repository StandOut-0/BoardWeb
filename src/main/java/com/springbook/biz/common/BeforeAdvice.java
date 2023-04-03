package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public void beforeLog(JoinPoint jp){
		//getSignature() ȣ���� �޼ҵ� �̸��� ���
		//getArgs() ���ڸ���� Object �迭�� �� �� �־� � ���� ����ߴ����� Ȯ�ΰ���.
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[���� ó��] " + method +
				"() �޼ҵ� ARGS ���� : " + args[0].toString());
		//[���� ó��] getUser() �޼ҵ� ARGS ���� : UserVO [id=TEST, password=TEST123, name=null, role=null]
	}
}
