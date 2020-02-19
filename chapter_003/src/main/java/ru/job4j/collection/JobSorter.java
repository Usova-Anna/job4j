package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 1),
                new Job("Reboot server", 2),
                new Job("Fix bug", 3),
                new Job("X task", 0)
                                      );
        System.out.println("Initial collection\n"+jobs);
        Collections.sort(jobs);
        System.out.println("\nCollection after sorting using Comparable interface\n"+jobs);

        Collections.sort(jobs, new SortByNameJob());
        System.out.println("\nCollection after using Comparator SortByNameJob\n"+jobs);

        Collections.sort(jobs,new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println("\nCollection after using two Comparators"+jobs);

    }
}
