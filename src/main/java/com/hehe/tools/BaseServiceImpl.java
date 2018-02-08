package com.hehe.tools;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.hehe.entity.PageVO;

import tk.mybatis.mapper.common.Mapper;

/**
 * 主要用途：通用Service 封装常用的CRUD方法
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private Mapper<T> mapper;//泛型装配

    
    /**
     * 分页查询，返回分页结果和分页信息
     * entity  查询条件
     * pageNum 页码
     * pageSize 行数
     */
    @Override
    public PageVO<T> listPage(T entity,int pageNum, int pageSize) {
    	PageHelper.startPage(pageNum, pageSize);
        List<T> list =  mapper.select(entity);
        PageVO<T> pageInfo = new PageVO<T>(list);
        return pageInfo;
    }
    
    /**
     * 分页查询，返回分页结果
     * entity  查询条件
     * pageNum 页码
     * pageSize 行数
     */
    @Override
    public List<T> list(T entity,int pageNum, int pageSize){
       PageHelper.startPage(pageNum, pageSize);
       List<T> list =  mapper.select(entity);
       return list;
    }

    @Override
    public T get(T entity) {
        return  mapper.selectOne(entity);
    }

    @Override
    public int update(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int save(T entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public int delete(T entity) {
        return mapper.deleteByPrimaryKey(entity);
    }
}
