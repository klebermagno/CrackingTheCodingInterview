package com.klebermagno.code.advanced.spring;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Basket {

  @Id
  @GeneratedValue
  private Long id;

  @OneToMany(mappedBy = "basket")
  private List<Item> items;

  public Basket() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }
}
