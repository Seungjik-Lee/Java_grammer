class Triangle {
	int πÿ∫Ø;
	int ≥Ù¿Ã; 

	public Triangle(){
		πÿ∫Ø = 10;
		≥Ù¿Ã = 10;
	}
	
	public Triangle(int πÿ∫Ø1, int ≥Ù¿Ã1) {
		πÿ∫Ø = πÿ∫Ø1;
		≥Ù¿Ã = ≥Ù¿Ã1;
	}
	
	public void setHeight(int πÿ∫Ø2){
		πÿ∫Ø = πÿ∫Ø2;
	}
	
	public int Result(){
		return (πÿ∫Ø*≥Ù¿Ã)/2;
	}
}
public class Prob1 {
public static void main(String[] args) {
	Triangle a1 = new Triangle(10, 10);
	Triangle a2 = new Triangle();
	a1.setHeight(20);
	
	System.out.println("∞·∞˙ = "+a1.Result());
	System.out.println("∞·∞˙ = "+a2.Result());
}
}
