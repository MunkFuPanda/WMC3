package at.ac.htlwrn.model;

import javax.persistence.*;
import java.util.Date;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date.toString();
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public String getDone_date() {
        return done_date;
    }

    public void setDone_date(String done_date) {
        this.done_date = done_date;
    }

    public String getCanceled_date() {
        return canceled_date;
    }

    public void setCanceled_date(String canceled_date) {
        this.canceled_date = canceled_date;
    }

    public Set<ProductOrder> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductOrder> products) {
        this.products = products;
    }

    public Long getId() {
        return id;
    }
}
