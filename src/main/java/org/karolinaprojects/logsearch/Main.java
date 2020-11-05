package org.karolinaprojects.logsearch;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> result;
        List<String> text = null;
        try {
            text = FileUtil.read(args[0]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Parameter [PATH] is missing");
        }
        try {
            result = LogSearch.search(text, args[1]);
            result.forEach(System.out::println);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Parameter [KEYWORD] is missing");
        }
    }
}
