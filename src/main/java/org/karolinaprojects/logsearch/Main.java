package org.karolinaprojects.logsearch;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> Text = FileUtil.read("src/main/resources/Text");
        List<String> result = LogSearch.search(Text,"mailbox");
        result.forEach(System.out::println);

        // zliczanie ilosci wystapien danego wyrazenia w tekscie
    }
}
