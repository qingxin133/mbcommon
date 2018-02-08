package com.hehe.entity;

public class PageInfoVO {

	//当前页
    private int pageNum=1;
    //每页的数量
    private int pageSize=10;
    //总记录数
    private long totalCount;
    //总页数
    private int totalPage;
    
    //是否为第一页
    private boolean isFirstPage = false;
    //是否为最后一页
    private boolean isLastPage = false;
    
    
    /**
     * 判定页面边界
     */
    public void judgePageBoudary() {
        isFirstPage = pageNum <= 1;
        isLastPage = pageNum >= totalPage;
    }


	public int getPageNum() {
		return pageNum;
	}


	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public long getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}


	public int getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}


	public boolean isFirstPage() {
		return isFirstPage;
	}


	public void setFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}


	public boolean isLastPage() {
		return isLastPage;
	}


	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}
    
 
}
