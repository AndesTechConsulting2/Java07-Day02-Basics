package org.andestech.learning.rfg18.g2;

public class TestClass {

    public static void main(String[] args)
    {

    Object o1;

    A a; a = new A();

    A a2 = new A();
    A a3 = a2;

    System.out.println(Integer.toHexString(a2.hashCode()));
    System.out.println(a2);
    System.out.println(a3);

    a2 = new A();

    new A();
    new A();

        System.out.println("----------------------");
        System.out.println(a2);
        System.out.println(a3);


    System.out.println(a);


    //------------
        C c = new C();
        System.out.println(c);

    }

}
