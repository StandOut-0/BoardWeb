package polymorphism;

public class SamsungTV implements TV {

	// 결합도를 낮추기 위한 방법 - BeanFactory 디자인패턴이용하기
//	public void powerOn() {
//		System.out.println("SamsungTV---전원 켠다.");
//	}
//
//	public void powerOff() {
//		System.out.println("SamsungTV---전원 끈다.");
//	}
//
//	public void volumeUp() {
//		System.out.println("SamsungTV---소리 올린다.");
//	}
//
//	public void volumeDown() {
//		System.out.println("SamsungTV---소리 내린다.");
//	}
//	
//	//ApplicationContext 로딩하여 객체 생성하기
//	public SamsungTV() {
//		System.out.println("===> SamsungTV(1) 객체 생성");
//	}

	// init-method 속성 : bean객체를 생성한 후에 init-method 속성으로 지정된 메서드를 호출한다.
//	public void initMethod() {
//		System.out.println("init-Method: 객체 생성한 후에 지정된 메서드를 호출할 수 있다.\n");
//	}
	// destory-method 속성 : 객체를 삭제하기 직전에 호출될 임의의 메서드를 지정한다.
//	public void destoryMethod() {
//		System.out.println("destory-Method: 객체를 삭제하기 직전에 메서드를 호출할 수 있다.\n");
//	}

	// -----------------------------------------------------------------------

//	private Speaker speaker;
//	// 생성자 인젝션 이용하기 Dependency Injection - constructor injection
////	public SamsungTV() {
////		System.out.println("===> SamsungTV(1) 객체 생성");
////		speaker = new SonySpeaker();
////	}
//
//	// 생성자 인젝션 이용하기 Dependency Injection - setter injection
//	public SamsungTV() {
//		System.out.println("===> SamsungTV(1) 객체 생성");
//	}
//
//	public SamsungTV(Speaker speaker) {
//		System.out.println("===> SamsungTV(2) 객체 생성");
//		this.speaker = speaker;
//	}
//
//	
//	// 다중 변수 매핑
//	private int price;
//
//	public SamsungTV(Speaker speaker, int price) {
//		System.out.println("\n===> SamsungTV(speaker, price) 객체 생성");
//		this.speaker = speaker;
//		this.price = price;
//	}
//
//	public void powerOn() {
//		System.out.println("SamsungTV---전원 켠다. (가격 : " + price + ")");
//	}

	// -----------------------------------------------------------------------

	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다. (가격 : " + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.\n");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

}