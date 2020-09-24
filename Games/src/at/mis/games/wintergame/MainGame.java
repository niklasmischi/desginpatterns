package at.mis.games.wintergame;

import org.newdawn.slick.*;
import at.mis.games.wintergame.actors.HTLCircle;
import at.mis.games.wintergame.actors.HTLOval;
import at.mis.games.wintergame.actors.HTLRectangle;


public class MainGame extends BasicGame {

    public HTLRectangle rect1;
    public HTLOval oval1;
    public HTLCircle circle1;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rect1 = new HTLRectangle(10,10,100,100);
        this.oval1 = new HTLOval(10,10,30,30);
        this.circle1 = new HTLCircle(10,10, 20,20);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        rect1.update(gameContainer, delta);
        oval1.update(gameContainer, delta);
        circle1.update(gameContainer, delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        rect1.render(graphics);
        oval1.render(graphics);
        circle1.render(graphics);
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
