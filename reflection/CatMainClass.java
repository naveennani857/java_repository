package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CatMainClass {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Cat ct = new Cat("Junnu",2);
        Field[] catFields = ct.getClass().getDeclaredFields();
        System.out.println(ct.toString());
        for(Field f : catFields){
            //System.out.println(f.getName());
            if(f.getName().equals("name")){
                f.setAccessible(true);
                f.set(ct,"Billi");
            }
        }
        System.out.println(ct.toString());

        Method[] catMethods =  ct.getClass().getDeclaredMethods();

        for(Method method : catMethods){
            //System.out.println(method.getName());
            if(method.getName().equals("catMethod")){
                method.setAccessible(true);
                method.invoke(ct);
            }
        }
    }
}
