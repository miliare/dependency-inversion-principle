package fr.xebia.controls;

import fr.xebia.model.mower.Mower;

public class MowerControls implements ControlService {

    private final Mower mower;

    public MowerControls(Mower mower) {
        this.mower = mower;
    }

    @Override
    public void up() {
        mower.advance();
    }

    @Override
    public void down() {
        throw new UnsupportedOperationException("Mower can't move backwards !");
    }

    @Override
    public void right() {
        mower.turnRight();
    }

    @Override
    public void left() {
        mower.turnLeft();
    }
}
