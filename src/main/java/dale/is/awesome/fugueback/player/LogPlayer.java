
package dale.is.awesome.fugueback.player;
import org.jfugue.player.Player;
/**
 *
 * @author daleapplegate
 */
public class LogPlayer {
    
    Player player = new Player();
    public static final int MAX_MIDI_VOICES = 16;
	protected int counts[][] = new int[2][MAX_MIDI_VOICES];
    
    
    public void play(String logString) {
        String instrumentName = "Piano";
        Integer voiceNumber = 1;
        Integer count = 3;
        String musicString = buildVoiceString(instrumentName, voiceNumber, count);
        player.play(musicString);
    }
    
  
    
    private String buildVoiceString(String instrumentName, Integer voiceNumber, Integer count) {
        String thisVoice = null;
        if (count > 0) {
            thisVoice = String.format("V%d I[%s] %s ", voiceNumber, instrumentName, buildTempoString(voiceNumber, count));
        } else {
            thisVoice = " ";
        }
        return (thisVoice);
    }
    
    private String buildTempoString(Integer voiceNumber, Integer count) {
        String note;
        String tempo = "w";
        if (count > 1) {
            tempo = "q";
        } else if (count > 0) {
            tempo = "h";
        }

        switch (voiceNumber) {
            case 0:
                note = "A6";
                break;
            case 1:
                note = "B6";
                break;
            case 2:
                note = "C6";
                break;
            default:
                note = "F6";
        }
        String thisString = "";
        for (int x = 0; x < count; x++) {
            thisString += note + tempo + " ";
        }
        return (thisString);
    }
}
