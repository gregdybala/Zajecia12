package day3.generic;

import java.math.BigDecimal;

public class MainGeneric {

    private void sample() {
        Book book = new Book();
        book.setTitle("Szczęki");
        String bookTitle = (String) book.getTitle();
        System.out.println(bookTitle);
        System.out.print("Tu jest wywołanie polecenia book.printTitle():  ");
        book.printTitle();


        Book<String> book2 = new Book<>();
        book2.setTitle("Kosmos");
        String bookTitle2 = book2.getTitle();
        System.out.println(bookTitle2);
        book2.printTitle();

        Book<Cover> book3 = new Book<>();
        book3.setTitle(new Cover());
        book3.printTitle();
    }

    private void sampleCalculator() {
        Calculator<Integer> calcInteger = new Calculator<>(37);
        System.out.println(calcInteger.add(3));
        Calculator<Double> calcDouble = new Calculator<>(5.23);
        System.out.println(calcDouble.add(3d));
        Calculator<BigDecimal> calcBigDecimal = new Calculator<>(new BigDecimal(100));
        System.out.println(calcBigDecimal.add(new BigDecimal(50.5)));

        //           ???????????
        //       ????????????
//        System.out.println("ODEJMOWANIE");
//        System.out.println(calcInteger.subtract(3));
//        System.out.println(calcDouble.subtract(3d));
//        System.out.println(calcBigDecimal.subtract(20.32));

    }

    private <T,S> T sampleGeneric (T something, S something1) {
        if (something instanceof Integer && something1 instanceof Integer) {
            // Rzutujemy typ T i S (something i something1) na typ Integer, następnie dodajemy je i całość
            // rzutujemy na Integer
            // i następnie na typ zwracany T.
           return (T) ((Integer) (((Integer)something).intValue() + ((Integer) something1).intValue()));
        }
        if (something instanceof Double && something1 instanceof Double) {
            Double a = (Double)something;
            Double b = (Double) something1;
            return (T) ((Double)(a + b));
        }
        return something;
    }


    public static void main(String[] args) {

        MainGeneric mainGeneric = new MainGeneric();
        mainGeneric.sample();
        mainGeneric.sampleCalculator();
        System.out.println(mainGeneric.sampleGeneric(2, 3));
        System.out.println(mainGeneric.sampleGeneric(3.45, 4.67));

    }
}
