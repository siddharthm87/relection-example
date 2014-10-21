import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class main {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//no paramater
		Class noparams[] = {};
	 
		//String parameter
		Class[] paramString = new Class[1];	
		paramString[0] = String.class;
		
		Class classToInvestigate = Class.forName("CallToReflect");
		Object object = null;
		try {
			object = classToInvestigate.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Constructor [] constructors = classToInvestigate.getConstructors();
		for( Constructor constructor : constructors){
		    System.out.println("method = " + constructor.getName());
		}
		
		Method [] methods = classToInvestigate.getDeclaredMethods();
		for( Method method : methods){
		    System.out.println("method = " + method.getName());
		}
		
		Method method = classToInvestigate.getDeclaredMethod("methodOne", paramString);
		method.invoke(object, new String("aroma"));
		
	}
}
