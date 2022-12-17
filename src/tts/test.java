/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tts;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
/**
 *
 * @author d06.liu
 */
public class test {
    public static void main(String[] args) {
    
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");
        
        Voice []voicelist = VoiceManager.getInstance().getVoices();
        for (Voice name : voicelist){
            System.out.println("# Voice: " + name.getName());

        }
        if(voice != null){
            voice.allocate();
            System.out.println("Voice Rate: " + voice.getRate());
            System.out.println("Voice Pitch: " + voice.getPitch());
            System.out.println("Voice Volume:" + voice.getVolume());
            boolean status = voice.speak(" Mr. and Mrs. Dursley, of number four, Privet Drive, were \n" +
"proud to say that they were perfectly normal, thank \n" +
"you very much. they were the last people you’d expect to be involved in anything strange or mysterious, because they just didn’t \n" +
"hold with such nonsense.");
            System.out.println("Status: " + status);
            voice.deallocate();
        }
        else{
            System.out.println("Error in getting names.");
        }
    }
}
