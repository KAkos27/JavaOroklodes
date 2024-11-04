package hu.szamalk.modell;

public class Szemely {

    protected String nev;
    protected int szuletesiEv;

    public Szemely(String nev, int szuletesiEv) {

        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
    }

    public void kiir() {
        System.out.printf("%s, %d\n", nev, szuletesiEv);
    }

    @Override
    public String toString() {

        return "Szemely{" +
                "nev='" + nev + '\'' +
                ", szuletesiEv=" + szuletesiEv +
                '}';
    }
}
