package org.karolinaprojects.logsearch;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> Text = FileUtil.read("src/main/resources/Text");
        List<String> result = LogSearch.search(Text,"mailbox");
        result.forEach(line->
                System.out.println(line)
                );



        // zliczanie ilosci wystapien danego wyrazenia w tekscie
        // wyswietlanie całej linii tekstu z frazą oraz numeru linii
    }
}
