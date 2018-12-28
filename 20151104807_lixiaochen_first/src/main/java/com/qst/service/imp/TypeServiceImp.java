package com.qst.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qst.dao.TypeDao;
import com.qst.pojos.Type;
import com.qst.service.TypeService;
@Service 
public class TypeServiceImp implements TypeService{
	@Resource
	private TypeDao typeDao;
	public List<Type> listType() {
		return typeDao.listType();
	}
	public int addType(Type type) {
		return typeDao.addType(type);
	}
	public void deleteType(int typeId) {
		typeDao.deleteType(typeId);
	}
}
