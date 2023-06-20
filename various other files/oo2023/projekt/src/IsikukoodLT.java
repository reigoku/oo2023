public class IsikukoodLT extends Isikukood implements Andmed{
    public IsikukoodLT(String nimi, String isikukood) {
        super(nimi, isikukood);
    }

    @Override
    public String getSugu() {
        return null;
    }

    @Override
    public String getKuupäev() {
        return null;
    }

    @Override
    public int getVanus() {
        return 0;
    }
    // 020100-29990
    // 030303-10012
    // 030303-10215
    // 010107-20007
    // 040404-19999
}
