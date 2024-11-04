package hu.szamalk.modell;

public class Alkalmazott extends Szemely {

    private int munkEv;

    public Alkalmazott(String nev, int szuletesiEv, int munkEv) {
        super(nev, szuletesiEv);
        this.munkEv = munkEv;
    }

    @Override
    public void kiir() {
        System.out.printf("%s, %d, %d\n", super.nev, super.szuletesiEv, munkEv);
    }

    @Override
    public String toString() {
        return "Alkalmazott{" +
                "munkEv=" + munkEv +
                '}';
    }
}
