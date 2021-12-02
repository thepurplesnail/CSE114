import java.util.ArrayList;
public class SongLibrary {

    private static ArrayList<User> users = new ArrayList<User>();

    public static void addUser(User user){
        users.add(user);
    }
    public void removeUser(String userName){
        for (int i = 0; i < users.size(); i++)
            if (users.get(i).getUsername().equals(userName)) {
                users.remove(i);
                return;
            }
    }
    public static ArrayList<Playlist> getUserPlaylists(User user){
        for (int i = 0; i < users.size(); i++)
            if (users.get(i).getUsername().equals(user.getUsername()))
                return users.get(i).getPlaylists();
        return new ArrayList<Playlist>();
    }
}
