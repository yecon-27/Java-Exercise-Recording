package wku.ava.inheritence;

public class TestOverriding {
		 public static void main(String[] args) {
		 A a = new A();
		 a.p(10);
		 a.p(10.0);
		 }
		}

		class B {
			public B() {}
		 public void p(double i) {
		 System.out.println(i * 2);
		 }
		}

		class A extends B {
		 // This method overrides the method in B 
			public A() {}
			public void p(double i) {
		 System.out.println(i);
		 }
	}

