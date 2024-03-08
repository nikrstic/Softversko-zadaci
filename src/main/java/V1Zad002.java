import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class V1Zad002 {
    public static class Niz<T>{
            private final ArrayList<T> lista;
        public Niz(int n){
            lista=new ArrayList<T>();
        }
        public int length(){
            return lista.size();
        }
        public T at(int index){
            return  lista.get(index);
        }
        public void add(T novi){
            lista.add(novi);
        }




        class MyIterator implements Iterator<T> {
            int index;
            MyIterator(){
                index=0;
            }
            public T next(){
                if(!hasNext()){
                    throw new NoSuchElementException("no next");
                }
                T tmp=lista.get(index);
                index++;
                return tmp;
            }
            public boolean hasNext() {
                return index<lista.size();
            }
            public Iterator<T> iterator(){
                return new MyIterator();
            }
        }


    }


    public static void main(String[] args) {
        Niz<Integer> niz=new Niz<Integer>(10);
        for(int i=0;i<10;i++){
            niz.add(i);
        }
        System.out.println(niz.length());
        Iterator<Integer> it = niz.lista.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
