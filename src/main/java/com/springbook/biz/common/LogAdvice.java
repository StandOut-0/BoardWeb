package com.springbook.biz.common;


//기존의 OOP언어에서 완벽한 관심분리가 왜어려운지를 실습해보자.
//모든 메소드가 실행되기 직전에 공통으로 처리할 로직을 구현하자.
public class LogAdvice {
	public void printLog() {
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
	}
}
