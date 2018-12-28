package com.qst.service;

import java.util.List;

import com.qst.pojos.Inbound;

public interface InboundService {

	public List<Inbound> listInbound();
	public int addInbound(Inbound inbound);
	public void deleteInbound(int inboundId);
}
