package com.AliceWonderland.bakery.dao;

import com.AliceWonderland.bakery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
