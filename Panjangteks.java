import java.util.Scanner;
public class Panjangteks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kata = input.nextLine();

        if(kata.length()==5){
            System.out.println("teks memiliki 5 huruf");
        }else{
            System.out.println("teks tidak memiliki 5 huruf");
        }
    }
}
