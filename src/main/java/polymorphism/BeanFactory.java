package polymorphism;

public class BeanFactory {
	public Object getBean(String beanName) {
		
		//getBean()을 했을때 beanName이 samsung일경우 samsung, lg일경우 lg 객체르 만들어 리턴한다.
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		} else if (beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}
}
