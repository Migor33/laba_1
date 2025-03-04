package com.person.sorts;

import com.person.MyRepository;
import com.person.personInterface.SortInterface;

import java.util.Comparator;

/**
 * Bubble Sort.
 * @param <T> Type of repository elements.
 */
public class BubbleSort<T> implements SortInterface<T> {

    /**
     * sort repository by Bubble sort.
     * @param comparator comparator.
     * @param myRepository repository.
     */
    @Override
    public final void sort(final Comparator<T> comparator,
                           final MyRepository<T> myRepository) {
        for (int i = 0; i < myRepository.length() - 1; i++) {
            for (int j = 0; j < myRepository.length() - i - 1; j++) {
                if (comparator.compare(myRepository.get(j),
                                       myRepository.get(j + 1)) > 0) {
                    T temp = myRepository.get(j);
                    myRepository.set(j, myRepository.get(j + 1));
                    myRepository.set(j + 1, temp);
                }
            }
        }
    }
}
