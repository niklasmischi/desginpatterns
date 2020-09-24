package at.mis.games.wintergame.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class HTLRectangle implements Actor{
	private double x;
	private double y;
	private int height;
	private int width;
	private double angle;
	
	
	
	public HTLRectangle(double x, double y, int height, int width) {
		super();
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public void update(GameContainer gc, int delta) {
		this.angle += 0.01;
		this.x = (double)350 + 100 * Math.sin(angle);
		this.y = (double)350 + 100 * Math.cos(angle);
	}
	
	public void render(Graphics graphics) {
		graphics.drawRect((int)this.x, (int)this.y, this.height, this.width);
	}
}
