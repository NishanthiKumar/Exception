package exception_cls;

public class MultipleCatchProgram {
	public static void main(String[] args) {
		try {
		int[]a= {11,22,33};
		System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
		/*catch(IndexOutOfBoundsException ie) {
			System.out.println(ie);
		}*/
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("End");
	}

}
