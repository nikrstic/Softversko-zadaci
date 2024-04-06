import java.util.*;

public class V2Zad001 {
    static class Pravougaonik implements  Comparable<Pravougaonik>{
        Integer a;
        Integer b;

        public Pravougaonik(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pravougaonik that = (Pravougaonik) o;
            return a == that.a && b == that.b;
        }

        @Override
        public int hashCode() {
            return 13*a.hashCode()+23*b.hashCode()+43;
        }

        @Override
        public int compareTo(Pravougaonik o) {
            if(this.a+this.b>o.a+o.b)
                return 1;
            if(o.a+o.b>this.a+this.b)
                return -1;
            return 0;
        }

        public static void main(String[] args) {
            TreeMap<Pravougaonik,Integer> pravougaonici = new TreeMap<>();
            Random rand = new Random();

            for(int i=0;i<5;i++){
                int a= rand.nextInt(3);
                int b= rand.nextInt(3);
                Pravougaonik pr = new Pravougaonik(a,b);

                pravougaonici.put(pr, pravougaonici.getOrDefault(pr, 0) + 1);

            }
            pravougaonici.forEach((key, value) -> System.out.println("a: "+ key.a+" b: "+ key.b + " value: " + value));


        }



    }
}
