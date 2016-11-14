/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartroute.routecalculator.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import smartroute.routecalculator.model.Route;
import smartroute.routecalculator.model.Station;

/**
 *
 * @author kld
 */
public class MainCoreTest {
    
    public MainCoreTest() {
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
     * Test of execute method, of class MainCore.
     */
    @org.junit.Test
    public void testExecute() {
        System.out.println("execute");
        
        String stationAName = "StationNort";
        String stationBName = "StationSouth";
        
        Route routeB1 = new Route("1", "B1");
        List<Route> routes = new ArrayList<>();
        routes.add(routeB1);
        
        Station station01 = new Station("1", "StationNort", routes);
        Station station02 = new Station("2", "StationSouth", routes);
        Map<String, Station> stationMap = new HashMap<>();
        stationMap.put("StationNort", station01);
        stationMap.put("StationSouth", station02);
        
        MainCore instance = new MainCore(stationMap);
        boolean expResult = true;
        boolean result = instance.execute(stationAName, stationBName);
        
        assertEquals(expResult, result);
    }
    
}
