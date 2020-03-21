package com.example.demo.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Product;
import com.example.demo.respository.ProductRespository;

/**
 * @author prabhakarambavarapu
 *
 */
@RestController
@RequestMapping("/product")
public class DBResource {

	
	@Autowired
	ProductRespository productRepo;
	
	
	@GetMapping("/search/findall")
	public @ResponseBody List<Product> findAll(){
		
			List<Product> products = new ArrayList<Product>();
			productRepo.findAll().forEach(products::add);
			return products;
		}
	
	@GetMapping("/search/searchbyprice")
	public @ResponseBody Map<Integer, List<Product>>  searcbyPrice(){
			List<Product> products = new ArrayList<Product>();
			productRepo.findAll().forEach(products::add);
			return 	products.stream().collect(Collectors.groupingBy(Product::getPrice));
		}
	
	@GetMapping("/search/countbyseller/{suppliername}")
	public @ResponseBody Integer  countbyseller(@PathVariable("suppliername") final String suppliername){
			List<Product> products = new ArrayList<Product>();
			productRepo.findAll().forEach(products::add);
			return productRepo.findBySupplier(suppliername).size();
		}
	
	
	@GetMapping("/search/searchbybrand")
	public @ResponseBody Map<String, List<Product>>  searcbyBrand(){
			List<Product> products = new ArrayList<Product>();
			productRepo.findAll().forEach(products::add);
			return 	products.stream().collect(Collectors.groupingBy(Product::getBrand));
		}
	
	@GetMapping("/search/searchbycolor")
	public @ResponseBody Map<String, List<Product>>  searcbyColor(){
			List<Product> products = new ArrayList<Product>();
			productRepo.findAll().forEach(products::add);
			return 	products.stream().collect(Collectors.groupingBy(Product::getColor));
		}
	
	@GetMapping("/search/searchbysize")
	public @ResponseBody Map<Integer, List<Product>>  searcbySize(){
			List<Product> products = new ArrayList<Product>();
			productRepo.findAll().forEach(products::add);
			return 	products.stream().collect(Collectors.groupingBy(Product::getSize));
		}
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody final Product product ) {
		product.setCreatedDate(new java.util.Date());
		Product p1 = productRepo.save(product);
		return p1;
		
	}
	
	@PostMapping("/deletebysupplier/{suppliername}")
	public String addProduct(@PathVariable("suppliername") final String suppliername ) {
		try {
			productRepo.deleteBySupplier(suppliername);
			return "products deleted successfully";
		} catch (Exception e) {
			// TODO: handle exception
			return "products not deleted successfully";
		}
		
	}
	
	@PostMapping("/delete/{id}")
	public String deleteProductById(@PathVariable("id") final Integer id) {
		try {
			productRepo.deleteById(id);
			return "product deleted successfully";
		}catch (Exception e) {
			// TODO: handle exception
			return e.getMessage();
		}
		
		
	}
	
	
}
