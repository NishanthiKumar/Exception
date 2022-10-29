package exception_cls;

public class ArrayIndexProgram {
	public static void main(String[] args) {
		try {
			int[]a= {0,1,2};
			System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);
			System.out.println("They is no value in 3rd index");
		}
		System.out.println("End");
	}

}
