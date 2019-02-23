package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.entity.PageResult;
import com.pinyougou.pojo.TbBrand;

public interface BrandService {
	public List<TbBrand> findAll();
	public PageResult findPage(int pageNum,int pageSize);
	  public void add(TbBrand brand);
	  public void update(TbBrand brand);
	  public  TbBrand findOne(Long id);
	  public PageResult findPage(TbBrand brand,int pageNum,int pageSize);
	  public void delete(Long [] ids);
	  /**
		 * 返回下拉列表数据
		 * @return
		 */
		public List<Map> selectOptionList();
}
