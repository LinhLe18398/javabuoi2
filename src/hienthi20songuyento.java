import java.util.Scanner;

public class hienthi20songuyento {
    public static void main(String[] args) {
       int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scan.nextInt();
        for(int i = 1; i < n; i++)
        {
            int dem = 0;
            for(int j = 1; j <= i; j++)
            {
                if(i % j == 0){
                    dem++;
                }
            }
            if(dem == 2){
                System.out.print(" " +i);
            }
        }

    }
}
