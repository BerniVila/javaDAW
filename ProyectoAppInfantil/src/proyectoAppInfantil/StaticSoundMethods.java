package proyectoAppInfantil;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import mainWindows.MainScreen;

public class StaticSoundMethods {
	
	
	
	public static void playSound(JFrame frame, String audioFileUrl) {
		File soundFile = new File(audioFileUrl);
		boolean muted = false;
		float volume;
		
		
		
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-20.0f);
			volume = gainControl.getValue();
			float lastVolume = volume;
			
			
//			btnMute.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					if (muted) {
//						gainControl.setValue(lastVolume);
//						muted = false;
//						
//					}
//					else {
//						gainControl.setValue(-80.0f);
//						muted = true;
//					}
//					
//				}
//			});
//			
//			
//			btnRaiseVolume.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					volume = gainControl.getValue();
//					volume += 2.5;
//					if (volume >= 5.0) {
//						volume = 5;
//					}
//					gainControl.setValue(volume);					
//				}
//			});
//			
//			
//			btnLowerVolume.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					volume = gainControl.getValue();
//					volume -= 10;
//					if (volume <= -80) {
//						volume = -80;
//					}
//					gainControl.setValue(volume);
//				}
//			});
			
			
		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
		
	}
	
	

	
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


public static void stopSound(File soundFile) {
	try {
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.stop();
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
