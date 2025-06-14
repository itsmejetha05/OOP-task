package AbstractionConcept;

// Abstract class
abstract class MediaPlayer {
    //abstract methods
    abstract void play();
    abstract void pause();
    //concrete class
    void stop() {
        System.out.println("Stopped");
    }
}

// Interface
interface PlayList {
    void addSong(String song);
    void removeSong(String song);
}

// Concrete class implementing interface and extending abstract class
class VideoPlayer extends MediaPlayer implements PlayList {
    private java.util.ArrayList<String> playlist = new java.util.ArrayList<>();

    @Override
    void play() {
        System.out.println("Playing video");
    }

    @Override
    void pause() {
        System.out.println("Video paused");
    }

    void rewind() {
        System.out.println("Rewinding video");
    }

    void fastForward() {
        System.out.println("Fast forwarding video");
    }

    @Override
    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Added song: " + song);
    }

    @Override
    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Removed song: " + song);
        } else {
            System.out.println("Song not found: " + song);
        }
    }

    void showPlaylist() {
        System.out.println("Playlist: " + playlist);
    }
}

// Main class
public class Media_Player {
    public static void main(String[] args) {
        VideoPlayer vp = new VideoPlayer();

        // MediaPlayer methods
        vp.play();
        vp.pause();
        vp.stop();
        vp.rewind();
        vp.fastForward();

        // Playlist methods
        vp.addSong("Song A");
        vp.addSong("Song B");
        vp.addSong("Song C");
        vp.showPlaylist();
        vp.removeSong("Song B");
        vp.showPlaylist();
    }
}
