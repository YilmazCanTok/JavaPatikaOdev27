
import java.util.Arrays;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinizin Eleman Sayısını Giriniz : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }
        Arrays.sort(array);

        for (int i = 0; i < n; i++) {
            System.out.println("Dizinin "+(i +1) +". elemanı : "+array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
