package code;

import java.util.Arrays;
import java.util.Scanner;

public class CostCutting {
    static Scanner input = new Scanner(System.in);

    public static boolean checkNumCase(int n){
        if(n <= 0 || n >= 20){
            return false;
        }
        return true;
    }

    public static void splitAndChangeToInt(){

    }

    public static void main(String[] args) {
        int numCase = input.nextInt();
        input.nextLine();//detect enter key value and don't allow it
        if(checkNumCase(numCase)){
            int[][] matSal = new int[numCase][3];

            for(int i = 0 ; i < numCase ; i++){
                String line = input.nextLine();
                String[] strSalarys = line.split(" ");
                //System.out.println(Arrays.toString(strSalarys));
                if(strSalarys.length != 3){
                    return;
                }else {

                }

            }
        }

    }
}
