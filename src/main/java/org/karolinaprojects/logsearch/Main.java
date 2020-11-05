package org.karolinaprojects.logsearch;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> Text = FileUtil.read(args[0]);
        List<String> result = LogSearch.search(Text,args[1]);
        result.forEach(System.out::println);
    }
}
