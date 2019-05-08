package May;

public class Student {
	private String name;
	private int score;
	
	void setStudent(String inputName, int inputScore) {
		this.name = inputName;
		this.score = inputScore;
	}
	
	String getName() {
		return this.name;
	}
	
	int getScore() {
		return this.score;
	}
}
