
package dale.is.awesome.fugueback.model.composer;

import dale.is.awesome.fugueback.model.FugueComposer;
import dale.is.awesome.fugueback.model.FugueMusic;
import dale.is.awesome.fugueback.model.music.BasicMusic;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daleapplegate
 */
public class RachmaninoffFugueComposer implements FugueComposer {

    private List<String> sheet = new ArrayList<>();
    private static Integer lastNote = 4;
    public RachmaninoffFugueComposer() {
        sheet.add("A");
        sheet.add("B");
        sheet.add("C");
        sheet.add("D");
        sheet.add("E");
        sheet.add("F");
        sheet.add("G");
        
    }
    @Override
    public FugueMusic compose(String logString) {
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
        
        return new BasicMusic(sheet.get(thisNote));
        
    }
    
    @Override
    public boolean isComposer(String composerName) {
        return "Rachmaninoff".equalsIgnoreCase(composerName);
    }
    
}
