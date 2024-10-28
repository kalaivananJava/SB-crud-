package com.kgisl.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.crud.entity.Product;
import com.kgisl.crud.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
//post
    public Product saveProduct(Product product){

       return repository.save(product);
        
        
    }

    public List<Product> saveProducts(List<Product> product){

        return repository.saveAll(product);
         
         
     }

     //get
     public List<Product> getProducts(){
        return repository.findAll();
     }

     public Product getProductById(int id){
        return repository.findById(id).orElse(null);
     }

     public Product getProductByName(String name){
        return repository.findByName(name);
     }
    

     //delete
     public String deleteById(int id){
        repository.deleteById(id);
        return "product removed !! " +id;
     }
     //put

     public Product updateProduct(Product product){
         Product existingProduct =repository.findById(product.getId()).orElse(null);
         existingProduct.setName(product.getName());
         existingProduct.setQuantity(product.getQuantity());
         existingProduct.setPrice(product.getPrice());
         return repository.save(existingProduct);

     }
}
