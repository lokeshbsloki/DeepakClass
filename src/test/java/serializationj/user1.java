package serializationj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class user1 {

	public static void main(String[] args) throws Exception {

		CandyCrush user=new CandyCrush("lokesh", 200, 20001, 2);
		
		OutputStream fis = new FileOutputStream(".//backup.ser");
		
		ObjectOutputStream out = new ObjectOutputStream(fis);
		
		out.writeObject(user);
		System.out.println("done");
		
	}

}
