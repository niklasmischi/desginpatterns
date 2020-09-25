package at.mis.games.wintergame;

import at.mis.games.wintergame.actors.Actor;
import org.newdawn.slick.*;
import at.mis.games.wintergame.actors.HTLCircle;
import at.mis.games.wintergame.actors.HTLOval;

import java.util.ArrayList;
import java.util.List;


public class MainGame extends BasicGame {

    private List<Actor> actors;
    private HTLRectangle r1;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        MoveStrategy mr1 = new MoveRight(0,0,0.3f);
        MoveStrategy ml1 = new MoveLeft(500,0,0.1f);

        HTLCircle c1 = new HTLCircle(mr1);
        HTLCircle c2 = new HTLCircle(ml1);
        HTLRectangle r1 = new HTLRectangle(ml1);

        this.actors.add(new HTLOval(10,10,30,30));
        this.actors.add(c1);
        this.actors.add(c2);
        this.actors.add(r1);
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
