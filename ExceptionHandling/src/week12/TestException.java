package week12;

public class TestException  {
	  public static void main(String[] args) {
	    try {
	      System.out.println(sum(new int[] {1, 2, 3, 4, 5}));
	    }
	    catch (Exception ex) {
	      //The first part
	      ex.printStackTrace();
	      //The second part
	      System.out.println("\n" + ex.getMessage());
	      //The third part
	      System.out.println("\n" + ex.toString());

	      System.out.println("\nTrace Info Obtained from getStackTrace");
	      //getStackTrace():Returns an array of stack trace elements representing the stack trace pertaining to this exception object
	      StackTraceElement[] traceElements = ex.getStackTrace();
	      for (int i = 0; i < traceElements.length; i++) {
	      //
	        System.out.print("method " + traceElements[i].getMethodName());
	        System.out.print("(" + traceElements[i].getClassName() + ":");
	        System.out.println(traceElements[i].getLineNumber() + ")");
	      }
	    }
	  }

	  private static int sum(int[] list) {
	    int result = 0;
	    //Cause an Runtime Exception
	    for (int i = 0; i <= list.length; i++)
	      result += list[i];
	    return result;
	  
	}
}
