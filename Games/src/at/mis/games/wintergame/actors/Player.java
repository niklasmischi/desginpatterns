package at.mis.games.wintergame.actors;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.util.Log;

public class Player implements Actor{
	private int x;
	private int y;
	private int height;
	private int width;
	private Shape shape;
	private List<Shape> collissionPartner;
	

	public Player(int height, int width) {
		super();
		this.collissionPartner = new ArrayList<>();
		this.x = 40;
		this.y = 400;
		this.height = height;
		this.width = width;
		this.shape = new Rectangle((float)this.x, (float)this.y, this.width, this.height);
	}

	@Override
	public void render(Graphics graphics) {
		graphics.setColor(Color.black);
		graphics.fillRect(this.x, this.y, this.width, this.height);
		graphics.setColor(Color.white);
		graphics.draw(this.shape);
		
	}

	@Override
	public void update(GameContainer gc, int delta) {
		// TODO Auto-generated method stub
		if (gc.getInput().isKeyDown(Input.KEY_S)) {
			y++;
		}
		
		if (gc.getInput().isKeyDown(Input.KEY_W)) {
			y--;
		}
		
		for (Shape s : collissionPartner) {
			
			if (s.intersects(this.shape)) {
				System.out.println("Bum Bum Unfall!!!");
			}
		}
		
		shape.setX((float) this.x);
		shape.setY((float) this.y);
	}
	
	public void addPartner(Shape shape) {
		this.collissionPartner.add(shape);
	}
	
	public Shape getShape() {
		return shape;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
