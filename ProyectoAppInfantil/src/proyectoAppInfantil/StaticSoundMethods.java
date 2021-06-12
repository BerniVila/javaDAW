package proyectoAppInfantil;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;

public class StaticSoundMethods {

	
public static void playSound(File soundFile) {
	try {
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
	} catch (Exception ex) {
		System.out.println("Error with playing sound.");
		ex.printStackTrace();
	}
}


public static void muteSound() {
	try {
		Clip clip = AudioSystem.getClip();
		FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		gainControl.setValue(-2000.0f); // Reduce volume by 10 decibels.
	} catch (Exception ex) {
		System.out.println("Error with playing sound.");
		ex.printStackTrace();
	}
}


public static void raiseVolume(File soundFile) {
	try {
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		gainControl.setValue(+10.0f); // Reduce volume by 10 decibels.
	} catch (Exception ex) {
		System.out.println("Error with playing sound.");
		ex.printStackTrace();
	}
}



public static void lowerVolume(File soundFile) {
	try {
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		gainControl.setValue(-20.0f); // Reduce volume by 10 decibels.
	} catch (Exception ex) {
		System.out.println("Error with playing sound.");
		ex.printStackTrace();
	}
}





	
}
