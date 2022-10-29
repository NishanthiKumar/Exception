package exception_cls;

public class Program1 {
	public static void main(String[] args) {
		try {
		int num1=15;
		int num2=0;
		int num=num1/num2;
		System.out.println(num);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			//System.out.println("Error Occurs");
		}
		System.out.println("End of Program");
	}

}
