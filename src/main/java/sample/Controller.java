package sample;


import DataBase.*;
import org.springframework.beans.factory.annotation.Autowired;

public class Controller {
    @Autowired
    private KlienciRepository klienciRepository;
    @Autowired
    private PokojeRezerwacjeRepository pokojeRezerwacjeRepository;
    @Autowired
    private PokojeRepository pokojeRepository;
    @Autowired
    private PokojeZdjeciaRepository pokojeZdjeciaRepository;
    @Autowired
    SLTypyPokoiRepository slTypyPokoiRepository;
    @Autowired
    SLTypDokumentuRepository slTypDokumentuRepository;
    public void test(){
        DataBaseTest dataBaseTest = new DataBaseTest(this.klienciRepository, this.pokojeRepository, this.pokojeRezerwacjeRepository, this.pokojeZdjeciaRepository, this.slTypDokumentuRepository, this.slTypyPokoiRepository);
        dataBaseTest.loadTestData();
        dataBaseTest.printTestData();
    }

}
