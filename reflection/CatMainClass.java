import java.lang.reflect.Field;

public class CatMainClass {
    public static void main(String[] args) throws IllegalAccessException {
        Cat ct = new Cat("Junnu",2);
        Field[] catFields = ct.getClass().getDeclaredFields();

        for(Field f : catFields){
            System.out.println(f.getName());
            if(f.getName().equals("name")){
                f.setAccessible(true);
                f.set(ct,"vanka");
            }
        }
        System.out.println(ct.toString());
    }
}
