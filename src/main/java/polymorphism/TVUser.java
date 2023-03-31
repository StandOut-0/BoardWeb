package polymorphism;

//ApplicationContext 로딩하여 객체 생성하기
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

		// 결합도를 낮추기 위한 방법 - BeanFactory 디자인패턴이용하기
		// BeanFactory factory = new BeanFactory();
		// TV tv = (TV) factory.getBean(args[0]);

		// '객체를 만들기 위해' id 값이 없어도 아무런문제가 없다, 그러나 클라이언트가 요청시는 정해주어야한다.
		//	AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
//		TV tv = (TV) factory.getBean("tv");	

		// ApplicationContext 로딩하여 객체 생성하기
		// Spring 컨테이너 구동 및 객체 요청
//		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
//		TV tv = (TV) factory.getBean("tv");
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
//		factory.close();
		// [applicationContext.xml]를 로딩하여 스프링 컨테이너 중 하나인 GenericXmlApplicationContext를
		// 구동함을 확인할 수 있다.
		// INFO : org.springframework.beans.factory.xml.XmlBeanDefinitionReader -
		// Loading XML bean definitions from class path resource
		// [applicationContext.xml]
		// INFO : org.springframework.context.support.GenericXmlApplicationContext -
		// Refreshing
		// org.springframework.context.support.GenericXmlApplicationContext@10b48321:
		// startup date [Thu Mar 30 10:32:42 KST 2023]; root of context hierarchy
		
		
		//init-method 속성 : bean객체를 생성한 후에 init-method 속성으로 지정된 메서드를 호출한다. 
		//destory-method 속성 : 객체를 삭제하기 직전에 호출될 임의의 메서드를 지정한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		factory.close();
		
		
		
	}
}
