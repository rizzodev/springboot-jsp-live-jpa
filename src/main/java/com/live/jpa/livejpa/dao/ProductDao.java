
package com.live.jpa.livejpa.dao;

import com.live.jpa.livejpa.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends PagingAndSortingRepository<Product, String>{
    
}
