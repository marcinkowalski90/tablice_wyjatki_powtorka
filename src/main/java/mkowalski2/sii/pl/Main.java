package mkowalski2.sii.pl;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[random.nextInt(100)];
        int[] staraTablica = fillTheArray(array);
        int[] nowaTablica = theMethod(staraTablica, random.nextInt(1), random.nextInt(10));
        printArray(nowaTablica);
    }

    public static int[] fillTheArray(int[] arrayToFill) {
        for (int i = 0; i < arrayToFill.length; i++) {
            //wypełnienie tablicy
            arrayToFill[i] = i;
        }
        return arrayToFill;
    }


    public static int[] theMethod(int[] t, int start, int end) {

        //wyciągnąć podzbiór

        if (t.length < 1) {
            throw new RuntimeException("Tablica jest pusta!!!"); //1.
        }
        if (start > end) {
            throw new RuntimeException("Start nie może być większy od końca!");
        }
        if (t.length <= end || t.length <= start) {
            throw new RuntimeException("Indeks poza zakresem !!!"); //2.
        }
        int [] newInts = new int[end - start + 1];
        int j = 0; // zmienna pomocnicza przypisuje wartości od początku tablicy
        for (int i = start; i <= end; i++){
            newInts[j++] = t[i];
        }
        return newInts;
    }
public static void printArray(int[] t){
        for (int i : t){
            System.out.print(i + ',');
        }
    }

    //1. sprawdź, czy tablica jest niepusta,
    //1a. obsłużyć wyjątek, gdy tablica jest pusta,
    //2. sprawdź, czy tablica zawiera indeksy z parametrów,
    //3. utwórz nową tablicę o długości (end - start) +1,
    //4. przekopiuj elementy ze starej tablicy wartości do nowej.

}



