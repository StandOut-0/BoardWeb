package com.springbook.view.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public DispatcherServlet() {
		super();
	}

	
	//� ������� ��û�ϵ� process�޼ҵ带 ���� Ŭ���̾�Ʈ�� ��û�� ó���Ѵ�.
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//�� ���, �����۾����� �ѱ� �����Ͱ� ������ ���� �߻����� �ʴ´�.
		request.setCharacterEncoding("EUC-KR");
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//����� path���ڿ��� ���� ������ �б� ó�������� ó���ȴ�.
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);
		
		if (path.equals("/login.do")) {
			System.out.println("�α��� ó��");
		} else if (path.equals("/logout.do")) {
			System.out.println("�α׾ƿ� ó��");
		} else if (path.equals("/insertBoard.do")) {
			System.out.println("�� ��� ó��");
		} else if (path.equals("/updateBoard.do")) {
			System.out.println("�� ���� ó��");
		} else if (path.equals("/deleteBoard.do")) {
			System.out.println("�� ���� ó��");
		} else if (path.equals("/getBoard.do")) {
			System.out.println("�� �� ��ȸ ó��");
		} else if (path.equals("/getBoardList.do")) {
			System.out.println("�� ��� �˻� ó��");
		}
	}
}