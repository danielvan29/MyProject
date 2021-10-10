package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressWarnings("all")
public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        //Person person = new Person();
        //Class c1 = person.getClass();
        //System.out.println(c1.hashCode());

        //try {
        //    Class c2 = Class.forName("reflection.Person");
        //    System.out.println(c2.hashCode());
        //} catch (ClassNotFoundException e) {
        //    e.printStackTrace();
        //}

        Class c3 = Person.class;
        //System.out.println(c3.hashCode());

        Annotation[] annotations = c3.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType());
        }

        Person person = new Person();
        System.out.println(person.getAge());

        Method setAge = c3.getDeclaredMethod("setAge", int.class);
        setAge.invoke(person, 3);

        System.out.println(person.getAge());

        Field name = c3.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person,"tom");
        System.out.println(person.getName());
    }
}
