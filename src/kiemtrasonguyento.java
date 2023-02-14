import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        for (int i = 2; i < Math.sqrt(number); i++){
            if(number % i == 0){
                System.out.println(number + " Khong la so nguyen to");
                break;
            }else {
                System.out.println(number + " la so nguyen to");
            }
        }

    }
}