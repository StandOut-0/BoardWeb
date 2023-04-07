package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�ϳ��� �������� Controller�� �����ϸ� Ŭ���̾�Ʈ�� ��� ��û�� �ϳ��� ������ ó���ϰ� �Ǿ� 
//������ �б�ó�� ������ ���� �� �ۿ� ���� �̴� ���߰� ���������� ��ư� ��.
//handle������ ���� controller ��ü�� �˻��ϰ� �����ϵ��� ��, �̶� controller �ֻ��� �������̽��� �켱 ����.
public interface Controller {
	String handleRequest(HttpServletRequest request, HttpServletResponse response);
}
