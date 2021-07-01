package filme;

public class FilmeVO {
    private int id;
    private String titel;
    private String land;
    private int jahr;

    public FilmeVO(int id, String titel, String land, int jahr) {
        this.id = id;
        this.titel = titel;
        this.land = land;
        this.jahr = jahr;
    }

    // region GETTER SETTER
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return this.titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getLand() {
        return this.land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public int getJahr() {
        return this.jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }
    // endregion

}
