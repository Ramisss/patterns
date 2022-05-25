package by.epam.taskThree.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchingArray {

     static Logger logger = LogManager.getLogger();


    public int linearSearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public void binarySearch(int arr[], int first, int last, int key) {
        SortingArray sortingArray = new SortingArray();
        sortingArray.selectionSort(arr);

        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                logger.log(Level.INFO, "Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            logger.log(Level.ERROR, "Element is not found!");
        }
    }
}
