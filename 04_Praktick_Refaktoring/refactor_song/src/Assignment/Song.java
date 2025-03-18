package Assignment;

public class Song {
    private String id;
    private String title;
    private String releaseYear;
    private String musicFileURL;
    private Genre genre;
    private Album album;
    private Artist artist;

    public Song(String id, String title, String releaseYear, String musicFileURL) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.musicFileURL = musicFileURL;
        this.genre = Genre.UNDEFINED;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void printInfo() {
        System.out.println("Song title: " + title);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Genre: " + genre);
        if (artist != null) {
            System.out.println("Artist: " + artist.getName() + " (aka " + artist.getAlias() + ")");
        }
        if (album != null) {
            System.out.println("Album: " + album.getName());
        }
    }
}
