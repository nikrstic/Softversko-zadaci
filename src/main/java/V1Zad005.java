import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class V1Zad005 {

    public static class Nizovi<T> {

        V1Zad002.Niz<T> n1;
        V1Zad002.Niz<T> n2;

        public Nizovi(int n, int m) {
            n1 = new V1Zad002.Niz<>(n);
            n2 = new V1Zad002.Niz<>(m);
        }

        class MyIterator implements Iterator<T> {
            int indexN1;
            int indexN2;

            MyIterator() {
                indexN1 = 0;
                indexN2 = 0;
            }

            public T next() {
                if (indexN1 < n1.length()) {
                    T tmp = n1.at(indexN1);
                    indexN1++;
                    return tmp;
                } else if (indexN2 < n2.length()) {
                    T tmp = n2.at(indexN2);
                    indexN2++;
                    return tmp;
                }
                return null;
            }

            public boolean hasNext() {
                return indexN1 < n1.length() || indexN2 < n2.length();
            }
            public Iterator<T> iterator() {
                return new MyIterator();
            }
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 4;
        Nizovi<Integer> niz = new Nizovi<>(n, m);
        Nizovi.MyIterator it = niz.new MyIterator();

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            niz.n1.add(random.nextInt(100));
        }
        for (int i = 0; i < m; i++) {
            niz.n2.add(random.nextInt(100));
        }
        while (it.hasNext()) System.out.println(it.next());
    }
}
