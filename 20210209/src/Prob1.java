class Triangle {
	int �غ�;
	int ����; 

	public Triangle(){
		�غ� = 10;
		���� = 10;
	}
	
	public Triangle(int �غ�1, int ����1) {
		�غ� = �غ�1;
		���� = ����1;
	}
	
	public void setHeight(int �غ�2){
		�غ� = �غ�2;
	}
	
	public int Result(){
		return (�غ�*����)/2;
	}
}
public class Prob1 {
public static void main(String[] args) {
	Triangle a1 = new Triangle(10, 10);
	Triangle a2 = new Triangle();
	a1.setHeight(20);
	
	System.out.println("��� = "+a1.Result());
	System.out.println("��� = "+a2.Result());
}
}
