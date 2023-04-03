package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public void beforeLog(JoinPoint jp){
		//getSignature() 호출한 메소드 이름을 출력
		//getArgs() 인자목록을 Object 배열로 얻어낼 수 있어 어떤 값을 사용했는지도 확인가능.
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[사전 처리] " + method +
				"() 메소드 ARGS 정보 : " + args[0].toString());
		//[사전 처리] getUser() 메소드 ARGS 정보 : UserVO [id=TEST, password=TEST123, name=null, role=null]
	}
}
