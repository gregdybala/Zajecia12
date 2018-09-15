package bookStore.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainListTest {

    private String[] table;
    String testString = "test";

    // za kazdym razzem object powinien być chyba jako nowy
    @Before
    public void createList() {
        table = new String[1];
        table[0] = testString;
        System.out.println("Uruchamiam Before");
    }

    // AssertEquals porownuje nam obiekty
    @Test
    public void addTest() {
        MainList<String> mainList = new MainList<>();
        mainList.add(testString);
        // assertEquals sprawdza, czy table jest równy mainList.getTable
        assertArrayEquals(table, mainList.getTable());
    }

    @Test
//    @Ignore
    public void addCheckSizeTest() {
        MainList<String> mainList = new MainList<>();
        mainList.add(testString);
        mainList.add(testString);
        mainList.add(testString);
        int mainListLength = mainList.getTable().length;
        assertEquals(3, mainListLength);
    }


    @After
    public void emptyList() {
        table = new String[0];
        System.out.println("Uruchamiam After");
    }
}