package at.mci.claudiasteiner.week5.exercise3;

import java.util.Arrays;

// Klasse zur Implementierung der Sortierlogik, die unterschiedliche Strategien verwendet
class Sorter {
    private SortStrategy sortStrategy;

    // Setzen der Sortierstrategie (Bubble, Quick oder Insertion Sort)
    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    // Sortieren des Arrays anhand der aktuellen Strategie
    public void sort(int[] array) {
        if (sortStrategy != null) {
            sortStrategy.sort(array);
            System.out.println("Sortiertes Array: " + Arrays.toString(array));
        } else {
            System.out.println("Keine Sortierstrategie festgelegt.");
        }
    }
}
