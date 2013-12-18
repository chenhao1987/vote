package com.hchen.persistent.dao;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.hchen.model.GoodsInfo;

public class TestDAO extends SqlMapClientDaoSupport {

	public List<GoodsInfo> getGoodsInfo(){
		return (List<GoodsInfo>)this.getSqlMapClientTemplate().queryForList("findGoodsInfo");
	}
}
