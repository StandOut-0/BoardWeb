package polymorphism;

public class BeanFactory {
	public Object getBean(String beanName) {
		
		//getBean()�� ������ beanName�� samsung�ϰ�� samsung, lg�ϰ�� lg ��ü�� ����� �����Ѵ�.
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		} else if (beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}
}
