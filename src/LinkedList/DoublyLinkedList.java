package LinkedList;

class Music {
    String name;
    String movie;
    String singer;
    String composer;

    Music(String name, String movie, String singer, String composer) {
        this.name = name;
        this.movie = movie;
        this.singer = singer;
        this.composer = composer;
    }
}

class PlayList {
    Music song;
    PlayList next;
    PlayList prev;

    PlayList(Music song) {
        this.song = song;
    }
}

public class DoublyLinkedList {
    public static PlayList addSong(PlayList head, Music song) {
        return new PlayList(song);
    }

    public static void main(String[] args) {


    }
}
