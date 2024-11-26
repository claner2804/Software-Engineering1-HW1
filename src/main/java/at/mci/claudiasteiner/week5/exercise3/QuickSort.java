package at.mci.claudiasteiner.week5.exercise3;

// Implementierung der Quick Sort-Strategie
class QuickSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    // Rekursive Methode für Quick Sort
    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            // Sortieren der Teilarrays
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Hilfsmethode zur Partitionierung des Arrays
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            // Wenn das aktuelle Element kleiner oder gleich dem Pivot ist
            if (array[j] <= pivot) {
                i++;

                // Vertauschen der Elemente
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Vertauschen des Pivots an die richtige Position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
