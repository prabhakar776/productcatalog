package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.Product;

/**
 * @author prabhakarambavarapu
 *
 */
@Component
@org.springframework.stereotype.Repository
public interface ProductRespository extends CrudRepository<Product, Integer> {

	
	List<Product> findBySupplier(String supplier);
	
	@Modifying
	@Transactional
	void deleteBySupplier(String supplier);
	
}
