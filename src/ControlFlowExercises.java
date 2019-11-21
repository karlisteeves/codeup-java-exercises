
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {


//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("fizz");
                if (i % 5 == 0){
                    System.out.println("buzz");
                    if (i % 5 ==0 && i % 3 ==0){
                        System.out.println("fizzbuzz");
                    }

                }
            }

        }




        int q = 100;
        do
        {
            q =q-5;
            System.out.print(q+" ");
            if (q % 5 == 0) System.out.println();
        }
        while (q > 0);

        System.out.println();
    }
}
