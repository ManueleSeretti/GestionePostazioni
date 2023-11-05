package ManueleSeretti.Entities;

import java.util.Random;

public enum TipoPostazione {
    PRIVATO, OPENSPACE, SALA_RIUNIONE;

    private static final Random rndm = new Random();

    public static TipoPostazione randomPostazione() {

        TipoPostazione[] stato = values();
        return stato[rndm.nextInt(0, stato.length)];

    }
}
