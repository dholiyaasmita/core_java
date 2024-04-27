package april27.interfaces.mediaInterface;

public class MainMediaPlayer {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new Youtube();
        mediaPlayer.nextSong();

        AudioMediaPlayer spotify = new Spotify();
        spotify.offlinePlayList();

    }
}
