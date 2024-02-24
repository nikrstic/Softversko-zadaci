import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class V1Zad001 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        Random random=new Random();
        int sumatest=0;
        for(int i=0;i<100;i++){
            int broj = random.nextInt(1000);
            brojevi.add(broj);
            sumatest+=broj;
        }
        Iterator<Integer> brojevi1= brojevi.iterator();
        int suma=0;
        while(brojevi1.hasNext()){
            suma+=brojevi1.next();
        }
        System.out.println(suma);
        System.out.println(sumatest);
    }

}
