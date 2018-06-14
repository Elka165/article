import java.io.*;
import java.util.*;

public class Losowanie {
    public static void main(String[] args) {

        Scanner scaner=new Scanner(System.in);

        SortedSet<Integer>score=new TreeSet<Integer>();
        System.out.println("Podaj zakres liczb: ");
        int maxRange = scaner.nextInt();

        System.out.println("Podaj ilość liczb do wylosowania:");
        int amountNamber =scaner.nextInt();

        int[] tablica=new int[amountNamber];

        metodaLosowania(maxRange, amountNamber, score);
        writeScore(score);


        writeFile(score);
        System.out.println("Dane zostały zapisane w pliku");

    }




    public static void metodaLosowania(int maxRange, int amountNamber,  SortedSet<Integer> score){

            do {
                double rand = (Math.random() * maxRange) + 1;
                score.add((int) rand);
            }while(score.size()<amountNamber);

    }
public static void writeScore(SortedSet<Integer> score){
        for(Integer number:score){
            try {
                Thread.sleep(600);
                System.out.println(number);
            } catch (InterruptedException ie) {
            }


        }

}

public static void writeFile(SortedSet<Integer> score){
   try {
       File statText = new File("filename.txt");
       FileOutputStream is = new FileOutputStream(statText);
       OutputStreamWriter osw = new OutputStreamWriter(is);
       Writer w = new BufferedWriter(osw);

       for( Integer write: score) {
            w.write(String.valueOf(write));
           ((BufferedWriter) w).newLine();
       }
       w.close();

   }catch (IOException ex){
       ex.printStackTrace();
   }
   }



}


