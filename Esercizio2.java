import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("inserisci un numero intero");
        int n=Integer.parseInt(input.nextLine());
        verificaNum(n);

        input.close();
    }
    public static void verificaNum(int n){
        switch (n){
            case 0:{
                System.out.println("ZERO");
                break;
            }
            case 1:{
                System.out.println("UNO");
                break;
            }
            case 2:{
                System.out.println("DUE");
                break;
            }
            case 3:{
                System.out.println("TRE");
                break;
            } default:{
                System.out.println("Numero non compreso tra 0 e 3");
                break;
            }

        }
    }
}
