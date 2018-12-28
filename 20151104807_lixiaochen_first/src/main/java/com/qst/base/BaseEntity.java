package com.qst.base;

import java.util.ArrayList;
import java.util.List;

import com.qst.constants.Constant;

public class BaseEntity<T> {
	private int perRow=Constant.PERROW;
	private int pageNum=Constant.PAGENUM;
	private int startRow=Constant.STARTROW;
	private int endRow;
	private int upPage;
	private int nextPage;
	private int totalPage;
	private boolean isPage=Constant.ISPAGE;
	
	private List<T> list = new ArrayList<T>();
	
	
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getPerRow() {
		return perRow;
	}
	public void setPerRow(int perRow) {
		this.perRow = perRow;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public int getUpPage() {
		return this.pageNum-1;
	}
	public void setUpPage(int upPage) {
		this.upPage = upPage;
	}
	public int getNextPage() {
		return this.pageNum+1;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public boolean isPage() {
		return isPage;
	}
	public void setPage(boolean isPage) {
		this.isPage = isPage;
	}
	
	

}
