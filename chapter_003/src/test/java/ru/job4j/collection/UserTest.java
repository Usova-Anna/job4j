package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {
    @Test
    public void whenAsk() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePetrVSIvan() {
        int rsl = new User("Petr", 32).compareTo(new User("Ivan", 31));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAscending() {
        Comparator<User> cmpNameAsc = new UserByNameAZ();
        int rsl = cmpNameAsc.compare(new User("Таня", 55), new User("Вася", 55));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameDescending() {
        Comparator<User> cmpNameDesc = new UserByNameZA();
        int rsl = cmpNameDesc.compare(new User("Игорь", 55), new User("Инга", 55));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByAgeAscending() {
        Comparator<User> cmpAgeAsc = new UserByAgeAZ();
        int rsl = cmpAgeAsc.compare(new User("Костя", 3), new User("Костя", 50));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByAgeDescending() {
        Comparator<User> cmpAgeDes = new UserByAgeZA();
        int rsl = cmpAgeDes.compare(new User("Костя", 3), new User("Костя", 50));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCombinedComparatorByNameAscByAgeAsc() {
        Comparator<User> cmp = new UserByNameAZ().thenComparing(new UserByAgeAZ());
        int rsl = cmp.compare(new User("Костя", 88), new User("Лена", 5));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCombinedComparatorByAgeDescByNameAsc() {
        Comparator<User> cmp = new UserByAgeZA().thenComparing(new UserByNameAZ());
        int rsl = cmp.compare(new User("Анна", 70), new User("Лев", 70));
        assertThat(rsl, lessThan(0));
    }
}
