package at.ac.htlwrn.dao;

import at.ac.htlwrn.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Interface for Data Access Object Layer (DAO-Layer).
 * Implementation is done by Spring Data!
 * CrudRepository<Product,Long> because Product is the entity and Long is the primary key of Product
 */
@Repository
public interface ProductDao extends CrudRepository<User, Long> {
}
