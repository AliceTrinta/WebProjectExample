package br.com.webproject.main.repositories;

import br.com.webproject.main.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
