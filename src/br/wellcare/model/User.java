package br.wellcare.model;

import br.wellcare.model.enums.UserType;

public class User {
    private int id;
    private String name;
    private int age;
    private UserType type;

    public User(int id, String name, int age, UserType type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public UserType getType() { return type; }

    @Override
    public String toString() {
        return "User { id=" + id + ", name='" + name + "', age=" + age + ", type=" + type + " }";
    }
}
