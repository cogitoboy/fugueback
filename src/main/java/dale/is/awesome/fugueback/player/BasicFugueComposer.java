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
    private static Integer lastNote = 4;
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
        Integer thisNote = logString.length();
        if(thisNote > 6) 
            thisNote = thisNote%7;
        
        if (lastNote.equals(thisNote)){
            if (thisNote.equals(0))
                thisNote = 6;
            else
                thisNote--;
        }
        lastNote = thisNote;
        return sheet.get(thisNote);
    }
    
}
