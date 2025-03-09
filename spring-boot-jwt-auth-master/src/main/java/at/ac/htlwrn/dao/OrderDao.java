package at.ac.htlwrn.dao;

import at.ac.htlwrn.model.OrderModel;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface OrderDao extends CrudRepository<OrderModel, Long> {
    @Override
    Optional<OrderModel> findById(Long id);
}
