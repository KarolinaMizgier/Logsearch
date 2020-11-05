package org.karolinaprojects.logsearch;

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
        System.out.println(" Search results: " + listClone.size());
        return listClone;
    }
}
