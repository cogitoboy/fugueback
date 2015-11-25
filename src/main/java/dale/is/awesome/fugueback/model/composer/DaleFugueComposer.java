/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dale.is.awesome.fugueback.model.composer;

import dale.is.awesome.fugueback.model.FugueComposer;
import dale.is.awesome.fugueback.model.FugueMusic;
import dale.is.awesome.fugueback.model.music.BasicMusic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 *
 * @author daleapplegate
 */
public class DaleFugueComposer implements FugueComposer {

    HashMap<String, String> loggerNotes = new HashMap<>();
    List<String> notes = new ArrayList<>();
    Random random = new Random();
     

    public DaleFugueComposer() {
        notes.add("Dq");
        notes.add("D#q");
        notes.add("Eq");
        notes.add("Fq");
        notes.add("F#q");
        notes.add("Gq");
        notes.add("G#q");
        
    }
    
    @Override
    public boolean isComposer(String composerName) {
        return "dale".equalsIgnoreCase(composerName);
    }

    @Override
    public FugueMusic compose(int instrument,String logName, String logString) {
        
        String music = "V0 T250 I"+ instrument;
        
        //Get the instrument and the log
//        if(!loggerNotes.containsKey(logName)) {
            String note = " " + notes.get(random.nextInt(6));
//            loggerNotes.put(logName, note);
//        } 
        
//        music = music + loggerNotes.get(logName);
        
         music = music + note;
        //get the log note
        
        String messageNote = notes.get(random.nextInt(6));
        messageNote = " + " + messageNote + "q | ";
        
        music = music + messageNote;
        
        
        return new BasicMusic(music);
    }
    
}
