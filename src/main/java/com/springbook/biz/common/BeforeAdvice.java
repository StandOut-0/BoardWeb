package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

//AOP aspect-oriented programming
//비즈니스 로직 메서드가 수행된 이후에 동작하는 사후처리를 구현

@Service //서비스 빈으로 등록
@Aspect //지므니스 로직 메서드를 가로채어 사후처리수행
public class BeforeAdvice {
	
	//비즈니스 로직 메서드를 가로챌 지점을 정의
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
//	public void allPointcut() {
//	}
//	
	
	//지정된 포인트컷에 해당하는 메서드 실행 전에 수행될 어드바이스를 정의
//	@Before("allPointcut()")
//	public void beforeLog(JoinPoint jp){
//		String method = jp.getSignature().getName();
//		Object[] args = jp.getArgs();
//		
//		System.out.println("[사전 처리] " + method +
//				"() 메소드 ARGS 정보 : " + args[0].toString());
//	}
	
	//포인트컷은 여러개가 등록될수있고, xml에서 pointcut-ref="id값"으로 특정 포인트컷을 참조해 사용할 수 있었다.
	//애너테이션설정으로 변경하면 어드바이스 클래스마다 포인트컷 설정이 포함되면서 같은 포인트컷이 반복 선언되는 문제가 발생한다.
	//전역이아닌 PointcutCommon을 잡아 참조해보자.
	
	//정의된 포인트컷을 참조하려면 클래스 이름과 참조메서드 이름을 조합하여 지정해야 한다.
	@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint jp){
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[사전 처리] " + method +
				"() 메소드 ARGS 정보 : " + args[0].toString());
	}
	
}
