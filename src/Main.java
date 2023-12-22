//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Creazione mappa con primo metodo di inizializzazione
        Map<String, String> mappa = new HashMap<String, String>();
        mappa.put("Palermo", "PA");
        mappa.put("Torino", "TO");
        System.out.println("La prima mappa = " + mappa);

        //Creazione mappa con secondo metodo di inizializzazione
        Map<String, String> mappa2 = Map.of("Palermo", "PA", "Torino", "TO");
        System.out.println("Secondo mappa = " + mappa2);

        //Creazione mappa con terzo metodo di inizializzazione
        Map<String, String> mappa3 = new HashMap<String, String>(Map.ofEntries
                (new AbstractMap.SimpleEntry<>("Palermo", "PA"),
                        new AbstractMap.SimpleEntry<>("Torino", "TO"))
        );
        System.out.println("Terza mappa = " + mappa3);

    }


}
