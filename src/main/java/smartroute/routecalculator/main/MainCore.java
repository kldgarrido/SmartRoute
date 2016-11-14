/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartroute.routecalculator.main;

import java.util.List;
import java.util.Map;
import smartroute.routecalculator.model.Station;
import smartroute.routecalculator.helper.RouteCalculatorHelper;
import smartroute.routecalculator.model.TravelResult;

/**
 *
 * @author kld
 */
public class MainCore {
    
    private Map<String, Station> stationMap;
    private RouteCalculatorHelper routeCalculatorHelper;
    
    public static void main(String[] args) {
         
    }

    public MainCore(Map<String, Station>  stationMap) {
        this.stationMap = stationMap;
        routeCalculatorHelper = new RouteCalculatorHelper();
    }
    
    public boolean execute(String stationAName, String stationBName){
        Station stationA = stationMap.get(stationAName);
        Station stationB = stationMap.get(stationBName);
        
        List<TravelResult> results1 = routeCalculatorHelper.calculate1(stationA, stationB);
        List<TravelResult> results2= routeCalculatorHelper.calculate2(stationA, stationB);
        
        List<TravelResult> results = results1;
        results.addAll(results2);
        
        results.stream().forEach(item-> {
            System.out.println(item);
        });
        
        return !results.isEmpty();
    }
    
}
