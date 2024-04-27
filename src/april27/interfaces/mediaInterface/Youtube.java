package april27.interfaces.mediaInterface;

public class Youtube implements AudioMediaPlayer,VideoMediaPlayer{

    @Override
    public boolean offlinePlayList() {
        System.out.println("user don't have offline playlist");
        return false;
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
        System.out.println("cannot create a caption, use premium for caption");
        return false;
    }
}
