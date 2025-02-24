package at.ac.htlwrn.dao;

import at.ac.htlwrn.model.Order;
import at.ac.htlwrn.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.Optional;

@DataJpaTest
public class OrderDaoTest {

    @Autowired
    private OrderDao orderDao;

    private Order saveOrder(String title, String name, String address, Date date, int total_price) {
        Order order = new Order();
        order.setTitle(title);
        order.setName(name);
        order.setAddress(address);
        order.setDate(date);
        order.setTotal_price(total_price);

        //Framework generates user id on save
        return orderDao.save(order);
    }

    @Test
    public void testFindById() {
        String name = "name1";
        Order order = saveOrder("title1", name, "address1", new Date(), 10);
        Long id = order.getId();
        Optional<Order> foundOrderOpt = orderDao.findById(id);
        Assertions.assertTrue(foundOrderOpt.isPresent());
        Order foundOrder = foundOrderOpt.get();
        Assertions.assertEquals(name, foundOrder.getName());
    }

/*
    @Test
    public void testDeleteUser() {
        String username = "user2";
        String firstname = "firstname2";

        saveUser(username, firstname);

        Optional<User> user = userDao.findByUsername(username);
        Assertions.assertTrue(user.isPresent());

        userDao.delete(user.get());

        user = userDao.findByUsername(username);
        Assertions.assertFalse(user.isPresent());
    }
*/
}
