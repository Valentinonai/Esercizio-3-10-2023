import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Inserisci un numero ");
        int n=Integer.parseInt(input.nextLine());
        try {
            countDown(n);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        input.close();
    }
    public static void countDown(int n) throws InterruptedException {
        for(int i=n;i>=0;i--){
            System.out.println(i);
            if(i>0)
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
