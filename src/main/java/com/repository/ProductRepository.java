package com.repository;

import org.springframework.stereotype.Repository;
import com.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}
