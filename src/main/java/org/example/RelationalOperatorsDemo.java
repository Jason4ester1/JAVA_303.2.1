package org.example;
public class RelationalOperatorsDemo {
    public static void main(String[] args)
    {
        int x = 10, y = 5;
        System.out.println("x > y : "+(x > y));
        System.out.println("x < y : "+(x < y));
        System.out.println("x >= y : "+(x >= y));
        System.out.println("x <= y : "+(x <= y));
        System.out.println("x == y : "+(x == y));
        System.out.println("x != y : "+(x != y));

        int variable1 = 50, variable2 = 100, variable3 = 50;
        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);
        System.out.println("variable3 = " + variable3);
        System.out.println("variable1 == variable2: "
                + (variable1 == variable2));

        System.out.println("variable1 == variable3: "
                + (variable1 == variable3));
    }
}

//public class ArithmeticOperatorsDemo {
//
//    public static void main(String[] args) {
//
//        int x, y = 10, z = 5;
//        x = y + z;
//        System.out.println("+ operator resulted in " + x);
//        x = y - z;
//        System.out.println("- operator resulted in " + x);
//        x = y * z;
//        System.out.println("* operator resulted in " + x);
//        x = y / z;
//        System.out.println("/ operator resulted in " + x);
//        x = y % z;
//        System.out.println("% operator resulted in " + x);
//        x = y++;
//        System.out.println("Postfix ++ operator resulted in " + x);
//        x = ++z;
//        System.out.println("Prefix ++ operator resulted in " + x);
//        x = -y;
//        System.out.println("Unary operator resulted in " + x);
//        // Some examples of special Cases
//        int tooBig = Integer.MAX_VALUE + 1;
//        // Integer.MIN_VALUE.
//        int tooSmall = Integer.MIN_VALUE - 1;
//        // Integer.MAX_VALUE.
//        System.out.println("tooBig becomes " + tooBig);
//        System.out.println("tooSmall becomes " + tooSmall);
//        System.out.println(4.0 / 0.0);
//        System.out.println(-4.0 / 0.0);
//        System.out.println(0.0 / 0.0);
//        double d1 = 12 / 8;
//        double d2 = 12.0F / 8;
//        System.out.println("d1 is " + d1);
//        System.out.println("d2 is " + d2);
//    }
//}

//public class AssignmentOperatorsDemo {
//    public static void main(String args[]) {
//        int j, k;
//        j = 10;
//        j = 5;
//        k = j;
//        System.out.println("j is : " + j);
//        System.out.println("k is : " + k);
//
//        k = j = 10;
//        System.out.println("j is : " + j);
//        System.out.println("k is : " + k);
//    }
//}