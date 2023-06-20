import java.util.Scanner;
class kelipatan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();

        if(angka%5==0){
            System.out.println("angka kelipatan lima");
        }else{
            System.out.println("angka bukan kelipatan lima");
        }
    }
}