import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Name {

    public int long1;
    public String[] imie;
    public String imieMax;
    public String imieMin;

    Scanner scaner1 = new Scanner(System.in);
    Map<String,Integer> mapa=new HashMap<String,Integer>();

    public void longTable() {
        imie = new String[long1];
    }

    public void wpiszImie() {
        for (int i = 0; i < imie.length; i++) {
            imie[i] = scaner1.next();
        }

    }

    public void maxName() {
        int max = imie[0].length();
        int min=imie[0].length();
        int repeat=0;
        String repeatImie=new String();
        for (int i = 0; i < imie.length; i++) {
            if (imie[i].length() >= max) {
                max=imie[i].length();
                imieMax = imie[i];
            }

            if (imie[i].length() <= min) {
                min=imie[i].length();
                imieMin = imie[i];
            }

            repeat=0;
            for(int j=0; j<imie.length; j++){

                if(imie[i].equals(imie[j])){
                   repeat+=1;
                   repeatImie=imie[i];
                }
                if (repeat>1) {
                    mapa.put(repeatImie, repeat);
                }
            }


        }


    }




    }
