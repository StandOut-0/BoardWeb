package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.Resource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component("tv")
public class LgTV implements TV{
	
	//������ Ÿ���� �������� ��ü�� �˻��Ͽ� ������ ������ ó��
	@Autowired
	private Speaker speaker;
	
	//Speaker Ÿ���� ��ü�� �ΰ��̻��ϰ�� �����̳ʴ� � ��ü�� �Ҵ����� ������ �Ǵ��� �� ���� ������ �����.
	//�̷��� @Qualifier("�̸�")�� �̿��� ��ü�� �ϳ��� �̸��� �����ָ� �����ϰ� ó���� �� �ִ�.
//	@Autowired
//	@Qualifier("apple")
//	private Speaker speaker;
	
	//��ü�� �̸��� �̿��Ͽ� ������ ������ ó���Ѵ�.
//	@Resource(name="apple")
//	private Speaker speaker;
	
	//���յ��� ���߱� ���� ��� - BeanFactory �����������̿��ϱ�
	public void powerOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void volumeUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
		speaker.volumeUp();
	}

	public void volumeDown() {
		System.out.println("LgTV---�Ҹ� ������.");
		speaker.volumeDown();
	}
}
