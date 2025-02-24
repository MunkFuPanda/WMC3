package at.ac.htlwrn.dao;

import at.ac.htlwrn.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Interface for Data Access Object Layer (DAO-Layer).
 * Implementation is done by Spring Data!
 * CrudRepository<Order,Long> because User is the entity and Long is the primary key of User
 */
@Repository
public interface OrderDao extends CrudRepository<Order, Long> {
}
