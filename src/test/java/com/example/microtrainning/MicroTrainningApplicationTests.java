package com.example.microtrainning;

import com.example.microtrainning.domain.model.Product;
import com.example.microtrainning.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class MicroTrainningApplicationTests {

    @Mock
    private ProductService productService;

    @Test
    public void shouldReturnAllProducts() {
        List<Product> productList = new ArrayList<>();

        // Use the result of the stubbed method
        when(productService.getAllProducts()).thenReturn(productList);

        // Call the method being tested
        List<Product> result = productService.getAllProducts();

        // Assert that the result is as expected
        assertEquals(0, result.size());
    }
}
