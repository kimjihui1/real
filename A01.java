package May;

import java.util.ArrayList;
import java.util.Scanner;

public class A01 {
	//학생 배열 리스트 선언 
	static ArrayList<Student> studentList = new ArrayList<Student>();
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// 이름 입력받기 
		String inputName;
		// 점수 입력받기
		int inputScore;
		
		// 메뉴 계속 출력하기 
		while(true) {
			System.out.println("======Select Menu=======");
			System.out.println("1.성적 입력");
			System.out.println("2.성적 석차");
			System.out.println("3.성적 출력");
			System.out.println("4.종료");
			System.out.println("선택 : ");
			
			// 입력받은값 임시 저장 (if 문에 사용)
			int temp = scan.nextInt();
			
			if(temp == 1) {
				System.out.println("이름을 입력하세요 : ");
				inputName = scan.next();
				System.out.println("점수를 입력하세요 : ");
				inputScore = scan.nextInt();
				
				// 학생정보를 저장할 클래스 선언
				Student student = new Student();
			    // 학생 정보 저장 
				student.setStudent(inputName, inputScore);
				
				// 학생 정보를 학생 배열 리스트에 추가 
				studentList.add(student);
				System.out.println("저장되었습니다.");
				
			} else if(temp == 2) {
				
				System.out.println("이름을 입력하세요 : ");
				inputName = scan.next();
				
				Student student = new Student();
				
				// 입력받은 학생정보 찾
				for(int i = 0; i < studentList.size(); i++) {
					// equals 입력받은값과 배열리스트에 있는 값 비교
					if(studentList.get(i).getName().equals(inputName)) {
						student = studentList.get(i);
						break;
					}
				}
				
				int rank = 1;
				for(int i = 0; i < studentList.size(); i++) {
					if(!studentList.get(i).getName().equals(student.getName())) {
						if(studentList.get(i).getScore() > student.getScore()) {
							rank++;
						}
					}
				}
				
				System.out.println(student.getName()+"님의 석차는 "+(rank == studentList.size() ? "꼴등 입니다" : rank + "등 입니다."));
				
			} else if(temp == 3) {
				System.out.println("이름을 입력하세요 : ");
				inputName = scan.next();
				
				Student student = new Student();
				for(int i = 0; i < studentList.size(); i++) {
					if(studentList.get(i).getName().equals(inputName)) {
						student = studentList.get(i);
						break;
					}
				}
				for(int i = 0; i < studentList.size(); i++) {
					if(studentList.get(i).getName().equals(inputName)) {
						student = studentList.get(i);
						break;
					}
				}
				System.out.println(student.getName()+"님의 성적은 "+student.getScore()+"점 입니다.");
			} else {
				break;
			}
		}
		
	}
}
