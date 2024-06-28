package com.example.jazzy_kart.service;

import com.example.jazzy_kart.impl.IProductService;
import com.example.jazzy_kart.model.Product;
import com.example.jazzy_kart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class ProductService implements IProductService {
    //    private final ProductRepository productRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }


    @Override
    public Product updateProduct(Long id, Product productDetails) {
        return productRepository.findById(id)
                .map(product -> {
                    product.setProductName(productDetails.getProductName());
                    product.setDescription(productDetails.getDescription());
                    product.setQuantity(productDetails.getQuantity());
                    product.setCategory(productDetails.getCategory());
                    product.setProductPrice(productDetails.getProductPrice());
                    product.setDiscount(productDetails.getDiscount());
                    product.setSpecialPrice(productDetails.getSpecialPrice());

//                    product.setOrders(productDetails.getOrders());
                    // Add any other fields that need to be updated
                    return productRepository.save(product);
                })
                .orElse(null);
//        Product product = productRepository.findById(id).orElse(null);
//                    product.setProductName(productDetails.getProductName());
//                    product.setProductPrice(productDetails.getProductPrice());
//                    product.setProductDescription(productDetails.getProductDescription());
//                    product.setCategory(productDetails.getCategory());
//                    return productRepository.save(product);
    }



    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
