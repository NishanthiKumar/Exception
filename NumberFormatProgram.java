package exception_cls;

public class NumberFormatProgram {
	public static void main(String[] args) {
		try {
		String word=args[0];
		int ans=Integer.parseInt(word);
		System.out.println(ans);
		}catch(NumberFormatException ne) {
			System.out.println(ne);
			System.out.println("Error");
		}
		System.out.println("End");
	}

}
