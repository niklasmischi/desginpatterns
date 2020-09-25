package at.mis.games.wintergame;

import at.mis.games.wintergame.actors.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Shape;

public class HTLRectangle implements Actor {
	private MoveStrategy moveStrategy;

	public HTLRectangle(MoveStrategy moveStrategy) {
		super();
		this.moveStrategy = moveStrategy;
	}

	public void update(GameContainer gc, int delta) {
		moveStrategy.update(delta);
	}

	public void render(Graphics graphics) {
		graphics.drawRect(this.moveStrategy.getX(), this.moveStrategy.getY(), 100, 50);
	}

}

