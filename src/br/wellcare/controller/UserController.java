package br.wellcare.controller;

import br.wellcare.model.User;
import br.wellcare.model.enums.UserType;
import br.wellcare.service.UserService;

import java.util.List;

public class UserController {

    private final UserService userService = new UserService();

    public User createUser(String name, int age, UserType type) {
        return userService.createUser(name, age, type);
    }

    public List<User> listUsers() {
        return userService.findAll();
    }

    public User findUserById(int id) {
        return userService.findById(id);
    }

    public void deleteUser(int id) {
        userService.deleteUser(id);
    }

    public void printAllUsers() {
        userService.findAll().forEach(System.out::println);
    }
}
