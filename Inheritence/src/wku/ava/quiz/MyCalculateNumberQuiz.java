package wku.ava.quiz;
//Ye Cong 1306248

//Concrete superclass
public abstract class MyCalculateNumberQuiz implements CalculateNumberQuiz {

    public MyCalculateNumberQuiz() {
    }

    public abstract double modulo(double x, double y);

    public int add(int x, int y) {
    	return x + y;
    }
 
    public int subtract(int x, int y) {
    	return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public int square(int x) {
        return x * x;
    }

    public double divide(double x, double y) {
        return x / y;
    }
}