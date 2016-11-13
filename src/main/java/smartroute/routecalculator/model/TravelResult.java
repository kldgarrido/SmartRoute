/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartroute.routecalculator.model;

/**
 *
 * @author kld
 */
public class TravelResult {
    String text;

    public TravelResult(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "TravelResult{" + "text=" + text + '}';
    }
    
}
