package exception_cls;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckMail {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Admin\\Documents\\nisha.txt");
		//File f=new File("C:\\Users\\Admin\\Documents\\nis.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		
		
	
	
	}

}
