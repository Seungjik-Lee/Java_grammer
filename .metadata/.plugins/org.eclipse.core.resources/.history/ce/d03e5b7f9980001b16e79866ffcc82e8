import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	/*
	 * 1. 학생등록 2. 학생조회
	 * 
	 * 3. 학생수정 4. 학생삭제 5. 학생 파일로 저장
	 */

	public static Student inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름은? ");
		String name = scan.nextLine();
		System.out.println("성별은? ");
		String gender = scan.nextLine();
		System.out.println("나이?");
		int age = scan.nextInt();
		Student stu = new Student(name, gender, age);
		return stu;
	}

	public static void main(String[] args) throws Exception {
		
		Student[] student = new Student[50];
		
		File file = fopen("a.txt","wt");
		
		FileInputStream fis = new FileInputStream(new File("a"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student);
		
		OutputStreamWriter ow = new OutputStreamWriter(fos);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1. 학생등록 2. 학생조회 3. 학생수정 4. 학생삭제");
			int select = scan.nextInt();
			System.out.println("select = " + select);
			if (select == 1) {
				// 학생등록
				Student stu = inputStudent();
				for (int i = 0; i < student.length; i++)
					if (student[i] == null) {
						student[i] = new Student(name, gender, age);
						break;
					}
			} else if (select == 2) {
				// 학생 조회
				System.out.println("===학생조회===");
				for (int i = 0; i < student.length; i++) {
					System.out.println(i + " = " + student[i]);
					if (student[i] != null)
						student[i].print();
				}
				System.out.println("============");
			} else if (select == 3) {
				// 학생 수정
				System.out.println("수정하고 싶은 번호 입력 : ");
				int num = scan.nextInt();

				Student stu = inputStudent();

				student[num] = new Student(name, gender, age);
				System.out.println("수정 되었습니다.");
			} else if (select == 4) {
				// 학생 삭제
				System.out.println("삭제하고 싶은 학생 번호 입력 : ");
				int num = scan.nextInt();
				student[num] = null;
				System.out.println("삭제 되었습니다.");
			} else {
				System.out.println("종료됩니다.");
				break;
			}
		}
	}
}
