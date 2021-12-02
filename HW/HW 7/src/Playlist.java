import java.util.ArrayList;

public class Playlist {

    private String playlistTitle;
    private ArrayList<Song> songs;

    public Playlist(String playlistTitle){
        this.playlistTitle = playlistTitle;
        this.songs = new ArrayList<Song>();
    }

    public String getPlaylistTitle(){
        return playlistTitle;
    }

    public void setTitle(String playlistTitle){
        this.playlistTitle = playlistTitle;
    }

    public ArrayList<Song> getSongs(){
        return songs;
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void removeSong(String songTitle) {
        for (int i = 0; i < songs.size(); i++)
            if (songTitle.equals(songs.get(i).getSongName())){
                songs.remove(i);
                return;
            }
    }

    public void swapSongs(Song song1, Song song2){
        if (songs.contains(song1) && songs.contains(song2)){
            int temp = songs.indexOf(song2);
            songs.set(songs.indexOf(song1),song2);
            songs.set(temp,song1);
        }
    }

    public String getDuration(){
        int totalMinutes = 0;
        int totalSeconds = 0;
        for (Song song:songs) {
            String[] timeArr = song.getDuration().split(":");
            totalMinutes += Integer.parseInt(timeArr[0]);
            totalSeconds += Integer.parseInt(timeArr[1]);
        }
        while (totalSeconds > 60) {
            totalSeconds -= 60;
            totalMinutes++;
        }
        return totalMinutes + " min, " + totalSeconds + " sec";
    }

    public void sortSongs(){

        for (int i = 0; i < songs.size(); i++){
            Song min = songs.get(i);
            int minIndex = i;
            for (int j = i + 1; j < songs.size(); j++)
                if (min.compareTo(songs.get(j)) > 0) {
                    minIndex = j;
                    min = songs.get(j);
                }
            if (minIndex != i){
                songs.set(minIndex, songs.get(i));
                songs.set(i, min);
            }
        }
    }

    public String toString(){
        String desc = playlistTitle + " - " + getDuration() + "\n\n";
        for (int i = 0; i < songs.size(); i++)
            desc += "\t" + (i + 1) + ". " + songs.get(i).toString() + "\n\n";
        return desc;
    }


}
