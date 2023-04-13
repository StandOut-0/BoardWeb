package com.springbook.view.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//CommonExceptionHandler ��ü �ڵ����� com.springbook.view�� ���ܰ� �߻��ϴ� ���� �޼ҵ尡 ����
@ControllerAdvice("com.springbook.view")
public class CommonExceptionHandler {
	
	//ArithmeticException
	//��������߿� �߻��ϴ� ����, ���������� ��ȣ�������� ������ ����ɶ� �߻�
	@ExceptionHandler(ArithmeticException.class)
	public ModelAndView handleArithmeticException(Exception e) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.setViewName("/common/arithmeticError.jsp");
		return mav;
	}

	//NullPointerException
	//��ü������ NULL�� ���¿��� �޼ҵ峪 ������ ����Ϸ��� �Ҷ� �߻�
	@ExceptionHandler(NullPointerException.class)
	public ModelAndView handleNullPointerException(Exception e) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.setViewName("/common/nullPointerError.jsp");
		return mav;
	}

	//�ڹٿ��� �߻��ϴ� ��翹��Ŭ������ ���� Ŭ����
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception e) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.setViewName("/common/error.jsp");
		return mav;
	}
}