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
