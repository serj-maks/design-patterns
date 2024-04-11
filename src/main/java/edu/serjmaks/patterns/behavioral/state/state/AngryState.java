package edu.serjmaks.patterns.behavioral.state.state;

import edu.serjmaks.patterns.behavioral.state.model.Mammoth;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
public class AngryState implements State {
    Mammoth mammoth;

    @Override
    public void onEnterState() {
        System.out.println(mammoth + " gets angry!");
    }

    @Override
    public void observe() {
        System.out.println(mammoth + " is furious!");
    }
}
