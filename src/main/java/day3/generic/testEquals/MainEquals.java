package day3.generic.testEquals;

import java.util.ArrayList;
import java.util.List;

public class MainEquals {

    List<String> listOfStrings = new ArrayList<>();
    String word = "start937";

    private void createList() {
        int maxValue = 1000000;
        String slowo = "start";
        long st1 = System.currentTimeMillis();
        for (int i = 0; i <= maxValue; i++ ) {
            listOfStrings.add(slowo+(i));
//            System.out.println(i + " , " + slowo);
        }
        long kon1 = System.currentTimeMillis();
        long wyn1 = kon1 - st1;
        System.out.println(st1);
        System.out.println(kon1);
        System.out.println("Czas trwania = " + wyn1);
    }


    private void test1() {
        long start = System.currentTimeMillis();
        long stop = 0;

        for (String slowo : listOfStrings) {
            if (slowo == word) {
                stop = System.currentTimeMillis();
                break;
            }
        }
        System.out.println("== " + (stop - start));
    }


    private void test2() {
        long start = System.currentTimeMillis();
        long stop = 0;

        for (String slowo : listOfStrings) {
            if (slowo.equals(word)) {
                stop = System.currentTimeMillis();
                break;
            }
        }
        System.out.println("Equals " + (stop - start));
    }

    private void test3() {
        long start = System.currentTimeMillis();
        long stop = 0;

        for (String slowo : listOfStrings) {
            if (slowo.intern()==word.intern()) {
                stop = System.currentTimeMillis();
                break;
            }
        }
        System.out.println("INTERN " + (stop - start));
    }

    public static void main(String[] args) {
        MainEquals mainEquals = new MainEquals();
        mainEquals.createList();
        mainEquals.test1();
        mainEquals.test2();
        mainEquals.test3();
    }
}
