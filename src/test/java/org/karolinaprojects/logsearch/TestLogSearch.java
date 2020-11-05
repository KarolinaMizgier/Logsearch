package org.karolinaprojects.logsearch;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestLogSearch {
    private static final String LOG_PATH = "src/test/resources/Text";
    private static final String EXPECTED_RESULTS = "src/test/resources/ExpectedResults";

    @Test
    public void testResultsEquality() {
       List<String> Text = FileUtil.read(LOG_PATH);
       List<String> expectedResults = FileUtil.read(EXPECTED_RESULTS);
       List<String> results = LogSearch.search(Text, "mailbox");
       assertEquals(expectedResults,results);
    }

    @Test
    public void testLineCount(){
        List<String> Text = FileUtil.read(LOG_PATH);
        List<String> expectedResults = FileUtil.read(EXPECTED_RESULTS);
        List<String> results = LogSearch.search(Text, "mailbox");
        assertEquals(expectedResults.size(),results.size());
    }
}