package kz.bitlab.bootcamp.db;

import java.util.ArrayList;

public class Users {
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User("A", "A", "A", 1000));
        users.add(new User("B", "B", "B", 2000));
        users.add(new User("C", "C", "C", 3000));
        users.add(new User("D", "D", "D", 4000));
    }

    public static void setUsers(ArrayList<User> users) {
        Users.users = users;
    }

    public static ArrayList<User> getUsers(){
        return users;
    }

    public static void addUser(User user){
        users.add(user);
    }
}
