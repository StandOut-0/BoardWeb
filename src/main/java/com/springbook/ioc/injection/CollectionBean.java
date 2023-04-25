package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
//	private List addressList;
//	private Set<String> addressList;
//	private Map<String, String> addressList;
	private Properties addressList;
	
	//Properties는 Hashtable클래스를 확장한것. 기존 키와 값을 저장하고 검색할 수 있는 데이터구조에 
	//추가적으로 텍스트 파일로 저장하고 로드하는 기능을 제공한다.
	
	//	private Properties addressList;

//	public void setAddressList(List<String> addressList) {
//	public void setAddressList(Set<String> addressList) {
//	public void setAddressList(Map<String,String> addressList) {
	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}

//	public List<String> getAddressList() {
//	public Set<String> getAddressList() {
//	public Map<String,String> getAddressList() {
	public Properties getAddressList() {
		return addressList;
	}
}
