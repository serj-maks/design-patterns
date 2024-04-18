package edu.serjmaks.patterns.structural.adapter;

import edu.serjmaks.patterns.structural.adapter.wilddog.AfricanWildDog;
import edu.serjmaks.patterns.structural.adapter.wilddog.WildDog;

public class Demo {
    public static void main(String[] args) {
        WildDog africanWildDog = new AfricanWildDog();
        WildDogAdapter adapter = new WildDogAdapter(africanWildDog);

        Hunter hunter = new Hunter();
        hunter.startHunt(adapter);
    }
}
