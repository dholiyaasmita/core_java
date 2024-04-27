package april27.interfaces.mediaInterface;

public class YoutubePremium extends Youtube{
    @Override
    public boolean offlinePlayList() {
        return super.offlinePlayList();
    }

    @Override
    public void playSong() {
        super.playSong();
    }

    @Override
    public void pauseSong() {
        super.pauseSong();
    }

    @Override
    public void nextSong() {
        super.nextSong();
    }

    @Override
    public void previousSong() {
        super.previousSong();
    }

    @Override
    public void resumeSong() {
        super.resumeSong();
    }

    @Override
    public void stopSong() {
        super.stopSong();
    }

    @Override
    public boolean generateCaption() {
        System.out.println("User has premium access, can create a caption.");
        return true;
    }
}
