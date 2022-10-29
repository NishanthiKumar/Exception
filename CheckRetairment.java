package exception_cls;

public class CheckRetairment {
	public static void main(String[] args)throws RetException {
		int age=35;
		try {
			if(age<60) {
				throw new RetException("Not Eligible");
			}else {
				System.out.println("Eligible");
			}
		}catch(RetException ae) {
			ae.printStackTrace();
		}
		System.out.println("Election closed");
	}

}

class RetException extends Exception {
	public RetException(String exe) {
		super(exe);
	}
	//public void printStackTrace() {
		//System.err.println("Not Eligibleee");
	//
//}
}
