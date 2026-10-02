public class Veicolo {
    private String marca;
    private String modello;
    private String targa;
    private String tipoAlimentazione;
    private double potenza;
    private int numeroPosti;

    Veicolo(String mar, String mod, String tar, String ta, double po, int np) {
        this.marca = mar;
        this.modello = mod;
        this.targa = tar;
        this.tipoAlimentazione = ta;
        this.potenza = po;
        this.numeroPosti = np;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setPotenza(double potenza) {
        if(potenza <= 0 || potenza >= 3000) {
            return;
        }
        this.potenza = potenza;
    }
}
