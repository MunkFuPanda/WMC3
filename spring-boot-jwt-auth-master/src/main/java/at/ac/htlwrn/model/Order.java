package at.ac.htlwrn.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "purchaseOrder")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    private String first_name;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private int total_price;

    @Column
    private String done_date;

    @Column
    private String canceled_date;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<ProductOrder> products;
}
