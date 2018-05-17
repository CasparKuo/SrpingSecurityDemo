package com.example.demo.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MemberInfo")
public class MemberInfo {

	@Id
	private String id;
	private String userId;
	private String phone;
	private String email;
	private String groupKey;
	private String botId;
	private Object memberAddress;
	
	public void setUserId(String userId){
		this.userId = userId;
	}
	public String getUserId(){
		return this.userId;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return this.phone;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setGroupKey(String groupKey){
		this.groupKey = groupKey;
	}
	public String getGroupKey(){
		return this.groupKey;
	}
	
	public void setBotId(String botId){
		this.botId = botId;
	}
	public String getBotId(){
		return this.botId;
	}
	
	public void setMemberAddress(Object memberAddress){
		this.memberAddress = memberAddress;
	}
	public Object getMemberAddress(){
		return this.memberAddress;
	}
}
