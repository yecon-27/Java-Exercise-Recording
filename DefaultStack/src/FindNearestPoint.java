import java.util.Scanner;
public class FindNearestPoint {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();
		//create an array to store values
		double[][] points = new double[numberOfPoints][2]; 
		System.out.print("Enter " + numberOfPoints + " points: ");
		for (int i = 0; i < points.length; i++) {
			//read points
			 points[i][0] = input.nextDouble();
			 points[i][1] = input.nextDouble();
		}
		//track the point
		//p1 and p2 are the indices in the points' array
		//initialize two points
		int p1 = 0, p2 = 1;
		//initialize shortest Distance
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]); 
		//compute distance for ever two points
		for(int i = 0; i < points.length; i++) {
			for(int j = 0; j <points[i].length; j++) {
				//Find distance between two points
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]); 
				if (shortestDistance > distance) {
					p1 = i;//Update p1
					p2 = j;//Update p2
					shortestDistance = distance;
				}
			}
		}
		System.out.println("The closest two points are " + "(" + points[p1][0] + "," + points[p1][1] + ") and (" + points[p2][0] + "," + points[p2][1] +")");
	input.close();
	}//the end of the main method
	public static double distance(double x1, double x2, double y1, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}
