package org.karolinaprojects.logsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtil {
    public static List<String> read (String path){
        List<String> textList = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNext()){
                textList.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return textList;
    }

}
