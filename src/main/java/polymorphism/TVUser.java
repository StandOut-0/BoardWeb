package polymorphism;

//ApplicationContext �ε��Ͽ� ��ü �����ϱ�
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

		// ���յ��� ���߱� ���� ��� - BeanFactory �����������̿��ϱ�
		// BeanFactory factory = new BeanFactory();
		// TV tv = (TV) factory.getBean(args[0]);

		// '��ü�� ����� ����' id ���� ��� �ƹ��������� ����, �׷��� Ŭ���̾�Ʈ�� ��û�ô� �����־���Ѵ�.
		//	AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
//		TV tv = (TV) factory.getBean("tv");	

		// ApplicationContext �ε��Ͽ� ��ü �����ϱ�
		// Spring �����̳� ���� �� ��ü ��û
//		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
//		TV tv = (TV) factory.getBean("tv");
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
//		factory.close();
		// [applicationContext.xml]�� �ε��Ͽ� ������ �����̳� �� �ϳ��� GenericXmlApplicationContext��
		// �������� Ȯ���� �� �ִ�.
		// INFO : org.springframework.beans.factory.xml.XmlBeanDefinitionReader -
		// Loading XML bean definitions from class path resource
		// [applicationContext.xml]
		// INFO : org.springframework.context.support.GenericXmlApplicationContext -
		// Refreshing
		// org.springframework.context.support.GenericXmlApplicationContext@10b48321:
		// startup date [Thu Mar 30 10:32:42 KST 2023]; root of context hierarchy
		
		
		//init-method �Ӽ� : bean��ü�� ������ �Ŀ� init-method �Ӽ����� ������ �޼��带 ȣ���Ѵ�. 
		//destory-method �Ӽ� : ��ü�� �����ϱ� ������ ȣ��� ������ �޼��带 �����Ѵ�.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		factory.close();
		
		
		
	}
}
