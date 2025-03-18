package Assignment;

public class Main {
    public static void main(String[] args) {
        Song song = new Song("1", "Bohemian Rhapsody", "1975", "bohemian.mp3");
        song.setGenre(Genre.ROCK);

        Album album = new Album("A Night at the Opera", "cover.jpg");
        song.setAlbum(album);

        Artist artist = new Artist("Queen", "Freddie Mercury", "queen.jpg");
        song.setArtist(artist);

        song.printInfo();
    }
}
