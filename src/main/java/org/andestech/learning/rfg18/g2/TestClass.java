package org.andestech.learning.rfg18.g2;

public class TestClass {

    public static void main(String[] args)
    {

    Object o1;

    User user; user = new User();

    User user2 = new User();

    user2.name = "Super User..";
    user2.age = 77;

    User user3 = user2;

        System.out.println("user name: " + user3.name );

     user3.name = "Супер Мэннн";
        System.out.println("user name: " + user2.name );

    System.out.println(Integer.toHexString(user2.hashCode()));
    System.out.println(user2);
    System.out.println(user3);

    user2 = new User();

    new User();
    new User();

        System.out.println("----------------------");
        System.out.println(user2);
        System.out.println(user3);


    System.out.println(user);


    //------------
        C c = new C();
        System.out.println(c);

    }

}
