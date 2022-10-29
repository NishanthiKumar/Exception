package exception_cls;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckMessage {
	public static void main(String[] args) throws IOException {
		try {
		File f=new File("C:\\Users\\Admin\\Documents\\nisha.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		}catch(FileNotFoundException fee) {
			System.out.println(fee);
		}
		System.out.println(" DB Closed");
	}

}
