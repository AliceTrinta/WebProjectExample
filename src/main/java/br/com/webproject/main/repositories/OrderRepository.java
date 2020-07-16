package br.com.webproject.main.repositories;

import br.com.webproject.main.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
