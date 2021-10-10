package com;

@SuppressWarnings("all")
public class InitTest {

    public static void main(String[] args) {
        //ClassInit init = ClassInit.newInstance();
        //ClassInit init = new ClassInit();
        byte a1 = 2, a2 = 4, a3;
        short s = 16;
        //a2 = s;
        //a3 = a1 * a2;

        System.out.println(ClassInit.x);
        System.out.println(ClassInit.y);
    }
}


class ClassInit {
    //private static ClassInit init = new ClassInit();
    public static int x;
    public static int y = 0;

    static {
        System.out.println("static");
        x = 10;
        y = 10;
    }

    {
        System.out.println("normal");
    }

    public ClassInit() {
        System.out.println("构造器");
        x++;
        y++;
    }

    public static ClassInit newInstance() {
        return null;
    }
}