package bookStore.utils;

public class MainList<T> {
    // tu będzie lista do przechowywania książek i autorów

    private Object[] table = new Object[0];

    // metoda, która dodaje jeden element do tabeli
    // przepisujemy sztuka po sztuce elementy pomiędzy tabelami
    public void add (T item) {
        increaseTable();
        table[table.length - 1] = item;
    }

    // metoda do zwiększania tabeli o "jeden"
    private void increaseTable() {
        Object[] tempTable = new Object[table.length + 1];
        for (int i = 0; i < table.length; i++) {
            tempTable[i] = table[i];
        }
        table = tempTable;
    }

    public void remove (int index) {
        if (index >= table.length) {
            throw new IllegalArgumentException("Za duża liczba, tabela nie posiada tylu rekordów");
        }
        int i = 0;
        int j = 0;

        Object[] tempTable = new Object[table.length - 1];
        //  TODO:  to trzeba dokończyć
    }

    public T getItem (int index) {
        return (T) table[index];
    }



    public T[] getTable() {
        return (T[]) table;
    }

}
