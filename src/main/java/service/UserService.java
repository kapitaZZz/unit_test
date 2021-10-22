package service;

import model.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    private List<User> users;

    public UserService(List<User> listUser) {
        this.users = listUser;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public List<User> createNewUser(User user) {
        users.add(user);
        return users;
    }

    public void removeUser(String name) {
        users.remove(name);
    }
}
