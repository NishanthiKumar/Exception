package exception_cls;

public class NullPointProgram {
	public static void main(String[] args) {
	try{
		String a=null;
	System.out.println(a.charAt(10));
	}catch (Exception e) {
		System.out.println(e);
	}
	System.out.println("End");
	}
}
