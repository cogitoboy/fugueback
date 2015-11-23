/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dale.is.awesome.fugueback.player;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daleapplegate
 */
public class BasicFugueComposer implements FugueComposer {

    private List<String> sheet = new ArrayList<>();
    
    public BasicFugueComposer() {
        sheet.add("A");
        sheet.add("B");
        sheet.add("C");
        sheet.add("D");
        sheet.add("E");
        sheet.add("F");
        sheet.add("G");
        
    }
    @Override
    public String compose(String logString) {
        Integer length = logString.length();
        while(length > 6) {
            length = length/2;
        }
        
        return sheet.get(length);
    }
    
}
