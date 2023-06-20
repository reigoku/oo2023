public class kolmnurk extends tasapinnaline implements arvutused{
    double kulg1;
    double kulg2;
    double kulg3;
//right click -> generate -> constructor -> ctrl + click
    public kolmnurk(int tippudeArv, double kulg1, double kulg2, double kulg3) {
        super(tippudeArv);
        this.kulg1 = kulg1;
        this.kulg2 = kulg2;
        this.kulg3 = kulg3;
    }

    @Override
    public double arvutaUmbermoot() {
        return 0;
    }

    @Override
    public double arvutaPindala() {
        return 0;
    }
}
