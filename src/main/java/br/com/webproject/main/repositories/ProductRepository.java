package br.com.webproject.main.repositories;

import br.com.webproject.main.entities.Category;
import br.com.webproject.main.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
