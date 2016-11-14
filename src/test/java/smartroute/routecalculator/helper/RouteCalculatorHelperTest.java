/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartroute.routecalculator.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import smartroute.routecalculator.model.Aveniu;
import smartroute.routecalculator.model.Route;
import smartroute.routecalculator.model.Station;
import smartroute.routecalculator.model.TravelResult;

/**
 *
 * @author kld
 */
public class RouteCalculatorHelperTest {
    
    public RouteCalculatorHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculate method, of class RouteCalculatorHelper.
     */
    @Test
    public void testCalculate1() {
        System.out.println("calculate");
        
        Route routeB1 = new Route("1", "B1");
        List<Route> routes = new ArrayList<>();
        routes.add(routeB1);
        
        Station station01 = new Station("1", "StationNort", routes);
        Station station02 = new Station("2", "StationSouth", routes);
        
        RouteCalculatorHelper instance = new RouteCalculatorHelper();
        
        List<TravelResult> expResult = new ArrayList<>();
        String text = "StationNort" +" "+
                        "B1" + " " +  "StationSouth";
                
        TravelResult travelResult = new TravelResult(text);
        expResult.add(travelResult);
        
        List<TravelResult> result = instance.calculate1(station01, station02);
        
        assertEquals(expResult.size(), result.size());
        for(int i=0; i< expResult.size(); i++){
            assertEquals(expResult.get(i), result.get(i));    
        }
    }
    
    
    @Test
    public void testCalculate2() {
        System.out.println("calculate");
        
        Route routeB1 = new Route("1", "B1");
        List<Route> routes1 = new ArrayList<>();
        routes1.add(routeB1);

        Route routeC2 = new Route("2", "C2");
        List<Route> routes2 = new ArrayList<>();
        routes2.add(routeB1);
        routes2.add(routeC2);
        
        List<Route> routes3 = new ArrayList<>();
        routes3.add(routeC2);
        
        Aveniu northAveniu = new Aveniu("1", "AutoNort");
        Aveniu southAveniu = new Aveniu("1", "AutoSouth");
        
        Station station01 = new Station("1", "StationNort", northAveniu, routes1);
        Station station02 = new Station("2", "StationCenter", northAveniu, routes2);
        Station station03 = new Station("3", "StationSouth", southAveniu, routes3);
        
        northAveniu.addStation(station01);
        northAveniu.addStation(station02);
        southAveniu.addStation(station03);
        
        RouteCalculatorHelper instance = new RouteCalculatorHelper();
        
        List<TravelResult> expResult = new ArrayList<>();
        String text = "StationNort" +" "+
                        "B1" + " " +  "StationSouth";
                
        TravelResult travelResult = new TravelResult(text);
        expResult.add(travelResult);
        
        List<TravelResult> result = instance.calculate2(station01, station03);
        
        assertEquals(expResult.size(), result.size());
//        for(int i=0; i< expResult.size(); i++){
//            assertEquals(expResult.get(i), result.get(i));    
//        }
    }
    
}
