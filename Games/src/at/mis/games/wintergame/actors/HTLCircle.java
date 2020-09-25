package at.mis.games.wintergame.actors;

import at.mis.games.wintergame.MoveRight;
import at.mis.games.wintergame.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class HTLCircle implements Actor{
	private MoveStrategy moveStrategy;
	private int height;
	private int width;
	private boolean circleCheck = true;
	private Shape shape;
	

	public HTLCircle(MoveStrategy moveStrategy) {
		super();
		this.moveStrategy = moveStrategy;
	}

	public void update(GameContainer gc, int delta) {
		moveStrategy.update(delta);
	}

	public void render(Graphics graphics) {
		graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 50, 50);
	}
	
	public Shape getShape() {
		return this.shape;
	}


}

