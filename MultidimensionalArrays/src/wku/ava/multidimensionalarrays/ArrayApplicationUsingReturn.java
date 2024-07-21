package wku.ava.multidimensionalarrays;

public class ArrayApplicationUsingReturn {
	//Ye Cong 1306248
	public static void Main(String[] args) {
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		for(int i = 0; i < answers.length; i++) {
			int correctCount = countCorrectAnswers(answers[i], keys);
			System.out.println("Student " + i + "'s correct count is " + correctCount);	
		}
	}
		public static int countCorrectAnswers(char[]studentAnswers, char[]keys){
			int correctCount = 0;
			for(int j = 0; j < studentAnswers.length; j++) {
				if(studentAnswers[j] == keys[j])
					correctCount++;
		}
			return correctCount;
		}	
}
