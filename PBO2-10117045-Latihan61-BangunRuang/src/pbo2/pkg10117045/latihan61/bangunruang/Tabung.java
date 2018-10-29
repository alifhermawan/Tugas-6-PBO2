package pbo2.pkg10117045.latihan61.bangunruang;

public class Tabung extends BangunRuang {

    private double jariJari;
    private double tinggi;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return (22 * jariJari * jariJari * tinggi) / 7; //To change body of generated methods, choose Tools | Templates.
    }

}
