package com.qst.dao;

import java.util.List;

import com.qst.pojos.Type;

public interface TypeDao {

	public List<Type> listType();
	public int addType(Type type);
	public void deleteType(int typeId);
	
}
