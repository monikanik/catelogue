package com.mtc.app.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtc.app.entity.Item;
import com.mtc.app.repository.SkuRepo;

@RestController
public class FindBySkuController {
	
	@Autowired
	private SkuRepo skuRepo;
	
	
	@RequestMapping(value="/searchproduct/{sku_num}",produces =" application/json")
	public Item searchProcess(@PathVariable("sku_num") int sku_num) {
		
		//Item details = skuRepo.findById(sku_num);
	    return skuRepo.findById(sku_num).get();
		
	}

}
