import java.lang.reflect.Array;
import java.util.ArrayList;
public class User {
    private String userName;
    private ArrayList<Playlist> playlists;

    public User(String userName){
        this.userName = userName;
        this.playlists = new ArrayList<Playlist>();
    }

    public String getUsername(){
        return userName;
    }

    public void addPlaylist(Playlist playlist){
        playlists.add(playlist);
    }

    public void removePlaylist(String title){
        for (int i = 0; i < playlists.size(); i++)
            if (playlists.get(i).getPlaylistTitle().equals(title)) {
                playlists.remove(i);
                return;
            }
    }

    public ArrayList<Playlist> getPlaylists(){
        return playlists;
    }

    public Playlist getPlaylist(String title){
        for (int i = 0 ; i < playlists.size(); i++)
            if (playlists.get(i).getPlaylistTitle().equals(title))
                return playlists.get(i);
        return new Playlist(null);
    }

    public void makeCollaborativePlaylist(String playlistTitle, User friend){
        friend.addPlaylist(this.getPlaylist(playlistTitle));
    }

    public String toString(){
        String desc = "";
        for (int i = 0; i < playlists.size(); i++) {
            desc += playlists.get(i).toString() + "\n";
        }
        return desc;
    }
}
