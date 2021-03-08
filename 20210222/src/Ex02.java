class A{}

public class Ex02 {
	public static void main(String[] args) {
		// 개발자가 할일이 줄었지만.
		// 커파일러가 할일이 늘어나서
		
		// 대규모 프로젝트시에....
		// 컴파일러 부하가 늘어나서 속도가 느리다..
		
		// 개발자가 힙영역에.. free  안해줘도 되니깐
		// 메모리 관리가 좀 더 낫다...
		A a = new A();
		
	}
}
