package com.example.demo.model.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.entity.MemberInfo;

public interface MemberInfoDao extends MongoRepository<MemberInfo, String>{

	public List<MemberInfo> findByGroupKey(String key);
	public List<MemberInfo> findByPhone(String phone);
	public List<MemberInfo> findByEmail(String email);
}
