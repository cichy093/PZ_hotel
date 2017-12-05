package DataBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Marcin on 05.12.2017.
 */
@Entity
public class Klienci {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int _id;

    private String imie;
    private String nazwisko;
    private String email;
    private int telefon;
    private String nrDokumentu;
    private int _idTypDokumentu;
    private int _idSlTypDokumentu;

    public int get_id() {
        return _id;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getNrDokumentu() {
        return nrDokumentu;
    }

    public int get_idTypDokumentu() {
        return _idTypDokumentu;
    }

    public int get_idSlTypDokumentu() {
        return _idSlTypDokumentu;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setNrDokumentu(String nrDokumentu) {
        this.nrDokumentu = nrDokumentu;
    }

    public void set_idTypDokumentu(int _idTypDokumentu) {
        this._idTypDokumentu = _idTypDokumentu;
    }

    public void set_idSlTypDokumentu(int _idSlTypDokumentu) {
        this._idSlTypDokumentu = _idSlTypDokumentu;
    }

    Klienci(String imie, String nazwisko, String email, int telefon, String nrDokumentu, int idTypDokumentu, int idSlTypDokumentu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.telefon = telefon;
        this.nrDokumentu = nrDokumentu;
        this._idTypDokumentu = idTypDokumentu;
        this._idSlTypDokumentu = idSlTypDokumentu;
    }
    protected Klienci(){};
    @Override
    public String toString() {
        return String.format(
                "Klient[ID=%d, Imie='%s', Nazwisko='%s', E-mail='s', Telefon='d', Numer Dokumentu= 's', Typ Dokumentu='d']",
                _id, imie, nazwisko,email,telefon,nrDokumentu,_idTypDokumentu);
    }
}
