package conn.carlos.webservice;

import java.util.*;

public class CarrosManager {
    private List<Carro> carros;

    public CarrosManager(){
        this.carros = new ArrayList<>();
        this.carros.add(new Carro("Nivus","VW"));
        this.carros.add(new Carro("Jetta","GTI"));
    }

    public List<Carro> getCarros(){
        return this.carros;
    }
}