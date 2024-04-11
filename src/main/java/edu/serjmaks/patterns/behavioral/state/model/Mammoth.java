package edu.serjmaks.patterns.behavioral.state.model;

import edu.serjmaks.patterns.behavioral.state.state.AngryState;
import edu.serjmaks.patterns.behavioral.state.state.PeacefulState;
import edu.serjmaks.patterns.behavioral.state.state.State;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
public class Mammoth {

    State state;

    public Mammoth() {
        state = new PeacefulState(this);
    }

    public void timePasses() {
        if (state.getClass().equals(PeacefulState.class)) {
            changeStateTo(new AngryState(this));
        } else {
            changeStateTo(new PeacefulState(this));
        }
    }

    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    @Override
    public String toString() {
        return "The mammoth";
    }

    public void observe() {
        this.state.observe();
    }
}
