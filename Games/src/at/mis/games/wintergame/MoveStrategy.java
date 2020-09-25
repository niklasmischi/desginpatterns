package at.mis.games.wintergame;

public interface MoveStrategy {
    public float getX();
    public float getY();
    public void update(int delta);
}
