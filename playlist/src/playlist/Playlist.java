package playlist;

import java.util.*;

class Playlist implements IComponent {

	public String playlistName;
	public String songName;
	public ArrayList<IComponent> playlist = new ArrayList<>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	public void play() {
		String p = songName;
		int i = 0;
		while (i < playlist.size()) {
			IComponent var = playlist.get(i);
			var.play();
			System.out.println("You are listening to" + p);
			i++;
		}
	}

	public void setPlaybackSpeed(float speed) {
		System.out.println("Speed: " + speed);
		int s = 0;
		while (s < playlist.size()) {
			IComponent song = playlist.get(s);
			song.setPlaybackSpeed(speed);
			s++;
		}
	}

	public String getName() {
		return playlistName;
	}

	public void add(IComponent song) {
		playlist.add(song);
	}

	public void remove(IComponent song) {
		playlist.remove(song);
	}

}