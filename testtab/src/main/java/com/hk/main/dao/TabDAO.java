package com.hk.main.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hk.main.service.TabInterface;
import com.hk.main.vo.TabVO;
@Repository
public class TabDAO implements TabInterface {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<TabVO> select() {
		List<TabVO> list = sqlSession.selectList("mapper.tab.selectAll");
		return list;

	}

}
