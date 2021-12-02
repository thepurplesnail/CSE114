public class Song implements Comparable{
    private String songName, artistName, duration;

    public Song(String songName, String artistName, String duration){
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }

    public String getSongName(){
        return songName;
    }

    public String getArtistName(){
        return artistName;
    }

    public String getDuration(){
        return duration;
    }

    public void setSongName(String songName){
        this.songName = songName;
    }

    public void setArtistName(String artistName){
        this.artistName = artistName;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }

    public int compareTo(Object o){
        for (int i = 0; i < (Math.min(songName.length(), ((Song) o).songName.length())); i++){
            if (songName.charAt(i) > ((Song)o).songName.charAt(i))
                return 1;
            else if (songName.charAt(i) < ((Song)o).songName.charAt(i))
                return -1;
        }
        if (songName.length() > ((Song)o).getSongName().length())
            return 1;
        else if (songName.length() < ((Song)o).getSongName().length())
            return -1;
        else{
            for (int i = 0; i < (Math.min(artistName.length(), ((Song) o).artistName.length())); i++){
                if (artistName.charAt(i) > ((Song)o).artistName.charAt(i))
                    return 1;
                else if (artistName.charAt(i) < ((Song)o).artistName.charAt(i))
                    return -1;
            }
            if (songName.length() > ((Song)o).getSongName().length())
                return 1;
            else if (songName.length() < ((Song)o).getSongName().length())
                return -1;
            else
                return 0;
        }
    }

    public String toString(){
        return songName + " by " + artistName + " (" + duration + ")";
    }
}
