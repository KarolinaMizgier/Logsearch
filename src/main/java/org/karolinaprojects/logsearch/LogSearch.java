package org.karolinaprojects.logsearch;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class LogSearch {
    public static List<String> search(List<String> list, String key) {
        List<String> listClone = new ArrayList<>();
        for(int i=0; i < list.size(); i++){
            String line = list.get(i);
        if (line.contains(key)) {
                listClone.add(line + " | line number: " +i);
            }
        }

        return listClone;
    }
}
