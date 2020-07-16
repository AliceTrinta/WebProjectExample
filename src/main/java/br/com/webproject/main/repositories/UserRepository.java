package br.com.webproject.main.repositories;

import br.com.webproject.main.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
