package wp.oblig3;

public class Billetter {
    private String velgFilm;
    private String antall;
    private String fornavn;
    private String etternavn;
    private String tlfnr;
    private String epost;

    public Billetter(String velgFilm, String antall, String fornavn, String etternavn, String tlfnr, String epost) {
        this.velgFilm = velgFilm;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.tlfnr = tlfnr;
        this.epost = epost;
    }
    public Billetter(){}

    public String getVelgFilm() {
        return velgFilm;
    }

    public void setVelgFilm(String velgFilm) {
        this.velgFilm = velgFilm;
    }

    public String getAntall() {
        return antall;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(String tlfnr) {
        this.tlfnr = tlfnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}
