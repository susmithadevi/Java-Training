package Day10;
/* Loosely Coupled Music Player using Interface */

interface MusicDevice {
    void play();
}

class Spotify implements MusicDevice {
    public void play() {
        System.out.println("Playing from Spotify");
    }
}

class YouTubeMusic implements MusicDevice {
    public void play() {
        System.out.println("Playing from YouTube Music");
    }
}

class MusicPlayer {
    MusicDevice device;

    MusicPlayer(MusicDevice device) {
        this.device = device;
    }

    void start() {
        device.play();
    }
}

public class MusicDemo {
    public static void main(String[] args) {
        MusicPlayer p1 = new MusicPlayer(new Spotify());
        p1.start();

        MusicPlayer p2 = new MusicPlayer(new YouTubeMusic());
        p2.start();
    }
}
