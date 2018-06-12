import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scaner=new Scanner(System.in);

       Name name=new Name();

       System.out.println("Ile imion chcesz wpisać:");
       name.long1=scaner.nextInt();
       name.longTable();

       System.out.println("Wpisz imiona:");
       name.wpiszImie();

       System.out.println(name.long1);

       for(String args1 : name.imie) {
           System.out.println(args1);
       }
        name.maxName();
       name.repatImie();
        System.out.println("Najdłuższe imie: "  + name.imieMax);
        System.out.println("Najkrótsze imie: " + name.imieMin);

        System.out.println("Pwtarzające się imiona: " + name.mapa );
    }


}
