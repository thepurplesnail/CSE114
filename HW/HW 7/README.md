### **Homework 7 (extra credit)**

Song.java (has strings for songName, artistName and duration)

Playlist.java (had a String playlistTitle and ArrayList  songs)

User (has a userName and ArrayList playlists)

SongLibrary.java (has an ArrayList  users)



**Description**

A library containing songs of all different genres has recently been created. Because of the popularity of this new library, users have been creating many playlists on this new platform. This library is called the SongLibrary. Inside the SongLibrary class, there is an ArrayList keeping track of all Users. The User class contains the user’s username and an ArrayList of all of the user’s Playlists. The Playlist class contains the playlist title and an ArrayList of Songs. Finally, the Song class contains songName, artistName, and duration of the song, all stored as Strings and all of which should have get methods.



Write the SongLibrary, User, Playlist, and Song classes.


In SongLibrary, you should be able to add and remove users. You should also be able to get all playlists of a specific user.



In User,  you should be able to:



-[ ] get the user’s username



-[ ] add playlists



-[ ] remove that specific playlist when given a String title of a playlist



-[ ] get all playlists belonging to the user



-[ ] get a playlist given the playlist title



-[ ] make a collaborative playlist by writing the method void makeCollaborativePlaylist(String playlistTitle, User friend), which allows a user to add a playlist of theirs to a friend’s list of playlists. Keep in mind that it should be the same object and not a copy. If the user or their friend updates the playlist, it should update on both the user’s end and their friend’s end.



In Playlist, you should be able to:



-[ ] get and set the playlist title



-[ ] add a song to the playlist



-[ ] remove a song given the song title (which will remove the first instance of the song title’s appearance)



-[ ] swap the position of two songs in the playlist by writing the method void swapSongs(Song song1, Song song2). If one or both of the songs do not exist in the playlist, then the swap does not occur.



-[ ] get the total time duration of the playlist, which is calculated by adding up the duration of all the songs and returns a String in the format of “totalMinutes min, totalSeconds sec”. You do not have to convert minutes to hours.



-[ ] sort songs in the playlist by songName, which should be done by implementing the Comparable interface in the Song class. If both songs have the same name, then sort based on artistName.




Lastly, the User, Playlist, and Song classes should also include toString() methods in order to produce the printed format shown in the example below.



**Examples**

    Playlist p0 = new Playlist("Study Songs");

    Song s1 = new Song("Studying1", "ABC", "3:00");

    Song s2 = new Song("Studying2", "XYZ", "4:50");

    p0.addSong(s1);

    p0.addSong(new Song("Studying3", "CDE", "2:50"));

    p0.addSong(new Song("Studying4", "EFG", "3:25"));



    Playlist p1 = new Playlist("Workout Songs");

    p1.addSong(new Song("Exercising1", "JKL", "3:00"));

    p1.addSong(new Song("Exercising2", "OPQRS", "2:50"));

    p1.addSong(new Song("Exercising3", "Wxyz", "4:35"));

    p1.addSong(new Song("Exercising3", "Stu", "3:25"));



    User u0 = new User("user0");

    User u1 = new User("user1");

    SongLibrary.addUser(u0);

    SongLibrary.addUser(u1);



    u0.addPlaylist(p0);

    u1.addPlaylist(p1);



    System.out.println("ORIGINAL STUDY SONGS PLAYLIST BY USER0:");
    
    for(Playlist p : SongLibrary.getUserPlaylists(u0)) {
    
    System.out.println(p);

    }



    System.out.println("ORIGINAL STUDY SONGS PLAYLIST BY USER1:");

    for(Playlist p : SongLibrary.getUserPlaylists(u1)) {

    System.out.println(p);

    }



    u0.makeCollaborativePlaylist("Study Songs", u1);

    u0.getPlaylist("Study Songs").setTitle("Study Songs with "+u1.getUsername());

    u1.getPlaylist("Study Songs with "+u1.getUsername()).removeSong("Studying4");

    u1.getPlaylist("Study Songs with "+u1.getUsername()).addSong(s2);

    u1.getPlaylist("Study Songs with "+u1.getUsername()).swapSongs(s1, s2);

    u1.getPlaylist("Study Songs with "+u1.getUsername()).swapSongs(new Song("Does Not Exist", "In Playlist", "5:00"), s2);



    System.out.println("UPDATED PLAYLISTS BY USER1:");

    for(Playlist p : SongLibrary.getUserPlaylists(u1)) {

    System.out.println(p);

    }



    u0.getPlaylist("Study Songs with "+u1.getUsername()).sortSongs();

    u1.getPlaylist("Workout Songs").sortSongs();

    System.out.println("AFTER SORTING BOTH PLAYLISTS:");

    for(Playlist p : SongLibrary.getUserPlaylists(u1)) {

        System.out.println(p);

    }


The above code should print out:

ORIGINAL STUDY SONGS PLAYLIST BY USER0:

Study Songs - 9 min, 15 sec

1. Studying1 by ABC (3:00)

2. Studying3 by CDE (2:50)

3. Studying4 by EFG (3:25)



ORIGINAL STUDY SONGS PLAYLIST BY USER1:

Workout Songs - 13 min, 50 sec

1. Exercising1 by JKL (3:00)

2. Exercising2 by OPQRS (2:50)

3. Exercising3 by Wxyz (4:35)

4. Exercising3 by Stu (3:25)



UPDATED PLAYLISTS BY USER1:

Workout Songs - 13 min, 50 sec

1. Exercising1 by JKL (3:00)

2. Exercising2 by OPQRS (2:50)

3. Exercising3 by Wxyz (4:35)

4. Exercising3 by Stu (3:25)



Study Songs with user1 - 10 min, 40 sec

1. Studying2 by XYZ (4:50)

2. Studying3 by CDE (2:50)

3. Studying1 by ABC (3:00)



AFTER SORTING BOTH PLAYLISTS:

Workout Songs - 13 min, 50 sec

1. Exercising1 by JKL (3:00)

2. Exercising2 by OPQRS (2:50)

3. Exercising3 by Stu (3:25)

4. Exercising3 by Wxyz (4:35)



Study Songs with user1 - 10 min, 40 sec

1. Studying1 by ABC (3:00)

2. Studying2 by XYZ (4:50)

3. Studying3 by CDE (2:50)

Extra credit: +4% in the final total points