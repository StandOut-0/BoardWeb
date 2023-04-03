package com.springbook.biz.common;

//기존 LogAdvice 성능이 떨어짐으로 대체할 클래스를 만들어보자.
public class Log4jAdvice {
	public void printLogging() {
		System.out.println("[공통 로그-Log4j] 비즈니스 로직 수행 전 동작");
	}
}
