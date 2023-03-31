package polymorphism;

import org.springframework.stereotype.Component;

//Speaker Ÿ���� ��ü�� �ΰ��̻��ϰ�� �����̳ʴ� � ��ü�� �Ҵ����� ������ �Ǵ��� �� ���� ������ �����.
//@Component("apple")
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker ��ü ����");
	}

	public void volumeUp() {
		System.out.println("AppleSpeaker---�Ҹ� �ø���.");
	}

	public void volumeDown() {
		System.out.println("AppleSpeaker---�Ҹ� ������.");
	}
}
