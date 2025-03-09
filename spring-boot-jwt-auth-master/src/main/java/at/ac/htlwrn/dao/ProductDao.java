package at.ac.htlwrn.dao;

import at.ac.htlwrn.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductDao extends CrudRepository<Product, Long> {
    @Override
    Optional<Product> findById(Long id);
}
