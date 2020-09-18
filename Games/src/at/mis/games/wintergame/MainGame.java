package at.mis.games.wintergame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class MainGame extends BasicGame {
    private int x, y;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        // gezeichnet
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        // 1 mal aufgerufen
        this.x++;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        // delta = zeit seit dem letzten Aufruf
        graphics.drawRect(this.x, this.y, 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
