import java.util.Scanner;

public class V2Zad005 {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite string: ");
        String s = unos.nextLine();
        boolean a = true;
        int j = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            char trenutni = s.charAt(i);
            char razmak = ' ';

            if (trenutni == razmak) {
                continue;
            }

            while (j >= 0 && s.charAt(j) == razmak) {
                j--;
            }
            if (i < j && trenutni != s.charAt(j)) {
                a = false;
                break;
            }

            j--;
        }

        if (a) {
            System.out.println("Uneti string je palindrom.");
        } else {
            System.out.println("Uneti string nije palindrom.");
        }
    }
}
