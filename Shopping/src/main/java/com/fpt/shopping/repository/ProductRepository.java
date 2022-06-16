package com.fpt.shopping.repository;

import com.fpt.shopping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
