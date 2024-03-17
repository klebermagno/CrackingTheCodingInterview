package com.klebermagno.code.advanced.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/items")
public class GroceryShop {

  @Autowired
  private ItemRepository itemRepository;

  @GetMapping
  public Iterable<Item> list() {
    return itemRepository.findAll();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void create(@RequestBody Item item) {
    itemRepository.save(item);
  }

  @GetMapping("/{id}")
  public Item read(@PathVariable Long id) {
    return itemRepository.findById(id).get();
  }

  @PutMapping("/{id}")
  public Item update(@PathVariable Long id, @RequestBody Item item) {
    Item itemFromDb = itemRepository.findById(id).get();
    itemFromDb.setName(item.getName());
    return itemRepository.save(itemFromDb);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    itemRepository.deleteById(id);
  } //
}
