package core.singletone;

import java.io.Serializable;

public class Singletone implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
	private volatile static Singletone instance;
	
	private Singletone() {
		if(instance!=null) {
			throw new IllegalStateException("Object cannot be copy by Reflection API");
		}
	}
	
	//serialization prevention
	protected Object readResolve() {
		return instance;
		 
	}
	
	public static Singletone getSingletoneInstance() {
		if(instance==null) {
			synchronized (Singletone.class) {
				if(instance==null) {
					instance=new Singletone();
				}
			}
			
		}
		return instance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {

		throw new CloneNotSupportedException();
	//    return super.clone();
	}

}
