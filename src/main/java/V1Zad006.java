import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class V1Zad006 {

   public static class Niz<T> {
       ArrayList<T> lista = new ArrayList<T>();

       public Niz() {
           lista = new ArrayList<T>() {
           };
       }


       int length() {
           return lista.size();
       }

       void add(T novi) {
           lista.add(novi);
       }


       class MyIterator implements Iterator<T> {
           int index;

           MyIterator() {
               index = 0;
           }

           public T next() {
               T tmp;
               if (!hasNext()) {
                   throw new NoSuchElementException("no next");
               }
               tmp = lista.get(index);
               index+=5;
               return tmp;
           }

           public boolean hasNext() {
               return index + 5 <= lista.size();
           }
       }

       public Iterator<T> iterator() {
           return new MyIterator();
       }
   }

    public static void main(String[] args) {
        Niz<Integer> niz = new Niz<Integer>();
        for(int i=0;i<100;i++) {
            niz.add(i);
        }
        //Niz<Integer>.MyIterator it = new Niz<Integer>().new MyIterator();
        Iterator<Integer> it = niz.iterator();
        System.out.println("ispis: ");

        System.out.println(it.next().intValue());
        System.out.println(it.next().intValue());
        System.out.println(it.next().intValue());
    }
}
