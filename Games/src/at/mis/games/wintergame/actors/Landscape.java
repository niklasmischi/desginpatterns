package at.mis.games.wintergame.actors;

import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Landscape extends BasicGame {
	private ArrayList<Actor> actors;
	private Player player1;
	

	public Landscape() {
		super("Landscape");
	}

	@Override
	public void render(GameContainer gc, Graphics graphics) throws SlickException {
		graphics.setBackground(Color.blue);
		for (Actor actor : this.actors) {
			actor.render(graphics);
		}
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		this.actors = new ArrayList<>();
//		this.actors.add(new HTLRectangle(300,300,100,100));
//		this.actors.add(new HTLOval(700,0,100,50));
//		this.actors.add(new HTLCircle(0,0,100,100));
//		for (int iS = 1; iS<51; iS++) {
//			this.actors.add(new Snowflake(10, 10, 0.2));
//		}
//		
//		for (int iM = 1; iM<51; iM++) {
//			this.actors.add(new Snowflake(20,20,0.5));
//		}
//		
//		for (int iL = 1; iL<51; iL++) {
//			this.actors.add(new Snowflake(30,30,0.7));
//		}
		this.player1 = new Player(20,20);
		this.actors.add(player1);
		
		HTLCircle c1 = new HTLCircle(0, 0, 50, 50);
		this.actors.add(c1);	
		player1.addPartner(c1.getShape());
		
	
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		for (Actor actor : this.actors) {
			actor.update(gc, delta); 
		}
	}
	
	public void keyPressed(int key, char c) {
		// TODO Auto-generated method stub
		super.keyPressed(key, c);
		if (key==Input.KEY_SPACE) {
			Actor bullet = new Bullet(this.player1.getX() + 2, this.player1.getY() + 7);
			this.actors.add(bullet);
		}
	}

	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new Landscape());
			container.setDisplayMode(800, 800, false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
