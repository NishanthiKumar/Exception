package exception_cls;

public class ArithmeticProgram1 {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
		int a=10;
		int b=0;
		int c=a/b;
		}catch(ArithmeticException ae) {
			System.out.println(ae);
			System.err.println("Error Occur");
		}
		//System.out.println(c);
		System.out.println("End");
	}

}
