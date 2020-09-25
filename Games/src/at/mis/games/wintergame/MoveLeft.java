package at.mis.games.wintergame;

public class MoveLeft implements MoveStrategy{
    private float x,y,speed;

    public MoveLeft(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(int delta) {
        this.x -= delta * this.speed;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
