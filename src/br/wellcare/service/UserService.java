package br.wellcare.service;

import br.wellcare.model.User;
import br.wellcare.model.enums.UserType;
import br.wellcare.repository.UserRepository;
import br.wellcare.util.IdGenerator;

public class UserService {

    private UserRepository repo = new UserRepository();

    public User createUser(String name, int age, UserType type) {
        User u = new User(IdGenerator.generate(), name, age, type);
        repo.save(u);
        return u;
    }
}
