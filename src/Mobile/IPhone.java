package Mobile;

public class IPhone extends SmartPhone implements MediaPlayer, GPS {
	public void installApplication(String appName) {
		System.out.println("Install :" + appName);
	}
	public String playSong(String songName) {
		return songName;
	}
	public String playVideo(String videoName) {
		return videoName;
	}
	public String getLocation() {
		return "Nan";
	}
}
