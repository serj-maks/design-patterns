package edu.serjmaks.patterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private final String name;
    private final int age;
    private final String email;
}
