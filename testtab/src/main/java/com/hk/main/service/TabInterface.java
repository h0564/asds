package com.hk.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hk.main.vo.TabVO;

@Service
public interface TabInterface {
	public abstract List<TabVO> select();
}
