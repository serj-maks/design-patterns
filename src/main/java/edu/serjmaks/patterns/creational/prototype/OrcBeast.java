package edu.serjmaks.patterns.creational.prototype;


import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
public class OrcBeast extends Beast {

    String helpType;

    public OrcBeast(String helpType) {
        this.helpType = helpType;
    }

    @Override
    public String toString() {
        return "orcish eagle helps in " + helpType;
    }
}
