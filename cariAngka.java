import java.util.Scanner;
import java.util.*;
public class cariAngka {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[10];
        int total=0;
        for(int i=0;i<angka.length;i++){
            angka[i] = input.nextInt();
        }
        for(int i=0;i<angka.length;i++){
            if(angka[i]%5==0){
                total++;
            }
        }
        
        System.out.println("Total angka kelipatan 5 adalah "+total);
        
    }
}
