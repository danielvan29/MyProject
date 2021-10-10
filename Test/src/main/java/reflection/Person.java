package reflection;

import myAnnotation.Test01;

/**
 * @author VAN
 */
@SuppressWarnings("all")
@Test01(name = "van")
public class Person {
    private String name;
    private static int age = 10;

    static {
        System.out.println("static block");
        age = 20;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
