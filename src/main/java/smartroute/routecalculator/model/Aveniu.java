/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartroute.routecalculator.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kld
 */
public class Aveniu {
    
    private String id;
    private String name;
    private List<Station> stations;

    public Aveniu(String id, String name) {
        this.id = id;
        this.name = name;
        stations = new ArrayList<>();
    }

    public Aveniu(String id, String name, List<Station> stations) {
        this.id = id;
        this.name = name;
        this.stations = stations;
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void addStation(Station station){
        stations.add(station);
    }
    
}
