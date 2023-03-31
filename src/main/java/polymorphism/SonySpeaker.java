package polymorphism;

import org.springframework.stereotype.Component;

//Speaker Ÿ���� ��ü�� �ΰ��̻��ϰ�� �����̳ʴ� � ��ü�� �Ҵ����� ������ �Ǵ��� �� ���� ������ �����.
//@Component("sony")
public class SonySpeaker implements Speaker{
	public SonySpeaker() {
		System.out.println("===> SonySpeaker ��ü ����");
	}

	public void volumeUp() {
		System.out.println("SonySpeaker---�Ҹ� �ø���.");
	}

	public void volumeDown() {
		System.out.println("SonySpeaker---�Ҹ� ������.");
	}
}
