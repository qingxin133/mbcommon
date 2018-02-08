package com.hehe.tools;

import java.util.List;

import com.hehe.entity.PageVO;


/**
 * 通用Service
 */
public interface BaseService<T> {

	PageVO<T> listPage(T entity,int pageNum, int pageSize);
	
	List<T> list(T entity,int pageNum, int pageSize);

    T get(T entity);

    int update(T entity);

    int save(T entity);

    int delete(T entity);

}
