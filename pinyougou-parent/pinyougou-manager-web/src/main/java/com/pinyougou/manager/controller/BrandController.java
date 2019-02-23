package com.pinyougou.manager.controller;


import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.entity.PageResult;
import com.pinyougou.entity.Result;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {
	@Reference
	private BrandService brandService;
@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
	List<TbBrand> aa=brandService.findAll();
	return aa;
}
@RequestMapping("/findPage")
public PageResult findPage(int page,int size){
	return brandService.findPage(page, size);
}

@RequestMapping("/add")
public Result add(@RequestBody TbBrand brand){
	try {
		brandService.add(brand);
		return new Result(true, "增加成功");
	} catch (Exception e) {
		e.printStackTrace();
		return new Result(false, "增加失败");
	}
}
@RequestMapping("/update")
public Result update(@RequestBody TbBrand brand){
	try {
		brandService.update(brand);
		return new Result(true,"修改成功");
	} catch (Exception e) {
		e.printStackTrace();
		return new Result(false,"修改失败");
	}
}
@RequestMapping("/findOne")
public TbBrand findOne(Long id){
	TbBrand ss= brandService.findOne(id);
	return ss;
}
@RequestMapping("/search")
public PageResult search(@RequestBody TbBrand brand,int page,int rows){
	return brandService.findPage(brand, page, rows);
}
@RequestMapping("/delete")
public Result delete(Long [] ids){
	try {
		brandService.delete(ids);
		return new Result(true,"成功");
	} catch (Exception e) {
		e.printStackTrace();
		return new Result(false,"失败");
	}
	
}
@RequestMapping("/selectOptionList")
public List<Map> selectOptionList() {
	return brandService.selectOptionList();
}
}
