package com.qst.dao;

import java.util.List;

import com.qst.pojos.Inbound;

public interface InboundDao {

	public List<Inbound> listInbound();
	public int addInbound(Inbound inbound);
	public void deleteInbound(int inboundId);
}
