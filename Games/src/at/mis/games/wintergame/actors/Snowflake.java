package at.mis.games.wintergame.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Snowflake implements Actor{
	private double x;
	private double y;
	private int height;
	private int width;
	private int random;
	private int random2;
	private double speed;

	

	public Snowflake(int height, int width, double speed) {
		super();
		this.random = (int)(Math.random() * 800 + 1);
		this.random2 = (int)(-(Math.random() * 800 + 1));
		this.x = 0 + random;
		this.y = 0 + random2;
		this.height = height;
		this.width = width;
		this.speed = speed;
		
	}

	public void update(int delta) {
		this.y = this.y + 1 * this.speed;
		if (this.y == 800) {
			this.y = 0;
		}
	}

	public void render(Graphics graphics) {
			graphics.fillOval((int)this.x, (int)this.y, this.height, this.width);	
			
	}

	@Override
	public void update(GameContainer gc, int delta) {
		// TODO Auto-generated method stub
		
	}
}

