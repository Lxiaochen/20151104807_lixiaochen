package com.qst.service;

import java.util.List;

import com.qst.pojos.Type;

public interface TypeService {

	public List<Type> listType();
	public int addType(Type type);
	public void deleteType(int typeId);
}
