package at.ac.htlwrn.model;

import javax.persistence.*;

@Entity
@Table(name = "product_order")
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Product product;

    @Column
    private int Quantity;
}
