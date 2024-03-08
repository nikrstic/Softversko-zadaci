import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class V1Zad004 {
    public static void main(String[] args) {
        ArrayList<String> stringovi = new ArrayList<String>();
        Collections.addAll(stringovi, "ja","ti","Test" ,"on","ona");
        Iterator<String> it = stringovi.iterator();
        System.out.println("Ispis: ");
        while(it.hasNext()){
            String tmp = it.next();
            System.out.print(tmp+" ");
            if(tmp.equals("Test")){
                it.remove();
            }
        }
        System.out.println();
        System.out.println("Novi ispis: ");
        for (String a:stringovi) {
            System.out.print(a+" ");
        }
    }

}
