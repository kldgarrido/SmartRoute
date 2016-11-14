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
    
    public List<TravelResult> calculate1(Station stationA, Station stationB) {
        List<TravelResult> results = new ArrayList<>();
        
        for(Route route: stationA.getRoutes()){
            if(stationB.getRoutes().contains(route)){
                String text = stationA.getName() +" "+
                route.getName() + " " +  stationB.getName();
                
                TravelResult travelResult = new TravelResult(text);
                results.add(travelResult);
            }
        }
        
//        stationA.getRoutes().stream().filter((routeA) -> (stationB.getRoutes()
//                .contains(routeA))).map((routeA) -> stationA.getName() +" "+
//                routeA.getName() + " " +  stationB.getName()).map((text) 
//                        -> new TravelResult(text)).forEach((travelResult) -> {
//                    results.add(travelResult);
//        });
        
        return results;
    }
    
    public List<TravelResult> calculate2(Station stationA, Station stationB) {
        List<TravelResult> results = new ArrayList<>();
        
        for(Station station: stationA.getAveniu().getStations()){
            if(station.equals(stationA)){
                continue;
            }
            
            List<TravelResult>  listTemp = calculate1(station, stationB);
            
            if(!listTemp.isEmpty()){
                results.addAll(listTemp);
            }
        }
        
        
        return results;
    }
    
    
}
