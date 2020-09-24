package at.mis.games.wintergame;

import at.mis.games.wintergame.actors.Actor;
import org.newdawn.slick.*;
import at.mis.games.wintergame.actors.HTLCircle;
import at.mis.games.wintergame.actors.HTLOval;
import at.mis.games.wintergame.actors.HTLRectangle;

import java.util.ArrayList;
import java.util.List;


public class MainGame extends BasicGame {

    private List<Actor> actors;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        this.actors.add(new HTLRectangle(10,10,100,100));
        this.actors.add(new HTLOval(10,10,30,30));
        this.actors.add(new HTLCircle(10,10, 20,20));
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gameContainer, delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
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
