import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);

         Arrays.stream(scann.nextLine()
                .split(" ")).filter(e->e.length()%2==0).forEach(System.out::println
         );
    }
}
