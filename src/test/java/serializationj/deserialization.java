package serializationj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialization {

	public static void main(String[] args) throws Exception, Throwable {

		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("./backup.ser"));
		
		 CandyCrush user = (CandyCrush)in.readObject();
		 
		 System.out.println(user.name);
		 System.out.println(user.level);
		 System.out.println(user.score);
		 System.out.println(user.life);
	 
	}

}
