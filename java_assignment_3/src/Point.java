//Thanakorn Pasangthien Section1 6088109 
public class Point {
	private int x;
	private int y;
	public int manhattanDistance(Point other) {
		return Math.abs(other.x-this.x)+Math.abs(other.y-this.y);
	}
	public void setPoint(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
