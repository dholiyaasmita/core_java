package april27.interfaces.mediaInterface;

public class Spotify implements AudioMediaPlayer,VideoMediaPlayer{
    @Override
    public boolean offlinePlayList() {
        System.out.println("user has offline playlist");
        return true;
    }

    @Override
    public void playSong() {

    }

    @Override
    public void pauseSong() {

    }

    @Override
    public void nextSong() {

    }

    @Override
    public void previousSong() {

    }

    @Override
    public void resumeSong() {

    }

    @Override
    public void stopSong() {

    }

    @Override
    public boolean generateCaption() {
        return false;
    }
}
