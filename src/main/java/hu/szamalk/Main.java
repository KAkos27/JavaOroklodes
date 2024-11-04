package hu.szamalk;

import hu.szamalk.modell.Alkalmazott;
import hu.szamalk.modell.Szemely;

public class Main {

    public static void main(String[] args) {

        Szemely szemely = new Szemely("Ákos", 2002);
        szemely.kiir();

        Alkalmazott alkalmazott = new Alkalmazott("Ede", 1980, 1);
        alkalmazott.kiir();
    }
}