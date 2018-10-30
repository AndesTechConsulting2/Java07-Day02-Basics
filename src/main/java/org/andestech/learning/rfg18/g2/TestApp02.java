package org.andestech.learning.rfg18.g2;


public class TestApp02 {
    public static void main(String[] args) {

        int a = 11;

        if (a != 11 && 1 == 1 && 1 != 2) {
            System.out.println("Ok!");
            //....
            //...
        } else {
            System.out.println("False...");
            //...
            //...
        }

        //
        if (a != 11) {
            System.out.println("Ok2!!");
            System.out.println("Ok3!!");
        }


        int a01 = 2; // 1,2,3,4,5

        if(a01==1){
            System.out.println("1 selected..");
        }
        else if(a01==2){
            System.out.println("2 selected..");
        }
        else if(a01==3){
            System.out.println("3 selected..");
        }
        else if(a01==4){
            System.out.println("4 selected..");
        }
        else if(a01==5){
            System.out.println("5 selected..");
        }
        else{
            System.out.println("not in list...");
        }

        // switch


        switch (a01)
        {
            case 1: System.out.println("1 selected.."); break;
            case 2: System.out.println("2 selected.."); break;
            case 3: System.out.println("3 selected.."); break;
            case 4: System.out.println("4 selected.."); break;
            case 5: System.out.println("5 selected.."); break;
            default: System.out.println("not in the list..");

        }

    // ternary if...
      int Nap = 1;
        System.out.println("You have " + Nap + " apple" +
                        (Nap!=1 ? "s." : ".") );

       int res = (Nap!=1 ? 100 : 1);

       System.out.println(res);

       // cycles
            for (int i=3, j=20; i<10 ; ++i, --j) {

                System.out.print("*");
                //..
                //..
                System.out.print(i + ", ");
                //..
                //..
            }

        System.out.print("\b\b.\n");


        {
            int i = 4;
            for (; ; ) {
                if (i > 10) break;
                System.out.print("*");
                //..
                //..

                System.out.print(i + ", ");
                //..
                //..
                ++i;
            }
        }
        System.out.print("\b\b.\n");

int a2=1, res2 = ++a2 + 1;
        System.out.println("res=" + res2);
        //System.out.println(i);

      //while

//      while(true)
//      {   if(a2>10) break;
//          if(a2%2==0){
//          System.out.println("a2="+a2);}
//          a2++;
//          //...
//
//      }

        while(true)
        {   if(a2>10) break;
            a2++;
            if(a2%2!=0)continue;

            System.out.println("a2="+a2);

            //...

        }

        System.out.print("123\t123\t234324\tAAAA\n");
        System.out.print("3\t12\t2324\tAA\n");

    }
}
