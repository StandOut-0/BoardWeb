package polymorphism;

import org.springframework.stereotype.Component;

//Speaker 타입의 객체가 두개이상일경우 컨테이너는 어떤 객체를 할당할지 스스로 판단할 수 없어 에러가 생긴다.
//@Component("sony")
public class SonySpeaker implements Speaker{
	public SonySpeaker() {
		System.out.println("===> SonySpeaker 객체 생성");
	}

	public void volumeUp() {
		System.out.println("SonySpeaker---소리 올린다.");
	}

	public void volumeDown() {
		System.out.println("SonySpeaker---소리 내린다.");
	}
}
