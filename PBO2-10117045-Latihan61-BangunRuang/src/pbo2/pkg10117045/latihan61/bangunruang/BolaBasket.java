package pbo2.pkg10117045.latihan61.bangunruang;

public class BolaBasket extends BangunRuang {

    private double jariJari;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double volume() {

        return (jariJari * jariJari * jariJari * 4 * 22) / 3 / 7;
    }

}
