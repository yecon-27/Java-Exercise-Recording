package week12;
//Ye Cong 1306248
public class ExcptionInstanceMethodTest {
	public static void main(String[] args) {
		try {
			//Non-variable array:have the memory, but no address
			System.out.println(sum(new int[] {1, 2, 3, 4, 5}));//main method execution
		}
		catch (Exception ex){
			ex.printStackTrace();
			System.out.println("\n" + ex.getMessage());//Index 5 out of bounds for length 5
			System.out.println("\n" + ex.toString());//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
			System.out.println("\nTrace Info Obtained from getStackTrace");
			StackTraceElement[] traceElements = ex.getStackTrace();
			
			for (int i = 0; i < traceElements.length; i++) {
				System.out.print("method " + traceElements[i].getMethodName());//sum--main
				System.out.print("(" + traceElements[i].getClassName() + ":");//week12.ExceptionInstanceMethodTest--week12.ExceptionInstanceMethodTest
				System.out.println(traceElements[i].getLineNumber() + ")" );//26--7
			}
			}
		}
		private static int sum(int[] list) {
			int result = 0;
			for (int i= 0; i <= list.length; i++) {
				result += list[i];//result
			}
			return result;
	}
}
