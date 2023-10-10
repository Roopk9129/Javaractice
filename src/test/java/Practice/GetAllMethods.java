package Practice;

import java.lang.reflect.Method;
import java.util.*;

public class GetAllMethods {

	public static void main(String[] args) {
		Method[] mname = HashMap.class.getDeclaredMethods();
		for (Method method : mname) {
			System.out.println(method);
		}
	}
}
