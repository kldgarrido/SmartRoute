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
public class Station {
    
    private String id;
    private String name;
    private Aveniu aveniu;
    private List<Route> routes;

    public Station(String id, String name, Aveniu aveniu, List<Route> routes) {
        this.id = id;
        this.name = name;
        this.aveniu = aveniu;
        this.routes = routes;
    }

    public Station(String id, String name, List<Route> routes) {
        this.id = id;
        this.name = name;
        this.routes = routes;
        routes = new ArrayList<>();
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Aveniu getAveniu() {
        return aveniu;
    }

    public List<Route> getRoutes() {
        return routes;
    }
    
}
