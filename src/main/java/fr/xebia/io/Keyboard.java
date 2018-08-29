package fr.xebia.io;

import fr.xebia.controls.ControlService;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {

    private ControlService controlService;

    public Keyboard(ControlService controlService) {
        this.controlService = controlService;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                controlService.up();
                break;
            case KeyEvent.VK_RIGHT:
                controlService.right();
                break;
            case KeyEvent.VK_DOWN:
                controlService.down();
                break;
            case KeyEvent.VK_LEFT:
                controlService.left();
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}