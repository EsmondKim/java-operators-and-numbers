package teksystems.com;

public class Main {
    public static void main(String[] args) {
//        decimalTOBinary();
//        binaryToDecimal();
//        binaryLeftShift();
//        binaryRightShift();
//        bitwiseAndOperator();
//        postfixIncrement();
//        incrementByOne();
//        incrementByOnev2();
        preVsPostfix();
    }//main

    public static void decimalTOBinary() {
        int a = 1;
        String a_bin = Integer.toBinaryString(a);
        System.out.println(a_bin);

        int b = 8;
        String b_bin = Integer.toBinaryString(b);
        System.out.println(b_bin);

        int c = 33;
        String c_bin = Integer.toBinaryString(c);
        System.out.println(c_bin);
    }//decimalTOBinary()

    public static void binaryToDecimal() {
        String a ="0010";
        int decimal_a = Integer.parseInt(a,2);
        System.out.println(decimal_a);

        //Double checking 0010 1100 0110 0111 binary conversion to decimal.
        //Wrote out a chart of the powers of 2 out to the 15th power.
        //added the values represented by binary 1's.
        //8192 + 2048 + 1024 + 64 + 32 + 4 + 2 + 1 = 11,367
        String b ="0010110001100111";
        int decimal_b = Integer.parseInt(b,2);
        System.out.println(decimal_b);
    }//binaryToDecimal()

    public static void binaryLeftShift() {
        int x = 88;
        String x_bin = Integer.toBinaryString(x);
        System.out.printf("This is binary %s \n", x_bin);
        System.out.printf("This is decimal %d \n", x);
        int y = Integer.parseInt(x_bin) << 1;
        String y_bin_after_left_shift = Integer.toBinaryString(y);
        System.out.println(y_bin_after_left_shift);
        System.out.printf("This is x after left shift %d \n", x);
        String x_bin_after_left_shift = Integer.toBinaryString(x);
        System.out.printf("This is binary after left shift %s \n", x_bin_after_left_shift);
        System.out.printf("This is decimal after left shift %d", x);
    }//binaryLeftShift()

    public static void binaryRightShift() {
        int x = 150;
        String x_bin = Integer.toBinaryString(x);
        System.out.printf("This is binary %s \n", x_bin);
        System.out.printf("This is decimal %d \n", x);
        x = Integer.parseInt(x_bin) >> 2;
        System.out.printf("This is x after right shift %d \n", x);
        String x_bin_after_right_shift = Integer.toBinaryString(x);
        System.out.printf("This is binary after right shift %s \n", x_bin_after_right_shift);
        System.out.printf("This is decimal after right shift %d", x);
    }//binaryRightShift()

    public static void bitwiseAndOperator() {
        int x = 7;
        String x_bin = Integer.toBinaryString(x);
        System.out.println(x_bin);
        int y = 17;
        String y_bin = Integer.toBinaryString(y);
        System.out.println(y_bin);
        int z = (x & y);
        String z_bin = Integer.toBinaryString(z);
        System.out.println(z_bin);
//        int z = (x | y);
//        String z_bin = Integer.toBinaryString(z);
//        System.out.println(z_bin);
    }//bitwiseAndOperator()

    public static void postfixIncrement() {
        int a = 0;
        int b = 100;
        a = b++;
        System.out.printf("This is postfix incremented a (b++) %d", a);
    }//postfixIncrement()

    public static void incrementByOne() {
        int a = 0;
        int b = 1;
        a = b++;
        System.out.printf("This is the b++ postfix increment increment %d\n", a);
        a++;
        System.out.printf("This is the a++ increment %d\n", a);
        a = a + 1;
        System.out.printf(" This is the a+1 increment %d\n", a);
    }//incrementByOne()

    public static void incrementByOnev2() {
        int a = 0;
        int b = 1;
        a = a + 1;
        System.out.printf(" This is the a+1 increment %d\n", a);
        a = ++b;
        System.out.printf("This is the b++ PREfix increment increment %d\n", a);
        a++;
        System.out.printf("This is the a++ increment %d\n", a);
    }//incrementByOnev2()

    public static void preVsPostfix() {
        int x = 5;
        int y = 8;
        int sum = (x++) + y;
        System.out.println(sum);
    }//preVsPostfix()

}//Main

