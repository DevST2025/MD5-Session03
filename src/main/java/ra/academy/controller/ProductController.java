package ra.academy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ra.academy.dto.ProductDto;
import ra.academy.exception.NotFoundException;
import ra.academy.model.Product;
import ra.academy.service.IProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/product")
@RequiredArgsConstructor
public class ProductController {
    private final IProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable String id) throws NotFoundException {
        return productService.findById(id);
    }
    @PostMapping
    public Product add(@ModelAttribute ProductDto productDto) {
        return productService.save(productDto);
    }
    @PutMapping("/{id}")
    public Product edit(@PathVariable String id, @RequestBody ProductDto productDto) {
        productDto.setId(id);
        return productService.save(productDto);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        productService.deleteById(id);
        return "Delete Success";
    }
}
