package com.qst.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qst.dao.OutboudDao;
import com.qst.pojos.Outboud;
import com.qst.service.OutboudService;

@Service
public class OutboudServiceImp implements OutboudService{

	@Resource
	private OutboudDao ourboudDao;
	public List<Outboud> listOutbound() {
		// TODO Auto-generated method stub
		return ourboudDao.listOutbound();
	}

	public int addOutboud(Outboud outboud) {
		// TODO Auto-generated method stub
		return ourboudDao.addOutboud(outboud);
	}

	public void deleteOutboud(int outboudId) {
		// TODO Auto-generated method stub
		ourboudDao.deleteOutboud(outboudId);
	}

}
