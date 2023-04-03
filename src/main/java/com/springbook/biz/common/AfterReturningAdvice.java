package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

import com.springbook.biz.user.UserVO;

public class AfterReturningAdvice {
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if (returnObj instanceof UserVO) {
			UserVO user = (UserVO) returnObj;
			if (user.getRole().equals("ADMIN")) {
				System.out.println(user.getName() + " �α���(Admin)");
			}
			else {
				System.out.println("�Ϲ�ȸ�� �α���");
			}
		}
		System.out.println("[���� ó��] " + method + "() �޼ҵ� ���ϰ� : " + returnObj.toString());
	}
}