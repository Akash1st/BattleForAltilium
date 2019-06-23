package com.myapp.level;

import com.myapp.objects.*;

import java.io.*;
import java.util.ArrayList;

public class Level {
    //private static int level = 0;
    private ArrayList<ArrayList<MapObject>> map;
    private StringBuilder path;
    public Level() {
        path = new StringBuilder("src/assets/maps/level1.map");
        map = new ArrayList<>();
        parseMap();
    }

    private void parseMap() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toString()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                ArrayList<MapObject> lineMap = new ArrayList<>();
                for (int i = 0; i < line.length(); i += 3) {
                    String elem = line.substring(i, i + 2);
                    if (elem.equals("TR")) {
                        lineMap.add(new Tree());
                        continue;
                    }
                    if (elem.equals("RO")) {
                        lineMap.add(new Rock());
                        continue;
                    }
                    if (elem.equals("GR")) {
                        lineMap.add(new Grass());
                        continue;
                    }
                    if (elem.equals("SH")) {
                        lineMap.add(new Warrior());
                        continue;
                    }
                    if (elem.equals("GY")) {
                        lineMap.add(new Warlord());
                        continue;
                    }
                    if (elem.equals("SO")) {
                        lineMap.add(new Orc());
                        continue;
                    }
                    if (elem.equals("MO")) {
                        lineMap.add(new LordOrc());
                    }
                }
                map.add(lineMap);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<ArrayList<MapObject>> getMap() {
        return map;
    }
}
