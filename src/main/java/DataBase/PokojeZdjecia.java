package DataBase;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

/**
 * Created by Marcin on 05.12.2017.
 */
@Entity
@Setter
@Getter
@Builder
public class PokojeZdjecia {

    private int idPokoju;
    private String zdjecie; //ścieżka do zdjęcia

    public PokojeZdjecia(int idPokoju, String zdjecie) {
        this.idPokoju = idPokoju;
        this.zdjecie = zdjecie;
    }

    protected PokojeZdjecia() {};
}
