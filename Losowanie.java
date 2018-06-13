import java.util.*;

public class Losowanie {
    public static void main(String[] args) {

        Scanner scaner=new Scanner(System.in);

        SortedSet<Integer>wynik=new TreeSet<Integer>();
        System.out.println("Podaj zakres liczb: ");
        int maxZakres = scaner.nextInt();

        System.out.println("Podaj ilość liczb do wylosowania:");
        int iloscLiczb =scaner.nextInt();

        int[] tablica=new int[iloscLiczb];

        metodaLosowania(maxZakres, iloscLiczb, wynik);
        wypiszWynik(wynik);

    }




    public static void metodaLosowania(int maxZakres, int iloscLiczb,  SortedSet<Integer> wynik){

            do {
                double losowanie = (Math.random() * maxZakres) + 1;
                wynik.add((int) losowanie);
            }while(wynik.size()<iloscLiczb);

    }
public static void wypiszWynik(SortedSet<Integer> wynik){
        for(Integer liczby:wynik){
            try {
                Thread.sleep(600);
                System.out.println(liczby);
            } catch (InterruptedException ie) {
            }


        }

}

}

