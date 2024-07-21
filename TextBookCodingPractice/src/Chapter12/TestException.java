package Chapter12;

public class TestException {

	public static void main(String[] args) {
//try-catch在循环内部执行: 单独的 try-catch 块：在每次循环迭代中，除以零的操作都被包裹在一个独立的 try-catch 块中。这意味着每次循环都会尝试执行除法，如果抛出异常，异常会被 catch 块捕获，但循环会继续执行。
//输出：由于 try 块中的 System.out.println 是在新的一行上打印，所以每次循环都会打印出当前的 i 值，然后因为异常被捕获而结束当前迭代，继续下一次循环迭代。
		for (int i = 0; i < 2; i++) {
			 System.out.print(i + " ");
			 try {
			 System.out.println(1 / 0);
			 }
			 catch (Exception ex) {
			 }
		}
		System.out.println();
//try block is on the outside of for loop
//组合的 try-catch 块：这里，整个 for 循环都被包裹在一个单一的 try 块中，随后跟着一个 catch 块。这意味着只有当循环完成后如果没有异常抛出，catch 块才会被跳过。如果在循环体内的任何一次迭代中抛出异常，catch 块将捕获异常，并且循环会立即终止，不会执行循环内剩余的迭代。
//输出影响：由于异常被捕获，循环体内的打印语句只会执行一次。在第一次迭代中，打印出 i 的值后，执行除以零操作会抛出异常，异常被 catch 块捕获，循环随即终止，因此第二次迭代不会被执行。
		try {
			 for (int i = 0; i < 2; i++) {
			 System.out.print(i + " ");
			 System.out.println(1 / 0);
			 }
			 }
			 catch (Exception ex) {
			 }
	}
}