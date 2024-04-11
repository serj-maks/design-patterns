package edu.serjmaks.patterns.behavioral.state.state;

import edu.serjmaks.patterns.behavioral.state.model.Mammoth;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
public class PeacefulState implements State {
    Mammoth mammoth;

    @Override
    public void onEnterState() {
        System.out.println(mammoth + " calms down");
    }

    @Override
    public void observe() {
        System.out.println(mammoth + " calm and peaceful");
    }
}
