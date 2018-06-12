import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Litery {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String imie=scaner.next();
        //String imie = "ELA";
        metodaLitera(imie.toLowerCase());


    }


    public static void metodaLitera(String imie1) {
        boolean wynik=false;
        Map<String,Boolean> mapa=new HashMap<String,Boolean>();
        for (int j = 0; j < imie1.length(); j++)
            for (int i = 0; i < imie1.length(); i++) {
                if(imie1.charAt(j)==imie1.charAt(i)){
                    if (j!=i){
                        wynik = true;
                        break;
                    }
                }


            }
        mapa.put(imie1, wynik);
        System.out.println(mapa);
    }

}
