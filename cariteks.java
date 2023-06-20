import java.util.Scanner;
import java.util.*;
public class cariteks {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] teks = new String[10];
        int total=0;
        for(int i=0;i<teks.length;i++){
            teks[i] = input.nextLine();
        }
        for(int i=0;i<teks.length;i++){
            if(teks[i].length()==5){
                total++;
            }
        }
        
        System.out.println("Total teks yang panjang 5 adalah "+total);
        
    }
}
