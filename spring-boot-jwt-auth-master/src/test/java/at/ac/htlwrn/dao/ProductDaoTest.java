package at.ac.htlwrn.dao;

import at.ac.htlwrn.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class ProductDaoTest {

    @Autowired
    private ProductDao productDao;

    @Test
    public void testSaveProduct() {
        Product product = new Product();

        Product savedProduct = productDao.save(product);
        Assertions.assertNotNull(savedProduct.getId());
    }

    @Test
    public void testFindProductById() {
        Product product = new Product();
        Product savedProduct = productDao.save(product);

        Product foundProduct = productDao.findById(savedProduct.getId()).orElse(null);
        Assertions.assertNotNull(foundProduct);
    }
}
