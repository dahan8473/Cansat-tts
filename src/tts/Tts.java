/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tts;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;


public class Tts {

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
            boolean status = voice.speak("Hello, wrld.");
            System.out.println("Status: " + status);
            voice.deallocate();
        }
        else{
            System.out.println("Error in getting names.");
        }

    }
    
}
