import java.util.ArrayList;

public class V1Zad003 {
    public static void main(String[] args) {
        int n=4;
        ArrayList<ArrayList<Integer>> matrica= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            matrica.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++)
            for (int j = 0; j < n; j++)
                matrica.get(i).add((i*n)+j);
        System.out.println("ispis matrice: ");
        int suma_glavna=0;
        int suma_sporedna=0;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrica.get(i).get(j));
                if (i==j) suma_glavna+=matrica.get(i).get(j);
                if((i+j)==n) suma_sporedna+=matrica.get(i).get(j);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println(suma_glavna);
        System.out.println(suma_sporedna);



    }
}
