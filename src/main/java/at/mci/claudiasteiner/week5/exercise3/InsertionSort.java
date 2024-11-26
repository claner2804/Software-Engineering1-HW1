package at.mci.claudiasteiner.week5.exercise3;

// Implementierung der Insertion Sort-Strategie
class InsertionSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Verschieben der größeren Elemente nach rechts
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
