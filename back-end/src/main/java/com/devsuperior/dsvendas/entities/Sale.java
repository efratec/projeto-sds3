package com.devsuperior.dsvendas.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_sales")
public class Sale implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer visited;
    private Integer deals;
    private BigDecimal amount;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    public Sale() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Objects.equals(id, sale.id) && Objects.equals(visited, sale.visited) && Objects.equals(deals, sale.deals) && Objects.equals(amount, sale.amount) && Objects.equals(date, sale.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, visited, deals, amount, date);
    }

}
