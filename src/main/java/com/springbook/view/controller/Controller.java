package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//하나의 서블릿으로 Controller를 구현하면 클라이언트의 모든 요청을 하나의 서블릿이 처리하게 되어 
//수많은 분기처리 로직을 가질 수 밖에 없고 이는 개발과 유지보수를 어렵게 함.
//handle매핑을 통해 controller 객체를 검색하고 실행하도록 함, 이때 controller 최상위 인터페이스를 우선 구현.
public interface Controller {
	String handleRequest(HttpServletRequest request, HttpServletResponse response);
}
