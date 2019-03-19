package data;

import java.util.ArrayList;

/**
 * Created by asus on 2018/9/14.
 */

public class MusicList {
    private static ArrayList<Music> musicarry = new ArrayList<Music>();
    public MusicList(){}
    public static ArrayList<Music> getMusicList()
    {
        return musicarry;
    }
}
