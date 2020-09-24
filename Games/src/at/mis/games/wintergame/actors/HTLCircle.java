package at.mis.games.wintergame.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class HTLCircle implements Actor{
	private double x;
	private double y;
	private int height;
	private int width;
	private boolean circleCheck = true;
	private Shape shape;
	

	public HTLCircle(double x, double y, int height, int width) {
		super();
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.shape = new Rectangle((float)this.x, (float)this.y, this.width, this.height);
	}

	public void update(GameContainer gc, int delta) {
		if (this.circleCheck) {
			this.x++;

			if (this.x == 700) {
				this.circleCheck = false;
			}
		}

		else {
			this.x--;

			if (this.x == 0) {
				this.circleCheck = true;
			}
		}
		
		shape.setX((float) this.x);
		shape.setY((float) this.y);
	}

	public void render(Graphics graphics) {
		graphics.drawOval((int) this.x, (int) this.y, this.height, this.width);
		graphics.draw(shape);
	}
	
	public Shape getShape() {
		return this.shape;
	}
}
