package br.wellcare.repository;

import br.wellcare.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void save(User u) { users.add(u); }
    public List<User> findAll() { return users; }

    public User findById(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }
}
