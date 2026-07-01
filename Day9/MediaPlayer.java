package Day9;
/* Media Player (Runtime Polymorphism) */

class Media {

    void play() {
        System.out.println("Playing Media");
    }
}

class Audio extends Media {

    void play() {
        System.out.println("Playing Audio");
    }
}

class Video extends Media {

    void play() {
        System.out.println("Playing Video");
    }
}

public class MediaPlayer {

    public static void main(String[] args) {

        Media m;

        m = new Audio();
        m.play();

        m = new Video();
        m.play();
    }
}
