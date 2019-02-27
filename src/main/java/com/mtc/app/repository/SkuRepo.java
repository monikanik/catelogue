package com.mtc.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.mtc.app.entity.Item;

public interface SkuRepo extends CrudRepository<Item,Integer>{

	//Item findById(int sku_num);
}
