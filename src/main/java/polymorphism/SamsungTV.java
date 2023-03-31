package polymorphism;

public class SamsungTV implements TV {

	// ���յ��� ���߱� ���� ��� - BeanFactory �����������̿��ϱ�
//	public void powerOn() {
//		System.out.println("SamsungTV---���� �Ҵ�.");
//	}
//
//	public void powerOff() {
//		System.out.println("SamsungTV---���� ����.");
//	}
//
//	public void volumeUp() {
//		System.out.println("SamsungTV---�Ҹ� �ø���.");
//	}
//
//	public void volumeDown() {
//		System.out.println("SamsungTV---�Ҹ� ������.");
//	}
//	
//	//ApplicationContext �ε��Ͽ� ��ü �����ϱ�
//	public SamsungTV() {
//		System.out.println("===> SamsungTV(1) ��ü ����");
//	}

	// init-method �Ӽ� : bean��ü�� ������ �Ŀ� init-method �Ӽ����� ������ �޼��带 ȣ���Ѵ�.
//	public void initMethod() {
//		System.out.println("init-Method: ��ü ������ �Ŀ� ������ �޼��带 ȣ���� �� �ִ�.\n");
//	}
	// destory-method �Ӽ� : ��ü�� �����ϱ� ������ ȣ��� ������ �޼��带 �����Ѵ�.
//	public void destoryMethod() {
//		System.out.println("destory-Method: ��ü�� �����ϱ� ������ �޼��带 ȣ���� �� �ִ�.\n");
//	}

	// -----------------------------------------------------------------------

//	private Speaker speaker;
//	// ������ ������ �̿��ϱ� Dependency Injection - constructor injection
////	public SamsungTV() {
////		System.out.println("===> SamsungTV(1) ��ü ����");
////		speaker = new SonySpeaker();
////	}
//
//	// ������ ������ �̿��ϱ� Dependency Injection - setter injection
//	public SamsungTV() {
//		System.out.println("===> SamsungTV(1) ��ü ����");
//	}
//
//	public SamsungTV(Speaker speaker) {
//		System.out.println("===> SamsungTV(2) ��ü ����");
//		this.speaker = speaker;
//	}
//
//	
//	// ���� ���� ����
//	private int price;
//
//	public SamsungTV(Speaker speaker, int price) {
//		System.out.println("\n===> SamsungTV(speaker, price) ��ü ����");
//		this.speaker = speaker;
//		this.price = price;
//	}
//
//	public void powerOn() {
//		System.out.println("SamsungTV---���� �Ҵ�. (���� : " + price + ")");
//	}

	// -----------------------------------------------------------------------

	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) ��ü ����");
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�. (���� : " + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV---���� ����.\n");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

}