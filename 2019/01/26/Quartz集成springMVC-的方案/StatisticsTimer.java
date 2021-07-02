package com.fh.timemission.statistics;

import java.util.List;

import javax.annotation.Resource;
import com.fh.dao.YycDaoSupport;
import com.fh.entity.Page;

public class StatisticsTimer  {
	
	@Resource(name = "yycDaoSupport")
	private YycDaoSupport dao;
	
	public void run() {
      //定时要做的事情的具体实现
		System.out.println("-----------------------------------------------------");
		try {
			Page obj = new Page();
			List<?> list = (List<?>)dao.findForList("StatisticsMapper.quryStation",obj);
			System.out.println("-----------------------------------------------------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
    }
}