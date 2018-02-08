package com.hehe.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import com.github.pagehelper.Page;
import com.hehe.entity.PageInfoVO;


/**
 * 对Page<E>结果进行包装
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class PageVO<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /**
     * 结果集
     */
    private List<T> list;
    /**
     * 分页信息
     */
    private PageInfoVO pageInfo;
    
    public PageVO() {
    }

    public PageInfoVO getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfoVO pageInfo) {
		this.pageInfo = pageInfo;
	}

	/**
     * 包装Page对象
     *
     * @param list
     */
    public PageVO(List<T> list) {
    	if(pageInfo==null)
    		pageInfo = new PageInfoVO();
        //判断页面边界
        if (list instanceof Page) {
            Page pageHelp = (Page) list;
            pageInfo.setPageNum(pageHelp.getPageNum());
            pageInfo.setPageSize(pageHelp.getPageSize());

            pageInfo.setTotalPage(pageHelp.getPages());
            this.list = pageHelp;
            pageInfo.setTotalCount(pageHelp.getTotal());
        } else if (list instanceof Collection) {
        	pageInfo.setPageNum(1);
        	pageInfo.setPageSize(list.size());
        	pageInfo.setTotalPage(1);
            this.list = list;
            pageInfo.setTotalCount(list.size());
        } 
        if (list instanceof Collection) {
        		pageInfo.judgePageBoudary();
        }
    }

	public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PageVO{");
        sb.append("pageNum=").append(pageInfo.getPageNum());
        sb.append(", pageSize=").append(pageInfo.getPageSize());
        sb.append(", total=").append(pageInfo.getTotalCount());
        sb.append(", pages=").append(pageInfo.getTotalPage());
        sb.append(", list=").append(list);
        sb.append(", isFirstPage=").append(pageInfo.isFirstPage());
        sb.append(", isLastPage=").append(pageInfo.isLastPage());
        sb.append(", navigatepageNums=");
        sb.append('}');
        return sb.toString();
    }
}