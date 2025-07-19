package edu.serjmaks.patterns.creational.builder;

public class UserBuilder {
    private String name;
    private int age;
    private String email;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public User build() {
        if (name == null || age <= 0) {
            throw new IllegalStateException("Name and Age are required");
        }
        return new User(name, age, email);
    }
}
