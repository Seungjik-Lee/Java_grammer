public class Point {
	public int xpos;
	public int ypos;
	// alt+ shift + s -> o
	public Point(int xpos, int ypos) {
		super();
		this.xpos = xpos;
		this.ypos = ypos;
	}
	// alt + shift + s -> s
	@Override
	public String toString() {
		return "Point [xpos=" + xpos + ", ypos=" + ypos + "]";
	}
}
