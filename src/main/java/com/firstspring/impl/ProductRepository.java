package com.firstspring.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import com.firstspring.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	// chứa các phương thức tương tác với entity
}
