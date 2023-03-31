package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import com.springbook.ioc.injection.CollectionBean;

public class CollectionBeanClient {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
//		List<String> addressList = bean.getAddressList();
//		Set<String> addressList = bean.getAddressList();
//		Map<String,String> addressList = bean.getAddressList();
		Properties addressList = bean.getAddressList();
		
		
		
//		for( String address : addressList ){
//			System.out.println(address.toString() );
//		}
		
		
		//Map
//		System.out.println(addressList);
		
		for( String key : addressList.stringPropertyNames() ){
			System.out.println(String.format("Å° : %s, °ª : %s", key, addressList.get(key)) );
		}
		
		factory.close();
	}
}
