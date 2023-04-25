package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserVO;

//AOP aspect-oriented programming
//비즈니스 로직 메서드가 수행된 이후에 동작하는 사후처리를 구현

@Service //서비스 빈으로 등록
@Aspect //지므니스 로직 메서드를 가로채어 사후처리수행
public class AfterReturningAdvice {
	
	//비즈니스 로직 메서드 실행 후에 동작하는 어드바이스를 정의
	@AfterReturning(pointcut="PointcutCommon.getPointcut()", returning="returnObj")
	public void afterLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if (returnObj instanceof UserVO) {
			UserVO user = (UserVO) returnObj;
			if (user.getRole().equals("Admin")) {
				System.out.println(user.getName() + " 로그인(Admin)");
			}
		}
		System.out.println("[사후 처리] " + method + "() 메소드 리턴값 : " + returnObj.toString());
	}
}