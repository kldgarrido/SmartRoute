/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartroute.routecalculator.helper;

import java.util.ArrayList;
import java.util.List;
import smartroute.routecalculator.model.Route;
import smartroute.routecalculator.model.Station;
import smartroute.routecalculator.model.TravelResult;

/**
 *
 * @author kld
 */
public class RouteCalculatorHelper {

    public List<TravelResult> calculate(Station stationA, Station stationB) {
        List<TravelResult> results = new ArrayList<>();
        
        for(Route routeA: stationA.getRoutes()){
            if(stationB.getRoutes().contains(routeA)){
                String text = stationA.getName() +" "+
                        routeA.getName() + " " +  stationB.getName();
                
                TravelResult travelResult = new TravelResult(text);
                
                results.add(travelResult);
            }
        }
        
        return results;
    }
    
}
