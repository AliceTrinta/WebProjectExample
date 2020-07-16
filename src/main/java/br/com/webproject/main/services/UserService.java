package br.com.webproject.main.services;

import br.com.webproject.main.entities.User;
import br.com.webproject.main.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository user;

    public List<User> findAll(){
        return user.findAll();
    }
    public User findById(Long id){
        Optional<User> obj =  user.findById(id);
        return obj.get();
    }
}
