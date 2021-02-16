import aa.bb.cc.Triangle;

public class Ex02 {
	public static void main(String[] args) {
		Triangle tri = new Triangle();

		double area = tri.getArea();
		System.out.println("area = " + area);

		tri.setXY(3, 2);
		area = tri.getArea();
		System.out.println("area = " + area);
	}
}
