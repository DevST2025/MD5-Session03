package ra.academy.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ra.academy.dto.ProductDto;
import ra.academy.exception.NotFoundException;
import ra.academy.model.Product;
import ra.academy.repository.IProductRepository;
import ra.academy.service.IProductService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final IProductRepository productRepository;
    private final UploadService uploadService;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(String id) throws NotFoundException {
        return productRepository.findById(id).orElseThrow(() -> new NotFoundException("Id not found"));
    }

    @Override
    public Product save(ProductDto productDto) {
        String imgUrl = uploadService.uploadFile(productDto.getImage());
        Product product = new Product(productDto.getId(), productDto.getName(), productDto.getPrice(), imgUrl);
        return productRepository.save(product);
    }

    @Override
    public void deleteById(String id) {
        productRepository.deleteById(id);
    }
}
