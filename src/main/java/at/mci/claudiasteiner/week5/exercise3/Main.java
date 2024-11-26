package at.mci.claudiasteiner.week5.exercise3;

import java.util.Arrays;

// Hauptklasse zur Ausführung des Sortierprogramms
public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();

        // Erstellen eines Integer-Arrays
        int[] array = {5, 3, 8, 4, 2, 7, 1, 10};

        // Bubble Sort-Strategie anwenden
        sorter.setSortStrategy(new BubbleSort());
        sorter.sort(array.clone());  // Array klonen, damit das Original nicht verändert wird
        System.out.println("Bubble Sort: " + Arrays.toString(array));

        // Quick Sort-Strategie anwenden
        sorter.setSortStrategy(new QuickSort());
        sorter.sort(array.clone());
        System.out.println("Quick Sort: " + Arrays.toString(array));

        // Insertion Sort-Strategie anwenden
        sorter.setSortStrategy(new InsertionSort());
        sorter.sort(array.clone());
        System.out.println("Insertion Sort: " + Arrays.toString(array));
    }
}