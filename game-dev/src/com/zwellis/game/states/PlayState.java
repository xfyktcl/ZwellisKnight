package com.zwellis.game.states;

import com.zwellis.game.entity.Player;
import com.zwellis.game.graphics.Font;
import com.zwellis.game.graphics.Sprite;
import com.zwellis.game.util.KeyHandler;
import com.zwellis.game.util.MouseHandler;
import com.zwellis.game.util.Vector2f;

import java.awt.*;

public class PlayState extends GameState {

    private Font font;
    private Player player;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        font = new Font("font/ZeldaFont.png", 16, 16);
        player = new Player(new Sprite("entity/linkformatted.png"), new Vector2f(100, 100), 32);
    }

    public void update() {
       player.update();

    }
    public void input(MouseHandler mouse, KeyHandler key) {
        player.input(mouse, key);

    }
    public void render(Graphics2D g) {

        Sprite.drawArray(g, font, "YOURMOM", new Vector2f(100, 100), 32, 32, 16, 0);
        player.render(g);
    }
}
