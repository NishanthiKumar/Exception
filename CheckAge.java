package exception_cls;

public class CheckAge {
	public static void main(String[] args) throws AgeException{
		int age=12;
		try {
		if(age<18) {
			throw new AgeException("Not Eligible");
		}else {
			System.out.println("Eligible");
		}}catch(AgeException e) {
			e.printStackTrace();
			//System.out.println(e);
		}
		System.out.println("Election closed");      
	}

}

class AgeException extends Exception {
	public AgeException(String exe) {
		super(exe);
	}
	public void printStackTrace() {
		System.out.println("Not Eligible");
	}
}
