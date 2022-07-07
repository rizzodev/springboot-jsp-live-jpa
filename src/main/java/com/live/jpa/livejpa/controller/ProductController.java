
package com.live.jpa.livejpa.controller;

import com.live.jpa.livejpa.dao.ProductDao;
import com.live.jpa.livejpa.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("api/product")
public class ProductController {
    
    @Autowired
    private ProductDao p;
    
    @GetMapping("/")
    public Page<Product> findProducts(Pageable page){
        return p.findAll(page);
    }
    
    //    @GetMapping("/")
//    public Iterable<Product> findAll(){
//        return p.findAll();
//    }
    

}
