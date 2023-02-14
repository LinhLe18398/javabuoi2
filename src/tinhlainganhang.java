import java.util.Scanner;

public class tinhlainganhang {
    public static void main(String[] args) {
        double money;
        int month;
        double laisuat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien gui: ");
        money = sc.nextDouble();
        System.out.println("nhap so thang gui tien: ");
        month = sc.nextInt();
        System.out.println("nhap lai suat: ");
        laisuat = sc.nextDouble();

          double tienlai = money*(laisuat/100)*month;

        System.out.println("Tong so tien lai la: " + tienlai);
    }
}
