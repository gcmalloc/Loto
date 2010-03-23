package GUI;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioReader {
	String mainPath;
	
	public AudioReader() {
		this.mainPath = "chiffres/";
	}
	
	public void read(int toRead) {
		String toReadString = new Integer(toRead).toString();
		File audioFile = new File(mainPath + toReadString + ".wav");
		AudioInputStream audioInput;
		SourceDataLine sourceDataLine;
		AudioFormat format;
		try {
			audioInput = AudioSystem.getAudioInputStream(audioFile);
		} catch (UnsupportedAudioFileException e) {
			System.out.println("Audio File not Read : UnsupportedAudioFileExeption");
			return;
		} catch (IOException e) {
			System.out.println("Audio File not Read: IOExeption");
			return;
		}
		format = audioInput.getFormat();
		 DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class,format);
		 try {
			sourceDataLine = (SourceDataLine)AudioSystem.getLine(dataLineInfo);
		} catch (LineUnavailableException e) {
			System.out.println("line unaivailavle exeption");
			return;
		}
		try {
			sourceDataLine.open(format);
			sourceDataLine.start();
			 int cnt;
			  byte tempBuffer[] = new byte[10000];
		      try {
				while((cnt = audioInput.read(
				       tempBuffer,0,tempBuffer.length)) != -1){
				    if(cnt > 0){
				      sourceDataLine.write(
				                         tempBuffer, 0, cnt);
				    }//end if
				  }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end while loop

		} catch (LineUnavailableException e) {
			System.out.println("line unaivable exception");
			return;
		}
	}
}
