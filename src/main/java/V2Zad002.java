import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class V2Zad002 {
    TreeMap mapa;
    public static int[] sortiraj(int[] niz){
        TreeMap<Integer,Integer> mapa = new TreeMap<>();
        for (int broj: niz) {
            mapa.put(broj, mapa.getOrDefault(broj,0)+1);
        }
        int[] resenje={};
        int index=0;
        for(int vrednost:mapa.keySet()){
            int i = mapa.get(vrednost);
            for(int j=0;j<i;j++)
                resenje[index] = vrednost;
                index++;
        }
        return  resenje;
    }

    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Random r = new Random();
        for(int i=0;i<100;i++){
            int broj= r.nextInt();
            niz.add(broj);
        }

    }

}
