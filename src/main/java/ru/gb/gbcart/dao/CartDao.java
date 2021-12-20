package ru.gb.gbcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.gbcart.model.Cart;

public interface CartDao  extends JpaRepository<Cart, Long> {
}
