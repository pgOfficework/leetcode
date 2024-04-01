package core.singletone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletone {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException {
		Singletone originalSingletoneInstance=Singletone.getSingletoneInstance();
		
		System.out.println("originalSingletoneInstance : "+originalSingletoneInstance.hashCode());
		
		//reflection API
		Class<?> singletoneClass=Class.forName("core.singletone.Singletone");
		Constructor<Singletone> constructor=(Constructor<Singletone>) singletoneClass.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singletone brokenByReflectionSingletone=constructor.newInstance();
		
		System.out.println("brokenByReflectionSingletone : "+brokenByReflectionSingletone.hashCode());
		
		//serialization
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\serialization.ser"));
		objectOutputStream.writeObject(originalSingletoneInstance.getSingletoneInstance());
		objectOutputStream.close();
		
		ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("D:\\serialization.ser"));
		Singletone brokenSerializationSingletone=(Singletone) objectInputStream.readObject();
		System.out.println("brokenSerializationSingletone : "+brokenSerializationSingletone.hashCode());
		
		//cloning
		Singletone brokenCloningSIngletone= (Singletone) originalSingletoneInstance.clone();
		System.out.println("brokenCloningSIngletone : "+brokenCloningSIngletone.hashCode());
	}
}
