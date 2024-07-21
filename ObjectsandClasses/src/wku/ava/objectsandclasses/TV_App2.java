package wku.ava.objectsandclasses;
// Ye Cong 1306248
public class TV_App2 {

	public static void main(String[] args) {
		TV lg = new TV();
		lg.turnOn();
		lg.setChannel(30);
		lg.setVolume(3);
		
		TV sharp = new TV();
		sharp.turnOn();
		sharp.channelUp();
		sharp.volumeUp();
		
		TV sony = new TV();
		sony.turnOn();
		sony.setChannel(66);
		sony.setVolume(2);
		
		TV apple = new TV();
		apple.turnOn();
		apple.setChannel(77);
		apple.setVolume(2);
		
		System.out.println("LG's channel is " + lg.channel +" and volume level is " + lg.volumeLevel);
		System.out.println("Sharp's channel is " + sharp.channel +" and volume level is " + sharp.volumeLevel);
		System.out.println("SONY's channel is " + sony.channel +" and volume level is " + sony.volumeLevel);
		System.out.println("APPLE's channel is " + apple.channel +" and volume level is " + apple.volumeLevel);
		System.out.println("The number of objects created is now " + TV.getNumberOfObjects() );
	}

}
