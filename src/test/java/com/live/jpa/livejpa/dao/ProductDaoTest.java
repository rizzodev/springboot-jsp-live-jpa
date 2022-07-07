
package com.live.jpa.livejpa.dao;

import com.live.jpa.livejpa.entity.Product;
import java.math.BigDecimal;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductDaoTest {

    @Autowired
    private ProductDao p;

    @Test
    public void saveProduct() {
        Product test = new Product().builder()
                .code("P-001")
                .name("Product1")
                .price(new BigDecimal("100000"))
                .build();
        
        Product test2 = new Product();
        test2.setCode("P-002");
        test2.setName("Product2");
        test2.setPrice(new BigDecimal("200000"));

        p.save(test2);
    }
    
    @Test
    public void testFindAll(){
        Iterable<Product> able = p.findAll();
        
        Iterator<Product> iter = able.iterator();
      
        while(iter.hasNext()){
            Product product = iter.next();
            System.out.println("Product "+product.getPrice());
        }
 
    }
   
}
