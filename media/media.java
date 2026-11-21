import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считать входные данные
        String songTitle = scanner.nextLine();
        String artistName = scanner.nextLine();
        String podcastTitle = scanner.nextLine();
        int episodeNumber = scanner.nextInt();

        // Создать Song и выполнить upcast к ссылке Media
        Media mediaSong = new Song(songTitle, artistName);
        // Вызвать play() на ссылке Media (демонстрирует полиморфизм)
        mediaSong.play();

        // Выполнить downcast ссылки Media обратно к Song
        Song song = (Song) mediaSong;
        // Вызвать showArtist() на ссылке Song
        song.showArtist();

        // Создать Podcast и выполнить upcast к ссылке Media
        Media mediaPodcast = new Podcast(podcastTitle, episodeNumber);
        // Вызвать play() на ссылке Media
        mediaPodcast.play();

        // Выполнить downcast ссылки Media обратно к Podcast
        Podcast podcast = (Podcast) mediaPodcast;
        // Вызвать showEpisode() на ссылке Podcast
        podcast.showEpisode();

        scanner.close();
    }
}
