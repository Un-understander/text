package test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class dh{
	private void a(){
		System.out.println();
	}
	public static void main(String args[]) throws Exception{
		String str="sdf";
		Object obj=str;
		Constructor cons=obj.getClass().getConstructor();
		cons.newInstance(null);
		
	}
}
