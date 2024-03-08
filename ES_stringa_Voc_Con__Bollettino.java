import java.util.Scanner;
public class ES_stringa_Voc_Con__Bollettino {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String vocali = " ";
        String consonanti = " ";

        System.out.println("Inserisci una stringa: ");
        String stringa = in.nextLine();

        for (int i = 0; i < stringa.length(); i++) {
            char let = stringa.charAt(i);
            if (let == 'A' || let == 'E' || let == 'I' || let == 'O' || let == 'U' || let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u') {
                vocali += let;
            } else if ((let >= 'A' && let <= 'Z') || (let >= 'a' && let <= 'z')) {
                consonanti += let;
            }
        }

        System.out.println("Vocali: " + vocali);
        System.out.println("Consonanti: " + consonanti);

    }
}