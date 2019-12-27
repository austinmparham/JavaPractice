import java.util.HashMap;
import java.util.Set;

public class HashMapSongs{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Stretch before Walking","Did my knee always make that noise?...");
        trackList.put("Song B","This is a story all about how..");
        trackList.put("Song C","I see no changes...");
        trackList.put("Song D","I swear to God I wasn't born to fight...");
        System.out.println(trackList.get("Stretch before Walking"));

        Set<String> Lyrics = trackList.keySet();
        for(String Track : Lyrics){
            System.out.println(Track);
            System.out.println(trackList.get(Track));
        }
    }
}