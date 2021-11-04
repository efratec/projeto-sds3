package com.devsuperior.dsvendas.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_sellers")
public class Seller implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "seller")
    private List<Sale> sales = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Sale> getSales() {
        return sales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id) && Objects.equals(name, seller.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
