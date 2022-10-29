package exception_cls;

public class StringIndexProgram {
	public static void main(String[] args) {
		String name="Sasi";
		System.out.println("Length= "+name.length());
		try {
		System.out.println(name.charAt(5));
		}
		catch(StringIndexOutOfBoundsException as) {
			System.out.println(as);
			System.out.println("Check the length of the name");
	    }
		finally {
			System.out.println("hiiii");
		}
		System.out.println("End of Program");
	}

}
