
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayManiplator {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String command = "";
        List<Integer> numbersCountList=new ArrayList<>();


        //cast String array of the numbers to type int
        String[] numbersStringArray = scann.nextLine().split(" ");
        int[] numbersArray = new int[numbersStringArray.length];

        //check if the first is the command end
        if (numbersStringArray[0].equals("e") && numbersStringArray[1].equals("n") &&
                numbersStringArray[2].equals("d")) {
            command = "end";
        } else {
            command = scann.nextLine();
            //doing the real casting
            for (int i = 0; i < numbersArray.length; i++) {
                numbersArray[i] = Integer.parseInt(numbersStringArray[i]);
            }
        }


        while (!command.equals("end")) {

            String[] input = command.split(" ");
            if (input[0].equals("exchange")) {
                getExchangedArray(input[1], numbersArray);
            }

            else if (input[0].equals("max")) {
                if (input[1].equals("even")) {
                    getMaxEven(numbersArray);
                }
                else if (input[1].equals("odd")) {
                getMaxOdd(numbersArray);
                }

            }

            else if (input[0].equals("min")) {
                if (input[1].equals("even")) {
                    getMinEven(numbersArray);
                }
                else if (input[1].equals("odd")) {
                    getMinOdd(numbersArray);
                }

            }
            else if(input[0].equals("first")){
                if (input[2].equals("even")) {
                getFirstEven(input[1],numbersArray,numbersCountList);
                }
                else if (input[2].equals("odd")) {
getFirstOdd(input[1],numbersArray,numbersCountList);
                }
            }

            else if(input[0].equals("last")){
                if (input[2].equals("even")) {
getLastEven(input[1],numbersArray,numbersCountList);
                }
                else if (input[2].equals("odd")) {
getLastOdd(input[1],numbersArray,numbersCountList);
                }
            }



        command = scann.nextLine();
    }
        System.out.print("[");
        int b=0;
        for(int i=0;i<numbersArray.length;i++){
            b++;

            if(b!=numbersArray.length) {
                System.out.print(numbersArray[i]+", ");
            }
            if(b==numbersArray.length){
                System.out.print(numbersArray[i]+"]");
            }
        }
}

    private static void getLastOdd(String s, int[] numbersArray, List<Integer> numbersCountList) {
        int count =Integer.parseInt(s);
        if(count> numbersArray.length){
            System.out.print("Invalid count");
            System.out.println();
        }
        else{
            System.out.print("[");int a=0,b=0;
            if(numbersArray.length<count)
            {
                for(int i=numbersArray.length-1;i>=0;i--){
                    b++;
                    if(numbersArray[i]%2!=0){
                        if(b!=numbersArray.length-1) {
                            System.out.print(numbersArray[i]+", ");
                            a++;
                        }
                        if(b==numbersArray.length-1||a==numbersArray.length-1){
                            System.out.print(numbersArray[i]+"]");
                            System.out.println();
                            break;
                        }
                    }
                    else if(a==0){
                        System.out.print("]");
                        System.out.println();break;
                    }
                }
            }
            else{
                for(int i= numbersArray.length-1;i>=0;i--){
                    b++;
                    if(numbersArray[i]%2!=0){
                        if(b!=count) {
                            if(a>=1){
                                System.out.print(", ");
                            }
                            System.out.print(numbersArray[i]);
                            a++;
                        }

                    }
                }
                System.out.print("]");
                System.out.println();
            }



        }
    }

    private static void getLastEven(String s, int[] numbersArray, List<Integer> numbersCountList) {

        int count =Integer.parseInt(s);
        if(count> numbersArray.length){
            System.out.print("Invalid count");
            System.out.println();
        }
        else{
            System.out.print("[");int a=0,b=0;
            if(numbersArray.length<count)
            {
                for(int i=numbersArray.length-1;i>=0;i--){
                    b++;
                    if(numbersArray[i]%2==0){
                        if(b!=numbersArray.length-1) {
                            System.out.print(numbersArray[i]+", ");
                            a++;
                        }
                        if(b==numbersArray.length-1||a==numbersArray.length-1){
                            System.out.print(numbersArray[i]+"]");
                            System.out.println();

                            break;
                        }
                    }
                    else if(a==0){
                        System.out.print("]");
                        System.out.println();break;
                    }
                }
            }
            else{
                for(int i= numbersArray.length-1;i>=0;i--){
                    b++;
                    if(numbersArray[i]%2==0){
                        if(b!=count) {
                            if(a>=1){
                                System.out.print(", ");
                            }
                            System.out.print(numbersArray[i]);
                            a++;
                        }

                    }
                }
                System.out.print("]");
                System.out.println();
            }



        }
    }

    private static void getFirstOdd(String s, int[] numbersArray, List<Integer> numbersCountList) {
        int count =Integer.parseInt(s);
        if(count> numbersArray.length){
            System.out.print("Invalid count");
            System.out.println();
        }
        else{
            System.out.print("[");int a=0,b=0;
            if(numbersArray.length<count)
            {
                for(int i=0;i< numbersArray.length;i++){
                    b++;
                    if(numbersArray[i]%2!=0){
                        if(b!=numbersArray.length-1) {
                            System.out.print(numbersArray[i]+", ");
                            a++;
                        }
                        if(b==numbersArray.length-1||a==numbersArray.length-1){
                            System.out.print(numbersArray[i]+"]");
                            System.out.println();
                            break;
                        }
                    }
                    else if(a==0){
                        System.out.print("]");
                        System.out.println();break;
                    }
                }
            }
        else{
                for(int i=0;i< numbersArray.length;i++){
                    b++;
                    if(numbersArray[i]%2!=0){
                        if(b!=count) {
                            if(a>=1){
                                System.out.print(", ");
                            }
                            System.out.print(numbersArray[i]);
                            a++;
                        }

                    }
                }
                System.out.print("]");
                System.out.println();
            }



        }
    }

    private static void getFirstEven(String s, int[] numbersArray, List<Integer> numbersCountList) {
        int count =Integer.parseInt(s);
        if(count> numbersArray.length){
            System.out.print("Invalid count");
            System.out.println();
        }
        else{
            System.out.print("[");int a=0,b=0;
            if(numbersArray.length<count)
            {
                for(int i=0;i< numbersArray.length;i++){
                    b++;
                    if(numbersArray[i]%2==0){
                        if(b!=numbersArray.length-1) {
                            System.out.print(numbersArray[i]+", ");
                            a++;
                        }
                        if(b==numbersArray.length-1||a==numbersArray.length-1){
                            System.out.print(numbersArray[i]+"]");
                            System.out.println();
                            break;
                        }
                    }
                    else if(a==0){
                        System.out.print("]");
                        System.out.println();break;
                    }
                }
            }
            else{
                for(int i=0;i< numbersArray.length;i++){
                    b++;
                    if(numbersArray[i]%2==0){
                        if(b!=count) {
                            if(a>=1){
                                System.out.print(", ");
                            }
                            System.out.print(numbersArray[i]);
                            a++;
                        }

                    }
                }
                System.out.print("]");
                System.out.println();
            }



        }

    }


    private static void getExchangedArray(String indexTemp, int[] numbersArray) {

        int index=Integer.parseInt(indexTemp);
        if(index>=0&&index<=numbersArray.length-1){
            //creating a copy of the cuurent array
            int[] copyArray=new int[numbersArray.length];
            for(int i=0;i< numbersArray.length;i++){
                copyArray[i]=numbersArray[i];
            }

            int counterIndex=0;
            for(int startNew=index+1;startNew< numbersArray.length;startNew++){
                numbersArray[counterIndex]=copyArray[startNew];
                counterIndex++;
            }


            for(int endNew=0; endNew<=index;endNew++){
                numbersArray[counterIndex]=copyArray[endNew];
                counterIndex++;
            }


        }
        else{
            System.out.print("Invalid index");
            System.out.println();
        }



    }


    private static void getMaxEven(int[] numbersArray) {
int maxElement=Integer.MIN_VALUE,index=-1;
for(int i=0;i< numbersArray.length;i++){
    if(numbersArray[i]%2==0&&numbersArray[i]>=maxElement){
        maxElement=numbersArray[i];
        index=i;
    }
}
if(index>-1){
    System.out.print(index);
    System.out.println();
}
else{
    System.out.print("No matches");
    System.out.println();
}

    }


    private static void getMaxOdd(int[] numbersArray) {
        int maxElement=Integer.MIN_VALUE,index=-1;
        for(int i=0;i< numbersArray.length;i++){
            if(numbersArray[i]%2!=0&&numbersArray[i]>=maxElement){
                maxElement=numbersArray[i];
                index=i;
            }
        }
        if(index>-1){
            System.out.print(index);
            System.out.println();
        }
        else{
            System.out.print("No matches");
            System.out.println();
        }
    }


    private static void getMinEven(int[] numbersArray) {
        int minElement =Integer.MAX_VALUE,index=-1;
        for(int i=0;i< numbersArray.length;i++){
            if(numbersArray[i]%2==0&&numbersArray[i]<= minElement){
                minElement =numbersArray[i];
                index=i;
            }
        }
        if(index>-1){
            System.out.print(index);
            System.out.println();
        }
        else{
            System.out.print("No matches");
            System.out.println();
        }
    }

    private static void getMinOdd(int[] numbersArray) {
        int minElement =Integer.MAX_VALUE,index=-1;
        for(int i=0;i< numbersArray.length;i++){
            if(numbersArray[i]%2!=0&&numbersArray[i]<= minElement){
                minElement =numbersArray[i];
                index=i;
            }
        }
        if(index>-1){
            System.out.print(index);
            System.out.println();
        }
        else{
            System.out.print("No matches");
            System.out.println();
        }
    }
}

