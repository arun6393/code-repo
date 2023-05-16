package creational;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonExecutor {
	

	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		
		System.out.println(Runtime.getRuntime().maxMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		
		final SingletonPatternUsingDoubleLocking instance=SingletonPatternUsingDoubleLocking.getInstance();
		System.out.println(instance.hashCode());
		System.out.println(instance.hashCode());
		
		try(ObjectInput objectInput=new ObjectInputStream(new FileInputStream("file.text"))){
			final SingletonPatternUsingDoubleLocking deSerialInstance=(SingletonPatternUsingDoubleLocking) objectInput.readObject();
			System.out.println(deSerialInstance.hashCode());
			System.out.println(deSerialInstance.getName());
			System.out.println(deSerialInstance.getSurName());
			
			System.out.println(deSerialInstance.clone().hashCode());
			
		}
		
		
		
		
		
		try(ObjectOutput objectOutput=new ObjectOutputStream(new FileOutputStream("file.text"))){
			objectOutput.writeObject(instance);
		}
		
		
		try(ObjectInput objectInput=new ObjectInputStream(new FileInputStream("file.text"))){
			final SingletonPatternUsingDoubleLocking deSerialInstance=(SingletonPatternUsingDoubleLocking) objectInput.readObject();
			System.out.println(deSerialInstance.hashCode());
			System.out.println(deSerialInstance.getName());
			System.out.println(deSerialInstance.getSurName());
			
			System.out.println(deSerialInstance.clone().hashCode());
			
		}
		
		Runtime.getRuntime().gc();
		System.out.println(Runtime.getRuntime().maxMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		
		
	}

}
