import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class V1Zad007 {

    public static class Lista<T>{
        ArrayList<Cvor<T>> start;
        public void add(Cvor<T> element) {
            start.add(element);
        }


        public Lista(){
            this.start=new ArrayList<>();
        }



       private class ListIterator implements Iterator<Cvor<T>>{
            private int index;
            private int step;
            public ListIterator(int step){
                this.index=0;
                this.step=step;
            }
            public boolean hasNext(){
                return index+step<start.size();
            }
           public Cvor<T> next() {
               if (!hasNext()) {
                   throw new NoSuchElementException();
               }
               Cvor<T> current = start.get(index);
               index += step;
               return current;
           }
       }
        public Iterator<Cvor<T>> iterator(int k){
            return new ListIterator(k);
        }
    }
    public static class Cvor<T> {
        T element;
        Cvor<T> sledeci;

        public Cvor(T element) {
            this.element = element;
            this.sledeci = null;

        }


    }
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        for (int i = 0; i < 10; i++) {
            lista.add(new Cvor<>(i));
        }
        Iterator<Cvor<Integer>> iterator = lista.iterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next().element);
        }
    }
}
