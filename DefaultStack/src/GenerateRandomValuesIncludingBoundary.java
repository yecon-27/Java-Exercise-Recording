
public class GenerateRandomValuesIncludingBoundary {

	public static void main(String[] args) {
		double i = getRandomNum(1,100);
		System.out.println(i);}
	
		public static double getRandomNum(int min, int max) {
			double minValue = Math.ceil(min);
			double maxValue = Math.floor(max);
			//我们将这个随机数乘以 `(max - min + 1)`，这样就可以得到一个介于 0 到 `(max - min + 1)` 之间的随机数。
			//然后，我们通过 `Math.floor()` 将这个随机数向下取整到最近的整数。
			//最后，我们将 `min` 加到结果中，以便将其偏移到正确的范围。
			return Math.floor(Math.random() * (maxValue - minValue + 1) + min); //The maximum is inclusive and the minimum is inclusive 
	}
	}
