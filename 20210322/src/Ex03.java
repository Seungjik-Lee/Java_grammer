
public class Ex03 {
public static void main(String[] args) {
	Cake cakes[] = {new Cake(), new CheezeCake(), new Cake()};
	
	for(int i = 0; i < cakes.length; i++)
		cakes[i].yummy();
	
	System.out.println();
	Cake cake1 = new CheezeCake();
	cake1.yummy();
	
	System.out.println();
	CheezeCake cake2 = new CheezeCake();
	cake2.A();
	}
}

