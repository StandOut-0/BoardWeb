package com.springbook.view.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//CommonExceptionHandler 객체 자동생성 com.springbook.view로 예외가 발생하는 순간 메소드가 실행
@ControllerAdvice("com.springbook.view")
public class CommonExceptionHandler {
	
	//ArithmeticException
	//산술연산중에 발생하는 예외, 수학적으로 유호하지않은 연산이 수행될때 발생
	@ExceptionHandler(ArithmeticException.class)
	public ModelAndView handleArithmeticException(Exception e) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.setViewName("/common/arithmeticError.jsp");
		return mav;
	}

	//NullPointerException
	//객체참조가 NULL인 상태에서 메소드나 변수를 사용하려고 할때 발생
	@ExceptionHandler(NullPointerException.class)
	public ModelAndView handleNullPointerException(Exception e) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.setViewName("/common/nullPointerError.jsp");
		return mav;
	}

	//자바에서 발생하는 모든예외클래스의 조상 클래스
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception e) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.setViewName("/common/error.jsp");
		return mav;
	}
}