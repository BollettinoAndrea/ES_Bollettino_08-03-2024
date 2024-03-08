import java.util.Scanner;
public class ES_stringa_Voc_Con_conFunzioni_Bollettino {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String stringa = in.nextLine();

        estraiVocali(stringa);
        estraiConsonanti(stringa);

        System.out.println("Vocali: " + estraiVocali(stringa));
        System.out.println("Consonanti: " + estraiConsonanti(stringa));
    }

    private static String estraiVocali(String stringa) {
        String vocali = "";
        for (int i = 0; i < stringa.length(); i++) {
            char c = stringa.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocali += c;
            }
        }
        return vocali;
    }

    private static String estraiConsonanti(String stringa) {
        String consonanti = "";
        for (int i = 0; i < stringa.length(); i++) {
            char c = stringa.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                if (!(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                    consonanti += c;
                }
            }
        }
        return consonanti;
    }
}
