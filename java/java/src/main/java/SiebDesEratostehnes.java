import java.util.*;

public class SiebDesEratostehnes {


        /**
         * Main Methode zum Programmstart, inkl. Benutzereingabe.
         * @param args
         */
        public static void main(String[] args) {
            int obergrenze = 45;
            ArrayList<Integer> zahlen = generiere(obergrenze);
            filterPrimzahlen(obergrenze, zahlen);
            ausgabe(zahlen);

        }

        /**
         * (4P) Generiert eine ArrayList mit allen möglichen Primzahlen bis zur Obergrenze und gibt diese zurück.
         * @param obergrenze, höchste Zahl in der Liste
         * @return angelegte ArrayList
         */
        public static ArrayList<Integer> generiere(int obergrenze) {
            ArrayList<Integer> primzahlen = new ArrayList<>();
            for (int i=2; i <= obergrenze; i++) {
                primzahlen.add(i);
            }
            return primzahlen;
        }

        /**
         * (13P) Löscht aus der Liste alle Zahlen, die keine Primzahl sind.
         * @param obergrenze, höchste Zahl in der Liste
         * @param primzahlen, Liste mit allen (möglichen) Primzahlen. Ist Eingabe & Rückgabeparameter gleichzeitig. (Call by Reference)
         */
        public static void filterPrimzahlen(int obergrenze, ArrayList<Integer> primzahlen) {
            for (int i = 0; i < primzahlen.size(); i++) {
                for (int j = 0; j < primzahlen.size(); j++) {
                    if (primzahlen.get(j) % primzahlen.get(i) == 0) {
                        primzahlen.remove(j);
                    }
                }
            }
        }

        /**
         * (3P) Gibt Zeilenweise die übergebene Liste aus
         * @param primzahlen, Liste zum Ausgeben
         */
        public static void ausgabe(ArrayList<Integer> primzahlen) {
            for (int i = 0; i < primzahlen.size(); i++) {
                System.out.println(primzahlen.get(i));
            }

    }
}
