package assignment;

import java.io.FileReader;
import java.io.IOException;

public class Quest3 {

	public static void main(String[] args) {
		try {
			int i;
			FileReader fr=new FileReader("D:example2.txt");
			while((i=fr.read())!=-1) {
				System.out.print((char) i);
			}
			fr.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
