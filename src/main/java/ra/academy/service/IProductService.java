package ra.academy.service;

import ra.academy.dto.ProductDto;
import ra.academy.exception.NotFoundException;
import ra.academy.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(String id) throws NotFoundException;
    Product save(ProductDto productDto);
    void deleteById(String id);

}
