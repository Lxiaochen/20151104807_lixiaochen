package com.qst.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qst.dao.InboundDao;
import com.qst.pojos.Inbound;
import com.qst.service.InboundService;

@Service
public class InboundServiceImp implements InboundService{

	@Resource
	private InboundDao inboundDao;
	public List<Inbound> listInbound() {
		// TODO Auto-generated method stub
		return inboundDao.listInbound();
	}

	public int addInbound(Inbound inbound) {
		// TODO Auto-generated method stub
		return inboundDao.addInbound(inbound);
	}

	public void deleteInbound(int inboundId) {
		// TODO Auto-generated method stub
		inboundDao.deleteInbound(inboundId);
	}

}
