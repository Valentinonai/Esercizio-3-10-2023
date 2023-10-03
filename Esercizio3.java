import java.util.Objects;
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while(true){
            System.out.println("Inserisci una stringa (:q per uscire)");
            String str=input.nextLine();
            if(Objects.equals(str, ":q"))break;
            else dividiStringa(str);
        }

        input.close();
    }
    public static void dividiStringa(String str){

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') continue;
            System.out.print(i==str.length()-1?str.charAt(i)+"\n":str.charAt(i)+", ");
        }
    }
}
