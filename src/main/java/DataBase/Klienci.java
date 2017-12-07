package DataBase;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Marcin on 05.12.2017.
 */
@Entity
@Setter
@Getter
@Builder
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

    Klienci(String imie, String nazwisko, String email, int telefon, String nrDokumentu, int idTypDokumentu, int idSlTypDokumentu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.telefon = telefon;
        this.nrDokumentu = nrDokumentu;
        this._idTypDokumentu = idTypDokumentu;
    }
    protected Klienci(){};
    @Override
    public String toString() {
        return String.format(
                "Klient[ID=%d, Imie='%s', Nazwisko='%s', E-mail='s', Telefon='d', Numer Dokumentu= 's', Typ Dokumentu='d']",
                _id, imie, nazwisko, email, telefon, nrDokumentu, _idTypDokumentu);
    }
}
