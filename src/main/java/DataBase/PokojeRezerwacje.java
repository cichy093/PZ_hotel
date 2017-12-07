package DataBase;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Marcin on 05.12.2017.
 */
@Entity
@Setter
@Getter
@Builder
public class PokojeRezerwacje {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int idKlienta;
    private int idPokoju;
    private Date dataOd;
    private Date dataDo;

    public PokojeRezerwacje(int idKlienta, int idPokoju, Date dataOd, Date dataDo) {
        this.idKlienta = idKlienta;
        this.idPokoju = idPokoju;
        this.dataOd = dataOd;
        this.dataDo = dataDo;
    }

    protected PokojeRezerwacje() {};
}
