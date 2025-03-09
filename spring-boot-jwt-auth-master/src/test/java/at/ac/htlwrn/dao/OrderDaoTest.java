package at.ac.htlwrn.dao;

import at.ac.htlwrn.model.OrderModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class OrderDaoTest {

    @Autowired
    private OrderDao orderDao;

    @Test
    public void testSaveOrder() {
        OrderModel order = new OrderModel();

        OrderModel savedOrder = orderDao.save(order);
        Assertions.assertNotNull(savedOrder.getId());
    }

    @Test
    public void testFindOrderById() {
        OrderModel order = new OrderModel();
        OrderModel savedOrder = orderDao.save(order);

        Optional<OrderModel> foundOrder = orderDao.findById(savedOrder.getId());
        Assertions.assertTrue(foundOrder.isPresent());
    }
}
