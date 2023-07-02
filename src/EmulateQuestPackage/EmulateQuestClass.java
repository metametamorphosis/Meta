package EmulateQuestPackage;

import java.util.Scanner;

public class EmulateQuestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("fibonacci's edge = ");
        byte x = scanner.nextByte();
        System.out.println("_____");
        fibonacci(x);
    }
    
    private static void fibonacci(byte fibedge){
        if (fibedge < 1 || fibedge > 93) System.out.println("от 1 до 93(предел long)");
        else if (fibedge == 1) System.out.println(0);
        else if (fibedge == 2) System.out.println(1);
        else {
            long[] array = new long[fibedge];
            array[0] = 0;
            System.out.print(array[0] + ", ");
            array[1] = 1;
            System.out.print(array[1] + ", ");

            for (byte i=2; i<fibedge-1; i++) {
                array[i] = array[i-2] + array[i-1];
                System.out.print(array[i] + ", ");
            }
            array[fibedge-1] = array[fibedge-3] + array[fibedge-2];
            System.out.println(array[fibedge-1] + ".");
        }
    }
}
