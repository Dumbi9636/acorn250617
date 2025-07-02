package test.game;

public class Monster {
    private int x;
    private int y;
    private boolean isRemove;

    public Monster(int x, int y) {
        this.x = x;
        this.y = y;
        this.isRemove = false;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public boolean isRemove() { return isRemove; }
    public void setRemove(boolean isRemove) { this.isRemove = isRemove; }
}

