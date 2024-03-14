
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.KeyPair;
import java.util.*;

import static java.lang.Integer.*;
import static java.time.chrono.JapaneseEra.values;

public class V2Zad003 {
    static HashMap<String,HashMap<Integer,String>> podaci= new HashMap<String,HashMap<Integer,String>>();
    static HashMap<String,HashMap<Integer,String>> podaci1= new HashMap<String,HashMap<Integer,String>>();
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner fajl= new Scanner(new File("podaci.dat"));
        Scanner fajl = new Scanner(new File("podaci.dat"));

        String film;
        String korisnik;
        Integer ocena;
        HashMap<Integer,String> tmp = new HashMap<Integer,String>();
        while(fajl.hasNext())
        {
            korisnik = fajl.nextLine();
            film = fajl.nextLine();
            ocena = parseInt(fajl.nextLine());
            fajl.nextLine();
            //tmp.put(ocena,film);
            if(!podaci.containsKey(korisnik)) {
                podaci.put(korisnik, new HashMap<Integer, String>());
                podaci.get(korisnik).put(ocena, film);
            }
            else{
                podaci.get(korisnik).put(ocena,film);
            }
            if(!podaci1.containsKey(film)) {
                podaci1.put(film, new HashMap<Integer, String>());
                podaci1.get(film).put(ocena, korisnik);
            }
            else{
                podaci1.get(film).put(ocena,korisnik);
            }
        }
        String imeKorisnika = "korisnik2";
        String imeFilma= "film3";
        System.out.println(podaci.get(imeKorisnika).values());
        podA(imeKorisnika);
        podB(imeFilma);
        HashMap<String,Double> treci = new HashMap<String,Double>();

        podC(treci);
        //System.out.println(treci);
    }

    private static void podC(HashMap<String, Double> treci) {
        TreeMap<Double,ArrayList<String>> treemapa = new TreeMap<Double,ArrayList<String>>();
        double prosek;
        int broj_ubacenih=0;
        for(String filmovi: podaci1.keySet()){
            prosek=podB(filmovi);
            if(!treemapa.containsKey(podB(filmovi))){
                treemapa.put(prosek,new ArrayList<String>());
                treemapa.get(prosek).add(filmovi);
            }
            else{
                treemapa.get(prosek).add(filmovi);
            }
            treci.put(filmovi,prosek);

            broj_ubacenih++;
            if(broj_ubacenih==10) break;
        }

//        for(Double ocene:lista){
//            System.out.println(treci.(ocene));
//        }
        System.out.println(treemapa.descendingMap().values());
    }


    private static void podA(String imeKorisnika) {
        int sum=0;
        int broj=0;
        for(int podatak:podaci.get(imeKorisnika).keySet()){
            sum+=podatak;
            broj++;
        }
        System.out.println(podaci.get(imeKorisnika).keySet());
        System.out.println(sum*1.0/broj);
    }
    private static double podB(String imeFilma){
        int sum=0;
        int broj=0;
        for(int podatak:podaci1.get(imeFilma).keySet()){
            sum+=podatak;
            broj++;
        }
        System.out.println(podaci1.get(imeFilma).keySet());
        System.out.println(sum*1.0/broj);
        return (sum*1.0/broj);
    }
}
