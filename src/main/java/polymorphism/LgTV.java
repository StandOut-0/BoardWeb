package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.Resource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component("tv")
public class LgTV implements TV{
	
	//변수의 타입을 기준으로 객체를 검색하여 의존성 주입을 처리
	@Autowired
	private Speaker speaker;
	
	//Speaker 타입의 객체가 두개이상일경우 컨테이너는 어떤 객체를 할당할지 스스로 판단할 수 없어 에러가 생긴다.
	//이럴때 @Qualifier("이름")를 이용해 객체중 하나의 이름을 적어주면 간단하게 처리할 수 있다.
//	@Autowired
//	@Qualifier("apple")
//	private Speaker speaker;
	
	//객체의 이름을 이용하여 의존성 주입을 처리한다.
//	@Resource(name="apple")
//	private Speaker speaker;
	
	//결합도를 낮추기 위한 방법 - BeanFactory 디자인패턴이용하기
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void volumeUp() {
		System.out.println("LgTV---소리 올린다.");
		speaker.volumeUp();
	}

	public void volumeDown() {
		System.out.println("LgTV---소리 내린다.");
		speaker.volumeDown();
	}
}
