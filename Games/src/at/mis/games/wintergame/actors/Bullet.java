package at.mis.games.wintergame.actors;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Bullet implements Actor{
	private int x;
	private int y;
	private int width;
	private int height;
	private Shape shape;
	
	
	public Bullet(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.width = 10;
		this.height = 15;
		this.shape = new Rectangle((float)this.x, (float)this.y, this.width, this.height);
	}

	@Override
	public void render(Graphics graphics) {
		graphics.setColor(Color.orange);
		graphics.fillOval(this.x, this.y, this.width, this.height);
		graphics.setColor(Color.transparent);
		graphics.draw(shape);
		
	}

	@Override
	public void update(GameContainer gc, int delta) {
//		double angle =+ 1;
//		this.x = (int) (this.x + 100 * Math.cos((int)angle)); 
		this.y--;
		shape.setX((float) this.x);
		shape.setY((float) this.y);
	}
	
}
