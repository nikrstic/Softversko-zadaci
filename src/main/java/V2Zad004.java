import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class V2Zad004 {

    static HashMap<Integer,Integer> mapa = new HashMap<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fajl = new Scanner(new File("ulaz.txt"));
        while(fajl.hasNext()) {
            int a= fajl.nextInt();
            if(mapa.containsKey(a))
            {
                int tmp = mapa.get(a);
                System.out.println(tmp);
                tmp++;
                mapa.replace(a,mapa.get(a),tmp);
            }
            else{
                System.out.println(0);
                mapa.put(a,1);
            }
        }
    }
}
