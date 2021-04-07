package com.zwellis.game.states;

import java.awt.Graphics2D;

import com.zwellis.game.util.KeyHandler;
import com.zwellis.game.util.MouseHandler;

public abstract class GameState {
    protected GameStateManager gsm;

    public GameState(GameStateManager gsm) {
            this.gsm = gsm;
        }


    public abstract void update();
    public abstract void input(MouseHandler mouse, KeyHandler key);
    public abstract void render(Graphics2D g);
}
