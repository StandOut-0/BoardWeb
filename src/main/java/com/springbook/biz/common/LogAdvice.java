package com.springbook.biz.common;

//Ŭ���̾�Ʈ�� ȣ���� ����Ͻ� �޼ҵ��� ������ �̿��� �� �ֵ��� ��
import org.aspectj.lang.JoinPoint;

//������ OOP���� �Ϻ��� ���ɺи��� �־�������� �ǽ��غ���.
//��� �޼ҵ尡 ����Ǳ� ������ �������� ó���� ������ ��������.
public class LogAdvice {
	public void printLog(JoinPoint jp) {
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");
	}
}
