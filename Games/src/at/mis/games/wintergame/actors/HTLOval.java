package at.mis.games.wintergame.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class HTLOval implements Actor{
	private double x;
	private double y;
	private int height;
	private int width;
	
	public HTLOval(double x, double y, int height, int width) {
		super();
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public void update(GameContainer gc, int delta) {
		this.y++;
		if (this.y == 800) {
			this.y = 0;
		}
	}

	public void render(Graphics graphics) {
		graphics.drawOval((int)this.x, (int)this.y, this.height, this.width);
	}
}
