import java.util.Scanner;

public class inhinhtamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hight;
        System.out.println("Nhap chieu cao cua tam giac: ");
        hight = scanner.nextInt();
        for(int i = 1; i <= hight; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
