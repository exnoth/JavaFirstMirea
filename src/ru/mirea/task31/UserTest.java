package ru.mirea.task31;
import org.junit.Assert;
import ru.mirea.task31.User.Sex;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {

    @org.junit.Test
    public void getAllUsers()
    {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getAllUsers_NO_NULL() {
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    }

    @org.junit.Test
    public void testGetAllUsers() {
    }

    @org.junit.Test
    public void getHowManyUsers() {
    }

    @org.junit.Test
    public void testGetHowManyUsers() {
    }

    @org.junit.Test
    public void getAllAgeUsers() {
    }

    @org.junit.Test
    public void testGetAllAgeUsers() {
    }

    @org.junit.Test
    public void getAverageAgeOfAllUsers() {
    }

    @org.junit.Test
    public void testGetAverageAgeOfAllUsers() {
    }
}