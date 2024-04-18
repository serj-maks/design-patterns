package edu.serjmaks.patterns.creational.singleton;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class ClassicSingleton {
    static ClassicSingleton INSTANCE;
    String info = "classic singleton initial class info";

    public static ClassicSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassicSingleton();
        }
        return INSTANCE;
    }
}
