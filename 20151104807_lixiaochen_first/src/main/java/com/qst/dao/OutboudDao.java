package com.qst.dao;

import java.util.List;

import com.qst.pojos.Outboud;

public interface OutboudDao {
	public List<Outboud> listOutbound();
	public int addOutboud(Outboud outboud);
	public void deleteOutboud(int outboudId);
}
