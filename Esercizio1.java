import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

       System.out.println("Inserisci stringa");
       String str=input.nextLine();
       pariEdispari(str);

        System.out.println("Inserisci un anno");
        int anno=Integer.parseInt(input.nextLine());
        verificaAnno(anno);
        input.close();
    }
    public static void pariEdispari(String str){
        int leng=str.length();
        if(leng%2==0) System.out.println("La stringa ha un numero di caratteri pari");
        else System.out.println("La stringa ha un numero di caratteri dispari");
    }
    public static void verificaAnno(int anno){
        if(anno%100==0){
            if (anno%400==0) System.out.println("Anno bisestile");
            else System.out.println("Anno non bisestile");
        }else{
            if(anno%4==0) System.out.println("Anno bissestile");
            else System.out.println("Anno non bisestile");
        }



    }
}
